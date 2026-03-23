package com.codurance.training.tasks.adaptor;

import com.codurance.training.tasks.use_cases.ProjectDto;

import java.util.List;

public interface TaskListView {
    void displayWhenStartInput();
    void displayHelp();
    void show(List<ProjectDto> projects);
    void displayErrorCommand(String errorCommand);
    void displayErrorTask(long errorTaskId);
    void displayErrorProject(String errorProjectName);
}
