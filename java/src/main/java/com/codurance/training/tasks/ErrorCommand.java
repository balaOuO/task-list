package com.codurance.training.tasks;

public class ErrorCommand implements Command {
    String errorCommand;
    public ErrorCommand(String errorCommand) {
        this.errorCommand = errorCommand;
    }

    @Override
    public void execute(TaskListModel model, TaskListView view) {
        throw new ErrorCommandException(errorCommand);
    }
}
