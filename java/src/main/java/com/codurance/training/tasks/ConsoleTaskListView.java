package com.codurance.training.tasks;

import java.io.PrintWriter;
import java.util.List;

public class ConsoleTaskListView implements TaskListView {
    PrintWriter out;
    public ConsoleTaskListView(PrintWriter out) {
        this.out = out;
    }

    @Override
    public void displayWhenStartInput() {
        out.print("> ");
        out.flush();
    }

    @Override
    public void displayHelp() {
        out.println("Commands:");
        out.println("  show");
        out.println("  add project <project name>");
        out.println("  add task <project name> <task description>");
        out.println("  check <task ID>");
        out.println("  uncheck <task ID>");
        out.println();
    }

    @Override
    public void show(List<ProjectDto> projects) {
        for (ProjectDto project: projects) {
            out.println(project.getName());
            for (TaskDto task: project.getTaskDtos()) {
                out.printf("    [%c] %d: %s%n", (task.isDone() ? 'x' : ' '), task.getId(), task.getDescription());
            }
            out.println();
        }
    }

    @Override
    public void displayErrorCommand(String errorCommand) {
        out.printf("I don't know what the command \"%s\" is.", errorCommand);
        out.println();
    }

    @Override
    public void displayErrorTask(long errorTaskId){
        out.printf("Could not find a task with an ID of %d.", errorTaskId);
        out.println();
    }

    @Override
    public void displayErrorProject(String errorProjectName) {
        out.printf("Could not find a project with the name \"%s\".", errorProjectName);
        out.println();
    }
}
