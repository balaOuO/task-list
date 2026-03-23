package com.codurance.training.tasks.use_cases;

import com.codurance.training.tasks.entities.TaskListModel;
import com.codurance.training.tasks.adaptor.TaskListView;

import java.util.List;

public class ShowCommand implements Command{
    @Override
    public void execute(TaskListModel model, TaskListView view) {
        List<ProjectDto> projects = model.getProjects();
        view.show(projects);
    }
}
