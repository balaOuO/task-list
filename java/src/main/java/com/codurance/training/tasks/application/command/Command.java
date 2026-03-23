package com.codurance.training.tasks.application.command;

import com.codurance.training.tasks.domain.TaskList;
import com.codurance.training.tasks.interface_adapters.TaskListView;

public interface Command {
    void execute(TaskList model, TaskListView view);
}
