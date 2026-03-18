package com.codurance.training.tasks;

public class AddProjectCommand implements Command{
    String projectName;

    public AddProjectCommand(String projectName) {
        this.projectName = projectName;
    }

    @Override
    public void execute(TaskListModel model, TaskListView view) {
        model.addProject(projectName);
    }
}
