package core;

import com.vk.api.sdk.exceptions.ApiException;
import com.vk.api.sdk.exceptions.ClientException;
import com.vk.api.sdk.objects.messages.Message;

public class Commander {

    /**
     * Обработка сообщений, получаемых через сервис Вконтакте. Имеет ряд дополнительной информации.
     * @param message сообщение (запрос) пользователя
     */
    public static void execute(Message message) throws ClientException, ApiException {
        CommandDeterminant.getCommand(CommandManager.getCommands(), message).exec(message);
    }

}
