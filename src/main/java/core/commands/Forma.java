package core.commands;

import com.vk.api.sdk.exceptions.ApiException;
import com.vk.api.sdk.exceptions.ClientException;
import com.vk.api.sdk.objects.messages.Message;
import core.Command;
import vk.VKManager;

public class Forma extends Command {
    public Forma(String name) {
        super(name);
    }

    @Override
    public void exec(Message message) throws ClientException, ApiException {
        new VKManager().sendMessage("Групповые занятия по 4-10 человек (В зависимости от направления), также имеются индивидуальные занятия.", message.getPeerId());
    }
}
