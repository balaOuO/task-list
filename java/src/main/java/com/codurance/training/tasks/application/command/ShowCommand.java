package com.codurance.training.tasks.application.command;

import com.codurance.training.tasks.application.TaskListOutputBoundary;
import com.codurance.training.tasks.application.TaskListRepository;
import com.codurance.training.tasks.application.dto.ProjectDto;
import com.codurance.training.tasks.application.dto.ProjectMapper;
import com.codurance.training.tasks.domain.TaskList;

import java.util.List;

public class ShowCommand implements Command {
    @Override
    public void execute(TaskListRepository taskListRepository, TaskListOutputBoundary taskListOutputBoundary) {
        TaskList taskList = taskListRepository.get();
        List<ProjectDto> projects = ProjectMapper.toDtos(taskList.getProjects());
        taskListOutputBoundary.presentProjects(projects);
    }
}
