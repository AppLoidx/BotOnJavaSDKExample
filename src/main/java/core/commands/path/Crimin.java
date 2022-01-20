package core.commands.path;

import com.vk.api.sdk.exceptions.ApiException;
import com.vk.api.sdk.exceptions.ClientException;
import com.vk.api.sdk.objects.messages.Message;
import core.Command;
import vk.VKManager;

public class Crimin extends Command {
    public Crimin(String name) {
        super(name);
    }

    @Override
    public void exec(Message message) throws ClientException, ApiException {
        new VKManager().sendMessage("Программа «Юный криминалист» предназначена для тех, кто собирается связать свою жизнь с правоохранительными органами, научиться работать в лаборатории, развить в себе способности настоящего криминалиста-исследователя. Данная программа – сокращённый прикладной курс «Криминалистика», изучаемый на первых курсах юридических ВУЗов. Как снять отпечатки пальцев, следов, провести оперативную работу на местности, исследовать вещественные доказательства в лаборатории – эти и многие другие знания, умения и навыки будут результатом прохождения данной программы.", message.getPeerId());
    }
}
