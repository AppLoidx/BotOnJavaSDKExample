package core.commands;

import com.vk.api.sdk.exceptions.ApiException;
import com.vk.api.sdk.exceptions.ClientException;
import com.vk.api.sdk.objects.messages.Message;
import core.Command;
import vk.VKManager;

public class Places extends Command {
    public Places(String name) {
        super(name);
    }

    @Override
    public void exec(Message message) throws ClientException, ApiException {
        new VKManager().sendMessage("-Тольятти: Автозаводский район \n -Тольятти: Центральный район \n -Тольятти: Комсомольский район \n -Самара \n -Дистант", message.getPeerId());
    }
}
