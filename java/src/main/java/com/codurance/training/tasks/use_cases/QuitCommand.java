package com.codurance.training.tasks.use_cases;

import com.codurance.training.tasks.entities.TaskListModel;
import com.codurance.training.tasks.adaptor.TaskListView;

public class QuitCommand implements Command {

    @Override
    public void execute(TaskListModel model, TaskListView view) {
        throw new UserQuitException("quit");
    }
}
