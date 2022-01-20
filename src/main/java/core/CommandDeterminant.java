package core;

import com.vk.api.sdk.exceptions.ApiException;
import com.vk.api.sdk.exceptions.ClientException;
import com.vk.api.sdk.objects.messages.Message;
import core.commands.AddNew;
import core.commands.MassiveSender;
import core.commands.Unknown;
import vk.VKManager;

import java.util.Collection;

/**
 * Определяет команду
 *
 * @author Артур Куприянов
 * @version 1.1.0
 */
public class CommandDeterminant {


    public static Command getCommand(Collection<Command> commands, Message message) throws ClientException, ApiException {
        String body = message.getText();

        for (Command command : commands
        ) {
            if ("добавить".equalsIgnoreCase(body.split(" ")[0])){
                return new AddNew(body);
            }
            if ("рассылка".equalsIgnoreCase(body.split(":")[0])){
                try {
                    return new MassiveSender(body.split(":")[1]);
                } catch (Exception e){
                    new VKManager().sendMessage("Вид сообщения для рассылки: \n Рассылка:Сообщение для всех", message.getFromId());
                    return null;
                }
            }
                if (command.name.equalsIgnoreCase(body.toString())) {
                    return command;
                }
        }

        return new Unknown("unknown");
    }

}
