package com.codurance.training.tasks;

public class QuitCommand implements Command {

    @Override
    public void execute(TaskListModel model, TaskListView view) {
        throw new UserQuitException("quit");
    }
}
