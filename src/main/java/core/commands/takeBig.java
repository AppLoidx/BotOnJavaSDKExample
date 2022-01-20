package core.commands;

import com.vk.api.sdk.exceptions.ApiException;
import com.vk.api.sdk.exceptions.ClientException;
import com.vk.api.sdk.objects.messages.Message;
import core.Command;
import vk.VKManager;

public class takeBig extends Command {
    public takeBig(String name) {
        super(name);
    }

    @Override
    public void exec(Message message) throws ClientException, ApiException {
        new VKManager().sendKeyboard(message.getPeerId(), AskerKeyboard.keyboardAskerMore11(99, true), "Выберите направление");
    }
}
