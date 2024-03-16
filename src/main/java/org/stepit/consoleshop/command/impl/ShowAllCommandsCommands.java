package org.stepit.consoleshop.command.impl;

import org.stepit.consoleshop.command.Command;

import java.util.List;
import java.util.Set;

public class ShowAllCommandsCommands implements Command {

    //command message
    private final String message;

    //message description
    private final String description;

    private final Set<String> allCommands;

    public ShowAllCommandsCommands(String message, String description, Set<String> allCommands) {
        this.message = message;
        this.description = description;
        this.allCommands = allCommands;
    }

    public String getMessage() {
        return message;
    }

    public String getDescription() {
        return description;
    }

    /**
     * Prints message and objects storage as an output to console
     * @param storage - object collection
     * @param arguments - additional arguments
     */
    @Override
    public List<Object> doAction(List<Object> storage, String arguments) {
        System.out.println(message + allCommands.toString());
        return storage;
    }
}
