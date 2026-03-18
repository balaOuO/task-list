package com.codurance.training.tasks;

public class UserQuitException extends RuntimeException {
    public UserQuitException(String message) {
        super(message);
    }
}
