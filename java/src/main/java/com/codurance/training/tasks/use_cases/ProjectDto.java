package com.codurance.training.tasks.use_cases;

import java.util.List;

public class ProjectDto {
    String name;
    List<TaskDto> taskDtos;

    public ProjectDto(String name, List<TaskDto> taskDtos) {
        this.name = name;
        this.taskDtos = taskDtos;
    }

    public String getName() {
        return name;
    }

    public List<TaskDto> getTaskDtos() {
        return taskDtos;
    }
}
