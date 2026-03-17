package com.codurance.training.tasks;

public class ProjectNotFoundException extends RuntimeException {
    String projectName;
    public ProjectNotFoundException(String projectName) {
        this.projectName = projectName;
    }

    public String getProjectName() {
        return projectName;
    }
}
