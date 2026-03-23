package com.codurance.training.tasks.use_cases;

import com.codurance.training.tasks.entities.TaskListModel;
import com.codurance.training.tasks.adaptor.TaskListView;

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
