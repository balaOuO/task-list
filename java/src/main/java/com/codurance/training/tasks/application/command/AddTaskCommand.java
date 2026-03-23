package com.codurance.training.tasks.application.command;

import com.codurance.training.tasks.application.TaskListOutputBoundary;
import com.codurance.training.tasks.domain.TaskList;
import com.codurance.training.tasks.domain.exception.ProjectNotFoundException;

public class AddTaskCommand implements Command {
    String projectName;
    String taskName;

    public AddTaskCommand(String projectName, String taskName) {
        this.projectName = projectName;
        this.taskName = taskName;
    }

    @Override
    public void execute(TaskList taskList, TaskListOutputBoundary taskListOutputBoundary) {
        try {
            taskList.addTask(projectName, taskName);
        } catch (ProjectNotFoundException e) {
            taskListOutputBoundary.presentProjectNotFound(e.getProjectName());
        }
    }
}
