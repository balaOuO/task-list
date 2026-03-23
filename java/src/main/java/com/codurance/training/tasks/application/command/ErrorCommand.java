package com.codurance.training.tasks.application.command;

import com.codurance.training.tasks.application.TaskListOutputBoundary;
import com.codurance.training.tasks.application.exception.ErrorCommandException;
import com.codurance.training.tasks.domain.TaskList;
import com.codurance.training.tasks.interface_adapters.TaskListView;

public class ErrorCommand implements Command {
    String errorCommand;
    public ErrorCommand(String errorCommand) {
        this.errorCommand = errorCommand;
    }

    @Override
    public void execute(TaskList model, TaskListOutputBoundary taskListOutputBoundary) {
        taskListOutputBoundary.presentUnknownCommand(errorCommand);
    }
}
