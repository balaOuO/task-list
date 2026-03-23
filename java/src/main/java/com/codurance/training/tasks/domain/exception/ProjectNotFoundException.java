package com.codurance.training.tasks.domain.exception;

public class ProjectNotFoundException extends Exception {
    String projectName;
    public ProjectNotFoundException(String projectName) {
        this.projectName = projectName;
    }

    public String getProjectName() {
        return projectName;
    }
}
