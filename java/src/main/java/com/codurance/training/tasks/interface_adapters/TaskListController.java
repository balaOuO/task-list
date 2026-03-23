package com.codurance.training.tasks.interface_adapters;

import com.codurance.training.tasks.application.TaskListOutputBoundary;
import com.codurance.training.tasks.application.TaskListRepository;
import com.codurance.training.tasks.application.command.Command;
import com.codurance.training.tasks.application.exception.UserQuitException;

public class TaskListController {
    private final TaskListRepository taskListRepository;
    private final TaskListOutputBoundary taskListOutputBoundary;
    private final TaskListInputSource taskListInputSource;

    public TaskListController(TaskListRepository taskListRepository, TaskListOutputBoundary taskListOutputBoundary, TaskListInputSource taskListInputSource) {
        this.taskListRepository = taskListRepository;
        this.taskListOutputBoundary = taskListOutputBoundary;
        this.taskListInputSource = taskListInputSource;
    }

    public boolean run() {
        try {
            String userInputStr = taskListInputSource.readCommand();
            Command command = CommandFactory.create(userInputStr);
            command.execute(taskListRepository, taskListOutputBoundary);
        }
        catch (UserQuitException e) {
            return false;
        }
        return true;
    }
}
