package com.codurance.training.tasks.application.command;

import com.codurance.training.tasks.application.TaskListOutputBoundary;
import com.codurance.training.tasks.domain.TaskList;

public interface Command {
    void execute(TaskList taskList, TaskListOutputBoundary taskListOutputBoundary);
}
