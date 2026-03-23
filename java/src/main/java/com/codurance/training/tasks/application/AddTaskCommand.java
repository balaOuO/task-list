package com.codurance.training.tasks.application;

import com.codurance.training.tasks.domain.TaskList;
import com.codurance.training.tasks.interface_adapters.TaskListView;

public class AddTaskCommand implements Command {
    String projectName;
    String taskName;

    public AddTaskCommand(String projectName, String taskName) {
        this.projectName = projectName;
        this.taskName = taskName;
    }

    @Override
    public void execute(TaskList model, TaskListView view) {
        model.addTask(projectName, taskName);
    }
}
