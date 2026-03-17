package com.codurance.training.tasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;

public class TaskListController {
    private final BufferedReader in;
    private final PrintWriter out;
    private final TaskListModel model;

    public TaskListController(BufferedReader in, PrintWriter out, TaskListModel model) {
        this.in = in;
        this.out = out;
        this.model = model;
    }

    public void run() {
        out.print("> ");
        out.flush();
        String command;
        try {
            command = in.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        if (command.equals("show")) {

        } else {
//            model.execute();
        }
    }
}
