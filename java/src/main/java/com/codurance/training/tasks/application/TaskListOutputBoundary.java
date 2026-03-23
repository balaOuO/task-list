package com.codurance.training.tasks.application;

import com.codurance.training.tasks.application.dto.TaskListDto;

public interface TaskListOutputBoundary {
    void presentProjects(TaskListDto taskListDto);
    void presentTaskNotFound(long taskId);
    void presentProjectNotFound(String projectName);
    void presentUnknownCommand(String command);
    void presentHelp();
}
