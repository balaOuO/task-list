package com.codurance.training.tasks.adaptor;

import com.codurance.training.tasks.entities.ProjectNotFoundException;
import com.codurance.training.tasks.entities.TaskListModel;
import com.codurance.training.tasks.entities.TaskNotFoundException;
import com.codurance.training.tasks.use_cases.Command;
import com.codurance.training.tasks.use_cases.ErrorCommandException;
import com.codurance.training.tasks.use_cases.UserQuitException;

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
