package com.codurance.training.tasks.io;

import com.codurance.training.tasks.interface_adapters.TaskListInputSource;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;

public class TaskListConsoleInputSource implements TaskListInputSource {
    private final BufferedReader in;
    private final PrintWriter out;

    public TaskListConsoleInputSource(BufferedReader in, PrintWriter out) {
        this.in = in;
        this.out = out;
    }

    @Override
    public String readCommand() {
        out.print("> ");
        out.flush();
        String userInputStr;
        try {
            userInputStr = in.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return userInputStr;
    }
}
