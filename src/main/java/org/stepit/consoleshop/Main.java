package org.stepit.consoleshop;

import org.stepit.consoleshop.command.Command;
import org.stepit.consoleshop.command.impl.ShowAllCommandsCommands;
import org.stepit.consoleshop.command.impl.ShowStorageCommand;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Command showStorageCommand =
                new ShowStorageCommand("Here is the storage: ", "- Shows what is in storage.");

        List<Object> storage = List.of("one", "two");
        showStorageCommand.doAction(storage, "");

        Set<String> commands = new LinkedHashSet<>(List.of("ShowStorage", "CreateNewObject", "...", "Exit"));

        Command showAllCommandsCommand =
                new ShowAllCommandsCommands("Menu: ", "Shows all available commands", commands);
        showAllCommandsCommand.doAction(storage, "");
    }

}
