package com.codurance.training.tasks.interface_adapters;

import com.codurance.training.tasks.application.TaskListOutputBoundary;
import com.codurance.training.tasks.application.dto.TaskListDto;

public class TaskListPresenter implements TaskListOutputBoundary {
    private final TaskListView view;
    public TaskListPresenter(TaskListView view) {
        this.view = view;
    }

    @Override
    public void presentProjects(TaskListDto taskListDto) {
        view.show(taskListDto);
    }

    @Override
    public void presentTaskNotFound(long taskId) {
        view.displayErrorTask(taskId);
    }

    @Override
    public void presentProjectNotFound(String projectName) {
        view.displayErrorProject(projectName);
    }

    @Override
    public void presentUnknownCommand(String command) {
        view.displayErrorCommand(command);
    }

    @Override
    public void presentHelp() {
        view.displayHelp();
    }
}
