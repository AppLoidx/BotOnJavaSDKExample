package core.commands;

import com.vk.api.sdk.exceptions.ApiException;
import com.vk.api.sdk.exceptions.ClientException;
import com.vk.api.sdk.objects.messages.Message;
import core.Command;
import core.data.DataUser;
import vk.VKManager;

/**
 * @author Arthur Kupriyanov
 */
public class Unknown extends Command {
    public Unknown(String name) {
        super(name);
    }

    @Override
    public void exec(Message message) throws ClientException, ApiException {

        if(message.getText().equalsIgnoreCase("Прекратить общение")){
            SenderMen.stopManage(message.getPeerId());
        }
        try {
            for (DataUser dataUser :
                    Asker.dataUsers) {
                if (message.getFromId() == dataUser.url){
                    if(dataUser.sendMessage) {
//                        new VKManager().sendMessage("Отправитель:" + " https://vk.com/id" +message.getPeerId() +"\nТекст: " + message.getText(), 7538697);
                        return;
                    }else if(dataUser.keuboardOn){
                        new VKManager().sendKeyboard(message.getPeerId(), AskerKeyboard.getKeyMenu(), "Выберите пожалуйста пункт в меню с помощью кнопок");
                        new VKManager().sendKeyboard(message.getPeerId(), AskerKeyboard.keyboardOff(), "Выключить клавиатуру");
                    }else if(dataUser.oneTime){
                        new VKManager().sendKeyboard(message.getPeerId(), AskerKeyboard.keyboardOn(), "Ваше сообщение отправлено менеджеру. Вы можете получить много полезной информации, не дожидаясь его ответа, для этого включите клавиатуру и выберите интересующую Вас информацию");
//                        new VKManager().sendMessage("Отправитель:" + " https://vk.com/id" +message.getPeerId() +"\nТекст: " + message.getText(), 7538697);
                        dataUser.oneTime = false;
                    }else {
//                        new VKManager().sendMessage("Отправитель:" + " https://vk.com/id" +message.getPeerId() +"\nТекст: " + message.getText(), 7538697);
                    }
                }
            }

        }catch (Exception e) {
        }
    }
}
