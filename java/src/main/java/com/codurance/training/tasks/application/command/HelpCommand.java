package com.codurance.training.tasks.application.command;

import com.codurance.training.tasks.application.TaskListOutputBoundary;
import com.codurance.training.tasks.application.TaskListRepository;

public class HelpCommand implements Command {

    @Override
    public void execute(TaskListRepository taskListRepository, TaskListOutputBoundary taskListOutputBoundary) {
        taskListOutputBoundary.presentHelp();
    }
}
