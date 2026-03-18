package com.codurance.training.tasks;

public class ErrorCommandException extends RuntimeException {
    String errorCommand;
    public ErrorCommandException(String errorCommand) {
        this.errorCommand =errorCommand;
    }

    public String getErrorCommand() {
        return errorCommand;
    }
}
