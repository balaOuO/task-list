package com.codurance.training.tasks;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TaskListModel {
    Set<Project> projects;
    long lastTaskId;

    public TaskListModel() {
        this.projects = new HashSet<>();
        this.lastTaskId = 0;
    }

    public void addProject(String name) {
        Project project = new Project(name);
        projects.add(project);
    }

    public void addTask(String projectName, String taskName) {
        List<Project> targetProjects = projects.stream().filter((p)->p.name.equals(projectName)).toList();
        if (targetProjects.isEmpty()) {
            throw new ProjectNotFoundException(projectName);
        }
        targetProjects.forEach((p) -> p.addTask(taskName, getAndUpdateLastTaskId()));
    }

    public void check(long taskId) {
        int checkNum = 0;
        for (Project project: projects) {
            checkNum += project.check(taskId);
        }
        if (checkNum == 0) {
            throw new TaskNotFoundException(taskId);
        }
    }

    public void unCheck(long taskId) {
        int checkNum = 0;
        for (Project project: projects) {
            checkNum += project.unCheck(taskId);
        }
        if (checkNum == 0) {
            throw new TaskNotFoundException(taskId);
        }
    }

    public List<ProjectDto> getProjects() {
        return projects.stream().map((p) -> new ProjectDto(p.getName(), p.getTasks())).toList();
    }

    private long getAndUpdateLastTaskId() {
        return ++lastTaskId;
    }
}
