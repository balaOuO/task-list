package com.codurance.training.tasks.application.command;

import com.codurance.training.tasks.application.TaskListOutputBoundary;
import com.codurance.training.tasks.application.TaskListRepository;
import com.codurance.training.tasks.application.dto.TaskListDto;
import com.codurance.training.tasks.application.dto.TaskListMapper;
import com.codurance.training.tasks.domain.TaskList;

public class ShowCommand implements Command {
    @Override
    public void execute(TaskListRepository taskListRepository, TaskListOutputBoundary taskListOutputBoundary) {
        TaskList taskList = taskListRepository.get();
        TaskListDto taskListDto = TaskListMapper.toDto(taskList);
        taskListOutputBoundary.presentProjects(taskListDto);
    }
}
