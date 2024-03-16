package org.stepit.consoleshop.command;

import java.util.List;

public interface Command {

    /**
     * Виконує операцію над колекцією об'єктів з урахуванням додаткових параметрів
     * @param storage - колекція об'єктів
     * @param arguments - додаткові параметри
     */
    List<Object> doAction(List<Object> storage, String arguments);

}
