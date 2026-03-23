package com.codurance.training.tasks.application.command;

import com.codurance.training.tasks.application.dto.ProjectDto;
import com.codurance.training.tasks.application.dto.ProjectMapper;
import com.codurance.training.tasks.domain.TaskList;
import com.codurance.training.tasks.interface_adapters.TaskListView;

import java.util.List;

public class ShowCommand implements Command {
    @Override
    public void execute(TaskList model, TaskListView view) {
        List<ProjectDto> projects = ProjectMapper.toDtos(model.getProjects());
        view.show(projects);
    }
}
