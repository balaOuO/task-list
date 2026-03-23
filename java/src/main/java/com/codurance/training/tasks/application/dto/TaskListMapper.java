package com.codurance.training.tasks.application.dto;

import com.codurance.training.tasks.domain.TaskList;

public class TaskListMapper {
    public static TaskListDto toDto(TaskList taskList) {
        return new TaskListDto(
                ProjectMapper.toDtos(taskList.getProjects())
        );
    }
}
