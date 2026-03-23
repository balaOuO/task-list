package com.codurance.training.tasks.use_cases;

import com.codurance.training.tasks.entities.TaskList;
import com.codurance.training.tasks.adaptor.TaskListView;

public class AddProjectCommand implements Command{
    String projectName;

    public AddProjectCommand(String projectName) {
        this.projectName = projectName;
    }

    @Override
    public void execute(TaskList model, TaskListView view) {
        model.addProject(projectName);
    }
}
