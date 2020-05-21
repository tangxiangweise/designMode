package com.design.patterns.behavioral.command;

import java.util.ArrayList;
import java.util.List;

/**
 * @author tangxiangwei
 * @date 20/3/2
 */
public class Staff {

    private List<Command> commands = new ArrayList<>();

    public void addCommand(Command command) {
        commands.add(command);
    }

    public void executeCommands() {
        for (Command command : commands) {
            command.execute();
        }
        commands.clear();
    }
}
