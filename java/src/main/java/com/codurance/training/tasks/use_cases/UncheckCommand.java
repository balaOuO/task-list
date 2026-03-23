package com.codurance.training.tasks.use_cases;

import com.codurance.training.tasks.entities.TaskListModel;
import com.codurance.training.tasks.adaptor.TaskListView;

public class UncheckCommand implements Command{
    long taskId;

    public UncheckCommand(long taskId) {
        this.taskId = taskId;
    }

    @Override
    public void execute(TaskListModel model, TaskListView view) {
        model.unCheck(taskId);
    }
}
