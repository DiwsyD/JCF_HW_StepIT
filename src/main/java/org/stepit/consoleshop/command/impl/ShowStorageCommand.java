package org.stepit.consoleshop.command.impl;

import org.stepit.consoleshop.command.Command;

import java.util.List;

public class ShowStorageCommand implements Command {

    //command message
    private final String message;

    //message description
    private final String description;

    public ShowStorageCommand(String message, String description) {
        this.message = message;
        this.description = description;
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
        System.out.println(message + storage.toString());
        return storage;
    }
}
