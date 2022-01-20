package core.commands;

import com.vk.api.sdk.exceptions.ApiException;
import com.vk.api.sdk.exceptions.ClientException;
import com.vk.api.sdk.objects.messages.Message;
import core.Command;
import core.data.DataUser;
import vk.VKManager;

public class KeyOn extends Command {
    public KeyOn(String name) {
        super(name);
    }

    @Override
    public void exec(Message message) throws ClientException, ApiException {
        for (DataUser dataUser :
                Asker.dataUsers) {
            if (message.getFromId() == dataUser.url){
                dataUser.keuboardOn = true;
                dataUser.oneTime = true;
                new Unknown("unknown").exec(message);
            }
        }
    }
}
