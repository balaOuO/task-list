package com.codurance.training.tasks;

import com.codurance.training.tasks.application.TaskListOutputBoundary;
import com.codurance.training.tasks.application.TaskListRepository;
import com.codurance.training.tasks.interface_adapters.TaskListController;
import com.codurance.training.tasks.interface_adapters.TaskListInputSource;
import com.codurance.training.tasks.interface_adapters.TaskListPresenter;
import com.codurance.training.tasks.interface_adapters.TaskListView;
import com.codurance.training.tasks.io.TaskListConsoleInputSource;
import com.codurance.training.tasks.io.TaskListConsoleView;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public final class TaskListApplication {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        TaskListView view = new TaskListConsoleView(out);
        TaskListInputSource taskListInputSource = new TaskListConsoleInputSource(in, out);

        TaskListOutputBoundary taskListOutputBoundary = new TaskListPresenter(view);
        TaskListRepository taskListRepository = new TaskListRepository();
        TaskListController controller = new TaskListController(taskListRepository, taskListOutputBoundary, taskListInputSource);
        while (controller.run()) {
        }
    }
}
