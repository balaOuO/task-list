package com.codurance.training.tasks.interface_adapters;

import com.codurance.training.tasks.application.dto.TaskListDto;

public interface TaskListView {
    void displayHelp();
    void show(TaskListDto taskListDto);
    void displayErrorCommand(String errorCommand);
    void displayErrorTask(long errorTaskId);
    void displayErrorProject(String errorProjectName);
}
