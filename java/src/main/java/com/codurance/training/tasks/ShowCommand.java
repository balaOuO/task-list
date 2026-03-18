package com.codurance.training.tasks;

import java.util.List;

public class ShowCommand implements Command{
    @Override
    public void execute(TaskListModel model, TaskListView view) {
        List<ProjectDto> projects = model.getProjects();
        view.show(projects);
    }
}
