package com.example.onlinebookstoremy.bookstore.service;

import com.example.onlinebookstoremy.bookstore.domain.entity.Role;
import com.example.onlinebookstoremy.bookstore.domain.entity.User;
import com.example.onlinebookstoremy.bookstore.domain.repository.RoleRepository;
import com.example.onlinebookstoremy.bookstore.domain.repository.UserRepository;
import com.example.onlinebookstoremy.bookstore.dto.request.UserRegistrationRequestDto;
import com.example.onlinebookstoremy.bookstore.dto.response.UserResponseDto;
import com.example.onlinebookstoremy.bookstore.exception.RegistrationException;
import com.example.onlinebookstoremy.bookstore.mapper.UserMapper;
import java.util.Set;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private static final Role.RoleName DEFAULT_ROLE = Role.RoleName.USER;
    private final UserRepository userRepository;
    private final UserMapper userMapper;
    private final PasswordEncoder passwordEncoder;
    private final RoleRepository roleRepository;

    @Override
    public UserResponseDto register(UserRegistrationRequestDto userRegistrationRequestDto) {
        if (userRepository.existsByEmail(userRegistrationRequestDto.getEmail())) {
            throw new RegistrationException("User already exists");
        }
        User user = userMapper.toModel(userRegistrationRequestDto);
        user.setPassword(passwordEncoder.encode(userRegistrationRequestDto.getPassword()));
        user.setRoles(Set.of(roleRepository.findByRoleName(DEFAULT_ROLE)));
        return userMapper.toDto(userRepository.save(user));
    }
}
