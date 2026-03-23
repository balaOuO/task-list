package com.codurance.training.tasks.use_cases;

import com.codurance.training.tasks.entities.TaskList;
import com.codurance.training.tasks.adaptor.TaskListView;

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
