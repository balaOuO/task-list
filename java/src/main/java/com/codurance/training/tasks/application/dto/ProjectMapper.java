package com.codurance.training.tasks.application.dto;

import com.codurance.training.tasks.domain.Project;

import java.util.List;

public class ProjectMapper {
    public static List<ProjectDto> toDtos(List<Project> projects) {
        return projects.stream().map(ProjectMapper::toDto).toList();
    }

    public static ProjectDto toDto(Project project) {
        return new ProjectDto(
                project.getName(),
                TaskMapper.toDtos(project.getTasks())
        );
    }
}
