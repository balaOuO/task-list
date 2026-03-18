package com.codurance.training.tasks;

public class CheckCommand implements Command{
    long taskId;

    public CheckCommand(long taskId) {
        this.taskId = taskId;
    }

    @Override
    public void execute(TaskListModel model, TaskListView view) {
        model.check(taskId);
    }
}
