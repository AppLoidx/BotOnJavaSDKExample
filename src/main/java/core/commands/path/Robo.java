package core.commands.path;

import com.vk.api.sdk.exceptions.ApiException;
import com.vk.api.sdk.exceptions.ClientException;
import com.vk.api.sdk.objects.messages.Message;
import core.Command;
import vk.VKManager;

public class Robo extends Command {
    public Robo(String name) {
        super(name);
    }

    @Override
    public void exec(Message message) throws ClientException, ApiException {
        new VKManager().sendMessage("На данной программе мы изучаем микроконтроллер на базе Ардуино, программирование на языке с++, основные электронные компоненты (именно то, из чего собираются современные бытовые устройства). Собираем элементы \"умного дома\" и роботов", message.getPeerId());
    }
}
