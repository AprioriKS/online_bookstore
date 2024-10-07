package com.example.onlinebookstoremy.bookstore.exception;

public class RegistrationException extends RuntimeException {
    public RegistrationException(String message) {
        super(message);
    }

    public RegistrationException(String message, Throwable e) {
        super(message, e);
    }
}
