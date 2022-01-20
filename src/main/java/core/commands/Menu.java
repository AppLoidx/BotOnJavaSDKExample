package core.commands;

import com.vk.api.sdk.exceptions.ApiException;
import com.vk.api.sdk.exceptions.ClientException;
import com.vk.api.sdk.objects.messages.Message;
import core.Command;
import vk.VKManager;

public class Menu extends Command {
    public Menu(String name) {
        super(name);
    }

    @Override
    public void exec(Message message) throws ClientException, ApiException {
        new VKManager().sendKeyboard(message.getPeerId(), AskerKeyboard.getKeyMenu(), "Выберите интересующую Вас информацию");
    }
}
