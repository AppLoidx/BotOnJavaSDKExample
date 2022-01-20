package core.commands;

import com.vk.api.sdk.objects.messages.Message;
import core.Command;
import core.data.DataUser;
import core.mailing.DateObject;
import core.mailing.Timer;
import vk.VKManager;
import vk.VKServer;

import java.util.ArrayList;
import java.util.Date;

public class AddNew extends Command {



    public AddNew(String name) {
        super(name);
    }

    @Override
    public void exec(Message message) {
        try {
            if(message.getFromId().equals(347489307) || message.getFromId().equals(7538697)|| message.getFromId().equals(38061015)){

                try {
                    VKServer.timer.add(message);
                }catch (Exception e){
                    e.printStackTrace();
                    new VKManager().sendMessage("Вид сообщения должен быть: Добавить |Месяц| |День недели| |День месяца| |Время| |id человека| |Вид сообщения| \n" +
                            "Пример: Добавить -1 2 -1 17:30 (0/1) "+message.getFromId()+"\n" +
                            "Где -1 - это повторять каждый месяц/день недели/день месяца, месяц - от 0 до 11; день недели 0 - воскресенье, 6 - суббота; Время обязательно", message.getFromId());
                }
            }else{
                new VKManager().sendMessage("Вы не имеете права для этой команды", message.getFromId());
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
