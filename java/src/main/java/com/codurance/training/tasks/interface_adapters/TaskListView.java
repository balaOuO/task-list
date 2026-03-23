package com.codurance.training.tasks.interface_adapters;

import com.codurance.training.tasks.application.dto.ProjectDto;

import java.util.List;

public interface TaskListView {
    void displayWhenStartInput();
    void displayHelp();
    void show(List<ProjectDto> projects);
    void displayErrorCommand(String errorCommand);
    void displayErrorTask(long errorTaskId);
    void displayErrorProject(String errorProjectName);
}
