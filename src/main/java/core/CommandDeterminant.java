package core;

import com.vk.api.sdk.objects.messages.Message;
import core.commands.Unknown;

import java.util.Collection;

/**
 * Определяет команду
 *
 * @author Артур Куприянов
 * @version 1.1.0
 */
public class CommandDeterminant {


    public static Command getCommand(Collection<Command> commands, Message message) {
        String body = message.getBody();

        for (Command command : commands
        ) {
                if (command.name.equals(body.split(" ")[0])) {
                    return command;
                }
        }

        return new Unknown("unknown");
    }

}
