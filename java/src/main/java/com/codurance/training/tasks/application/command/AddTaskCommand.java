package com.codurance.training.tasks.application.command;

import com.codurance.training.tasks.application.TaskListOutputBoundary;
import com.codurance.training.tasks.application.TaskListRepository;
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
    public void execute(TaskListRepository taskListRepository, TaskListOutputBoundary taskListOutputBoundary) {
        try {
            TaskList taskList = taskListRepository.get();
            taskList.addTask(projectName, taskName);
            taskListRepository.save(taskList);
        } catch (ProjectNotFoundException e) {
            taskListOutputBoundary.presentProjectNotFound(e.getProjectName());
        }
    }
}
