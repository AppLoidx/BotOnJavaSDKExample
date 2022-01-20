package core.commands.path;

import com.vk.api.sdk.exceptions.ApiException;
import com.vk.api.sdk.exceptions.ClientException;
import com.vk.api.sdk.objects.messages.Message;
import core.Command;
import vk.VKManager;

public class Him extends Command {
    public Him(String name) {
        super(name);
    }

    @Override
    public void exec(Message message) throws ClientException, ApiException {
        new VKManager().sendMessage("Цели курса Экспериментальная химия:\n" +
                "•На практике дать представление детям о мире химии \n" +
                "•В доступном виде рассказать об основных понятиях и разделах науки\n" +
                "•Научить детей основным навыкам работы в лаборатории.", message.getPeerId());
    }
}
