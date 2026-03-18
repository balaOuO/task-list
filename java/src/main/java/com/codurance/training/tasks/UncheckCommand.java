package com.codurance.training.tasks;

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
