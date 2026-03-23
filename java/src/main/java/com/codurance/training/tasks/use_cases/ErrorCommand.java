package com.codurance.training.tasks.use_cases;

import com.codurance.training.tasks.entities.TaskList;
import com.codurance.training.tasks.adaptor.TaskListView;

public class ErrorCommand implements Command {
    String errorCommand;
    public ErrorCommand(String errorCommand) {
        this.errorCommand = errorCommand;
    }

    @Override
    public void execute(TaskList model, TaskListView view) {
        throw new ErrorCommandException(errorCommand);
    }
}
