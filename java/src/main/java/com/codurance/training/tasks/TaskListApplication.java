package com.codurance.training.tasks;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public final class TaskListApplication {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        TaskListView view = new TaskListView(out);
        TaskListModel model = new TaskListModel();
        TaskListController controller = new TaskListController(in, model, view);
        while (controller.run()) {
        }
    }
}
