package com.codurance.training.tasks.use_cases;

import com.codurance.training.tasks.entities.Task;

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
