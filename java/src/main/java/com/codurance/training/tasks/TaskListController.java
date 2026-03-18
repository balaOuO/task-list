package com.codurance.training.tasks;

import java.io.BufferedReader;
import java.io.IOException;

public class TaskListController {
    private final BufferedReader in;
    private final TaskListModel model;
    private final TaskListView view;

    public TaskListController(BufferedReader in, TaskListModel model, TaskListView view) {
        this.in = in;
        this.model = model;
        this.view = view;
    }

    public boolean run() {
        try {
            view.displayWhenStartInput();
            String userInputStr;
            try {
                userInputStr = in.readLine();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            Command command = CommandFactory.create(userInputStr);
            command.execute(model, view);
        }
        catch (ErrorCommandException e) {
            view.displayErrorCommand(e.getErrorCommand());
        }
        catch (TaskNotFoundException e) {
            view.displayErrorTask(e.getTaskId());
        }
        catch (ProjectNotFoundException e) {
            view.displayErrorProject(e.getProjectName());
        }
        catch (UserQuitException e) {
            return false;
        }
        return true;
    }
}
