package com.codurance.training.tasks.application.command;

import com.codurance.training.tasks.application.TaskListOutputBoundary;
import com.codurance.training.tasks.domain.TaskList;
import com.codurance.training.tasks.interface_adapters.TaskListView;

public class HelpCommand implements Command {

    @Override
    public void execute(TaskList model, TaskListOutputBoundary taskListOutputBoundary) {
        taskListOutputBoundary.presentHelp();
    }
}
