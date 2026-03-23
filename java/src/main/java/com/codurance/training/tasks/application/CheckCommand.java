package com.codurance.training.tasks.application;

import com.codurance.training.tasks.domain.TaskList;
import com.codurance.training.tasks.interface_adapters.TaskListView;

public class CheckCommand implements Command{
    long taskId;

    public CheckCommand(long taskId) {
        this.taskId = taskId;
    }

    @Override
    public void execute(TaskList model, TaskListView view) {
        model.check(taskId);
    }
}
