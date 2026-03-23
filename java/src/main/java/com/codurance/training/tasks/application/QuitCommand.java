package com.codurance.training.tasks.application;

import com.codurance.training.tasks.domain.TaskList;
import com.codurance.training.tasks.interface_adapters.TaskListView;

public class QuitCommand implements Command {

    @Override
    public void execute(TaskList model, TaskListView view) {
        throw new UserQuitException("quit");
    }
}
