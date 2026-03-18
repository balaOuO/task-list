package com.codurance.training.tasks;

import java.util.ArrayList;
import java.util.List;

public class Project {
    List<Task> taskList;
    String name;

    public Project(String name) {
        taskList = new ArrayList<>();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addTask(String description, long nextId) {
        Task newTask = new Task(nextId, description, false);
        taskList.add(newTask);
    }

    public List<TaskDto> getTasks() {
        return taskList.stream().map((t) -> new TaskDto(t.getId(), t.getDescription(), t.isDone())).toList();
    }

    public int check(long taskId) {
        return setDoneToTask(taskId, true);
    }

    public int unCheck(long taskId) {
        return setDoneToTask(taskId, false);
    }

    private int setDoneToTask(long taskId, boolean isDone) {
        int changeTasksCount = 0;
        for (Task task: taskList) {
            if (task.getId() == taskId) {
                task.setDone(isDone);
                changeTasksCount++;
            }
        }
        return changeTasksCount;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Project project = (Project) obj;
        return java.util.Objects.equals(name, project.name);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(name);
    }
}
