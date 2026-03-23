package com.codurance.training.tasks.application;

import com.codurance.training.tasks.application.dto.ProjectDto;

import java.util.List;

public interface TaskListOutputBoundary {
    void presentProjects(List<ProjectDto> projectDtos);
    void presentTaskNotFound(long taskId);
    void presentProjectNotFound(String projectName);
    void presentUnknownCommand(String command);
    void presentHelp();
}
