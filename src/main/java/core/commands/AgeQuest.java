package core.commands;

import com.vk.api.sdk.exceptions.ApiException;
import com.vk.api.sdk.exceptions.ClientException;
import com.vk.api.sdk.objects.messages.Message;
import core.Command;
import vk.VKManager;

public class AgeQuest extends Command {
    public AgeQuest(String name) {
        super(name);
    }

    @Override
    public void exec(Message message) throws ClientException, ApiException {
        new VKManager().sendMessage("В нашей школе проходят занятия для детей от 4 лет и взрослых.", message.getPeerId());
        new VKManager().sendKeyboard(message.getPeerId(), AskerKeyboard.keyboardChooseAge(), "Какие курсы вас интересуют?");
    }
}
