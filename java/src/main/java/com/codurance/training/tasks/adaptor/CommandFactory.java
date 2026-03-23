package com.codurance.training.tasks.adaptor;

import com.codurance.training.tasks.use_cases.*;

public class CommandFactory {
    public static Command create(String userInputStr) {
        String[] commandRest = userInputStr.split(" ", 2);
        String command = commandRest[0];
        return switch (command) {
            case "add" -> handleAddSubCommand(commandRest[1]);
            case "check" -> new CheckCommand(Long.parseLong(commandRest[1]));
            case "uncheck" -> new UncheckCommand(Long.parseLong(commandRest[1]));
            case "help" -> new HelpCommand();
            case "show" -> new ShowCommand();
            case "quit" -> new QuitCommand();
            default -> new ErrorCommand(command);
        };
    }

    private static Command handleAddSubCommand(String commandRest) {
        String[] subcommandRest = commandRest.split(" ", 2);
        String subcommand = subcommandRest[0];
        if (subcommand.equals("project")) {
            return new AddProjectCommand(subcommandRest[1]);
        } else if (subcommand.equals("task")) {
            String[] projectTask = subcommandRest[1].split(" ", 2);
            return new AddTaskCommand(projectTask[0], projectTask[1]);
        } else {
            throw new RuntimeException(commandRest);
        }
    }
}
