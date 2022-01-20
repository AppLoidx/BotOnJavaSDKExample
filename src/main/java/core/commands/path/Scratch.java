package core.commands.path;

import com.vk.api.sdk.exceptions.ApiException;
import com.vk.api.sdk.exceptions.ClientException;
import com.vk.api.sdk.objects.messages.Message;
import core.Command;
import vk.VKManager;

public class Scratch extends Command {
    public Scratch(String name) {
        super(name);
    }

    @Override
    public void exec(Message message) throws ClientException, ApiException {
        new VKManager().sendMessage("Это специальная среда программирования, разработанная для детей. Она учит их грамотно строить свою последовательность действий (алгоритмы). Процесс программирования осуществляется в картинках. Результаты – свои игры и мультики.", message.getPeerId());
    }
}
