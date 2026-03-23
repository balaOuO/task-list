package com.codurance.training.tasks.application.command;

import com.codurance.training.tasks.domain.TaskList;
import com.codurance.training.tasks.interface_adapters.TaskListView;

public class AddProjectCommand implements Command {
    String projectName;

    public AddProjectCommand(String projectName) {
        this.projectName = projectName;
    }

    @Override
    public void execute(TaskList model, TaskListView view) {
        model.addProject(projectName);
    }
}
