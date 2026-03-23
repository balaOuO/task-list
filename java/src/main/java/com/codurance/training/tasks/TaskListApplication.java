package com.codurance.training.tasks;

import com.codurance.training.tasks.IO.ConsoleTaskListView;
import com.codurance.training.tasks.adaptor.TaskListController;
import com.codurance.training.tasks.adaptor.TaskListView;
import com.codurance.training.tasks.entities.TaskListModel;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public final class TaskListApplication {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        TaskListView view = new ConsoleTaskListView(out);
        TaskListModel model = new TaskListModel();
        TaskListController controller = new TaskListController(in, model, view);
        while (controller.run()) {
        }
    }
}
