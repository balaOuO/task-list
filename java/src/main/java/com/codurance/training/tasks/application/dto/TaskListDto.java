package com.codurance.training.tasks.application.dto;

import java.util.List;

public class TaskListDto {
    List<ProjectDto> projectDtos;

    public TaskListDto(List<ProjectDto> projectDtos) {
        this.projectDtos = projectDtos;
    }

    public List<ProjectDto> getProjectDtos() {
        return projectDtos;
    }
}
