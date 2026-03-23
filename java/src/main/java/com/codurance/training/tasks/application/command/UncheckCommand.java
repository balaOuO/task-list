package com.codurance.training.tasks.application.command;

import com.codurance.training.tasks.application.TaskListOutputBoundary;
import com.codurance.training.tasks.application.TaskListRepository;
import com.codurance.training.tasks.domain.TaskList;
import com.codurance.training.tasks.domain.exception.TaskNotFoundException;

public class UncheckCommand implements Command {
    long taskId;

    public UncheckCommand(long taskId) {
        this.taskId = taskId;
    }

    @Override
    public void execute(TaskListRepository taskListRepository, TaskListOutputBoundary taskListOutputBoundary) {
        try {
            TaskList taskList = taskListRepository.get();
            taskList.unCheck(taskId);
            taskListRepository.save(taskList);
        } catch (TaskNotFoundException e) {
            taskListOutputBoundary.presentTaskNotFound(e.getTaskId());
        }
    }
}
