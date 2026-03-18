package com.codurance.training.tasks;

import java.io.PrintWriter;
import java.util.List;

public class TaskListView {
    PrintWriter out;
    public TaskListView(PrintWriter out) {
        this.out = out;
    }

    public void displayWhenStartInput() {
        out.print("> ");
        out.flush();
    }

    public void displayHelp() {
        out.println("Commands:");
        out.println("  show");
        out.println("  add project <project name>");
        out.println("  add task <project name> <task description>");
        out.println("  check <task ID>");
        out.println("  uncheck <task ID>");
        out.println();
    }

    public void show(List<ProjectDto> projects) {
        for (ProjectDto project: projects) {
            out.println(project.getName());
            for (TaskDto task: project.getTaskDtos()) {
                out.printf("    [%c] %d: %s%n", (task.isDone() ? 'x' : ' '), task.getId(), task.getDescription());
            }
            out.println();
        }
    }

    public void displayErrorCommand(String errorCommand) {
        out.printf("I don't know what the command \"%s\" is.", errorCommand);
        out.println();
    }

    public void displayErrorTask(long errorTaskId){
        out.printf("Could not find a task with an ID of %d.", errorTaskId);
        out.println();
    }

    public void displayErrorProject(String errorProjectName) {
        out.printf("Could not find a project with the name \"%s\".", errorProjectName);
        out.println();
    }
}
