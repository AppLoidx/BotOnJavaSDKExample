package core.commands;

import com.vk.api.sdk.exceptions.ApiException;
import com.vk.api.sdk.exceptions.ClientException;
import com.vk.api.sdk.objects.messages.Keyboard;
import com.vk.api.sdk.objects.messages.Message;
import core.Command;
import core.data.DataUser;
import vk.VKManager;

public class SenderMen extends Command {
    public SenderMen(String name) {
        super(name);
    }

    @Override
    public void exec(Message message) throws ClientException, ApiException {
        try {
            for (DataUser dataUser :
                    Asker.dataUsers) {
                if (message.getFromId() == dataUser.url){
                    dataUser.sendMessage = true;
                    new VKManager().sendKeyboard(message.getPeerId(), AskerKeyboard.keyboardSendedManage(), "Отправляйте ваше сообщение и ожидайте");
                    return;
                }
            }
        }catch (Exception e) {
        }


    }
    public static void stopManage(int peerId){
        try {
            for (DataUser dataUser :
                    Asker.dataUsers) {
                if (peerId == dataUser.url){
                    dataUser.sendMessage = false;
                }
            }
        }catch (Exception e) {
        }
    }
}
