package com.codurance.training.tasks;

public class HelpCommand implements Command{

    @Override
    public void execute(TaskListModel model, TaskListView view) {
        view.displayHelp();
    }
}
