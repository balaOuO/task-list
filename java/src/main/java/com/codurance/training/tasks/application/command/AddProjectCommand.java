package com.codurance.training.tasks.application.command;

import com.codurance.training.tasks.application.TaskListOutputBoundary;
import com.codurance.training.tasks.application.TaskListRepository;
import com.codurance.training.tasks.domain.TaskList;

public class AddProjectCommand implements Command {
    String projectName;

    public AddProjectCommand(String projectName) {
        this.projectName = projectName;
    }

    @Override
    public void execute(TaskListRepository taskListRepository, TaskListOutputBoundary taskListOutputBoundary) {
        TaskList taskList = taskListRepository.get();
        taskList.addProject(projectName);
        taskListRepository.save(taskList);
    }
}
