package core;

import core.commands.Unknown;
import core.commands.Weather;

import java.util.HashSet;

/**
 * @author Arthur Kupriyanov
 */
public class CommandManager {
    private static HashSet<Command> commands = new HashSet<>();

    static {
        commands.add(new Unknown("unknown"));
        commands.add(new Weather("weather"));

    }

    public static HashSet<Command> getCommands(){
        return commands;
    }
    public static void addCommand(Command command) { commands.add(command);}
}
