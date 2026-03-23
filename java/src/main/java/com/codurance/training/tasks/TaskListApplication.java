package com.codurance.training.tasks;

import com.codurance.training.tasks.io.ConsoleTaskListView;
import com.codurance.training.tasks.interface_adapters.TaskListController;
import com.codurance.training.tasks.interface_adapters.TaskListView;
import com.codurance.training.tasks.domain.TaskList;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public final class TaskListApplication {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        TaskListView view = new ConsoleTaskListView(out);
        TaskList model = new TaskList();
        TaskListController controller = new TaskListController(in, model, view);
        while (controller.run()) {
        }
    }
}
