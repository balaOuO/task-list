package com.codurance.training.tasks.interface_adapters;

import com.codurance.training.tasks.application.TaskListOutputBoundary;
import com.codurance.training.tasks.application.command.Command;
import com.codurance.training.tasks.application.exception.UserQuitException;
import com.codurance.training.tasks.domain.TaskList;

public class TaskListController {
    private final TaskList model;
    private final TaskListOutputBoundary taskListOutputBoundary;
    private final TaskListInputSource taskListInputSource;

    public TaskListController(TaskList model, TaskListOutputBoundary taskListOutputBoundary, TaskListInputSource taskListInputSource) {
        this.model = model;
        this.taskListOutputBoundary = taskListOutputBoundary;
        this.taskListInputSource = taskListInputSource;
    }

    public boolean run() {
        try {
            String userInputStr = taskListInputSource.readCommand();
            Command command = CommandFactory.create(userInputStr);
            command.execute(model, taskListOutputBoundary);
        }
        catch (UserQuitException e) {
            return false;
        }
        return true;
    }
}
