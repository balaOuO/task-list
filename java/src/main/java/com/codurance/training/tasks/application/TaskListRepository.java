package com.codurance.training.tasks.application;

import com.codurance.training.tasks.domain.TaskList;

public class TaskListRepository {
    private TaskList taskList;

    public TaskListRepository() {
        this.taskList = new TaskList();
    }

    public TaskList get() {
        return taskList;
    }

    public void save(TaskList taskList){
        this.taskList = taskList;
    }
}
