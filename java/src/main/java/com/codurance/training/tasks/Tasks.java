package com.codurance.training.tasks;

import java.util.ArrayList;
import java.util.List;

public class Tasks {
    List<Task> taskList;
    int lastId;
    public Tasks() {
        taskList = new ArrayList<>();
        lastId = 0;
    }

    public void addTask(String description) {
        Task newTask = new Task(nextId(), description, false);
        taskList.add(newTask);
    }

    public List<TaskDto> getTasks() {
        return taskList.stream().map((t) -> new TaskDto(t.getId(), t.getDescription(), t.isDone())).toList();
    }

    public int check(int id) {
        return setDoneToTask(id, true);
    }

    public int unCheck(int id) {
        return setDoneToTask(id, false);
    }

    private int setDoneToTask(int id, boolean done) {
        int changeTasksCount = 0;
        for (Task task: taskList) {
            if (task.getId() == id) {
                task.setDone(done);
                changeTasksCount++;
            }
        }
        return changeTasksCount;
    }

    private int nextId() {
        return ++lastId;
    }
}
