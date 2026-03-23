package com.codurance.training.tasks.application.exception;

public class UserQuitException extends RuntimeException {
    public UserQuitException(String message) {
        super(message);
    }
}
