package com.codurance.training.tasks.application.command;

import com.codurance.training.tasks.application.TaskListOutputBoundary;
import com.codurance.training.tasks.application.exception.UserQuitException;
import com.codurance.training.tasks.domain.TaskList;

public class QuitCommand implements Command {

    @Override
    public void execute(TaskList taskList, TaskListOutputBoundary taskListOutputBoundary) {
        throw new UserQuitException("quit");
    }
}
