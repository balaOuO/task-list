package com.codurance.training.tasks.use_cases;

import com.codurance.training.tasks.entities.TaskList;
import com.codurance.training.tasks.adaptor.TaskListView;

public class HelpCommand implements Command{

    @Override
    public void execute(TaskList model, TaskListView view) {
        view.displayHelp();
    }
}
