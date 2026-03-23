package com.codurance.training.tasks.application;

public class UserQuitException extends RuntimeException {
    public UserQuitException(String message) {
        super(message);
    }
}
