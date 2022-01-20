package core.commands;

import com.vk.api.sdk.exceptions.ApiException;
import com.vk.api.sdk.exceptions.ClientException;
import com.vk.api.sdk.objects.messages.Message;
import core.Command;
import core.data.DataUser;
import vk.VKManager;

public class MassiveSender extends Command {
    public MassiveSender(String name) {
        super(name);
    }

    @Override
    public void exec(Message message) throws ClientException, ApiException {
        if (message.getFromId().equals(347489307) || message.getFromId().equals(7538697) || message.getFromId().equals(38061015)) {
            for (DataUser dataUser :
                    Asker.dataUsers) {
                new VKManager().sendMessage(message.getText(), dataUser.url);
            }
        }
    }
}
