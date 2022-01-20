package core.commands.path;

import com.vk.api.sdk.exceptions.ApiException;
import com.vk.api.sdk.exceptions.ClientException;
import com.vk.api.sdk.objects.messages.Message;
import core.Command;
import core.commands.AskerKeyboard;
import vk.VKManager;

public class Elec extends Command {
    public Elec(String name) {
        super(name);
    }

    @Override
    public void exec(Message message) throws ClientException, ApiException {
        new VKManager().sendMessage("На данной программе мы изучаем с детьми основные электронные компоненты (это то, из чего собирается современная электроника), и собираем свои схемы без пайки и без программирования. Это не является конструктором знаток, это настоящая электроника.", message.getPeerId());
    }
}
