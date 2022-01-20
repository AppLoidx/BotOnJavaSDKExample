package core.commands.path;

import com.vk.api.sdk.exceptions.ApiException;
import com.vk.api.sdk.exceptions.ClientException;
import com.vk.api.sdk.objects.messages.Message;
import core.Command;
import vk.VKManager;

public class Blender extends Command {
    public Blender(String name) {
        super(name);
    }

    @Override
    public void exec(Message message) throws ClientException, ApiException {
        new VKManager().sendMessage("В процессе прохождения курса ученики изучат различные инструменты и приёмы для создания своих собственных 3D моделей. К концу курса каждый ученик самостоятельно создаст элементы мебели разной сложности и пополнит свое портфолио полноценной локацией’. Начало занятий уже в феврале.", message.getPeerId());
    }
}
