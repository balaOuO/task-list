package com.codurance.training.tasks;

public interface Command {
    void execute(TaskListModel model, TaskListView view);
}
