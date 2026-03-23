package com.codurance.training.tasks.application.command;

import com.codurance.training.tasks.application.TaskListOutputBoundary;
import com.codurance.training.tasks.application.TaskListRepository;

public interface Command {
    void execute(TaskListRepository taskListRepository, TaskListOutputBoundary taskListOutputBoundary);
}
