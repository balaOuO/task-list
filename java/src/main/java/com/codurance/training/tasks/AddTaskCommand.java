package com.codurance.training.tasks;

public class AddTaskCommand implements Command {
    String projectName;
    String taskName;

    public AddTaskCommand(String projectName, String taskName) {
        this.projectName = projectName;
        this.taskName = taskName;
    }

    @Override
    public void execute(TaskListModel model, TaskListView view) {
        model.addTask(projectName, taskName);
    }
}
