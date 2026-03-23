package com.codurance.training.tasks.application;

import com.codurance.training.tasks.domain.Task;

import java.util.List;

public class TaskMapper {
    public static List<TaskDto> toDtos(List<Task> tasks) {
        return tasks.stream().map(TaskMapper::toDto).toList();
    }

    public static TaskDto toDto(Task task) {
        return new TaskDto(
                task.getId(),
                task.getDescription(),
                task.isDone()
        );
    }
}
