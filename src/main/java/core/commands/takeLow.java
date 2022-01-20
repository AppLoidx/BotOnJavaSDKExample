package core.commands;

import com.vk.api.sdk.exceptions.ApiException;
import com.vk.api.sdk.exceptions.ClientException;
import com.vk.api.sdk.objects.messages.Message;
import core.Command;
import vk.VKManager;

public class takeLow extends Command {
    public takeLow(String name) {
        super(name);
    }

    @Override
    public void exec(Message message) throws ClientException, ApiException {
        new VKManager().sendKeyboard(message.getPeerId(), AskerKeyboard.keyboardAskerLess7(true), "Выберите направление");
    }
}
