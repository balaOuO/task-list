package com.codurance.training.tasks.application;

import com.codurance.training.tasks.domain.TaskList;
import com.codurance.training.tasks.interface_adapters.TaskListView;

public class UncheckCommand implements Command{
    long taskId;

    public UncheckCommand(long taskId) {
        this.taskId = taskId;
    }

    @Override
    public void execute(TaskList model, TaskListView view) {
        model.unCheck(taskId);
    }
}
