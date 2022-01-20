package vk;

import com.vk.api.sdk.exceptions.ApiException;
import com.vk.api.sdk.exceptions.ClientException;
import com.vk.api.sdk.objects.messages.*;
import com.vk.api.sdk.objects.users.UserXtrCounters;
import com.vk.api.sdk.objects.users.responses.GetResponse;
import com.vk.api.sdk.queries.messages.MessagesSendQuery;
import core.CommandManager;
import core.commands.AddNew;
import core.commands.Asker;
import core.commands.AskerKeyboard;
import core.data.DataUser;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author Arthur Kupriyanov
 */
public class VKManager {
    public static VKCore vkCore;
    Random random = new Random(System.currentTimeMillis());
    static {
        try {
            vkCore = new VKCore();
        } catch (ApiException | ClientException e) {
            e.printStackTrace();
        }
    }

    public void sendMessage(String msg, int peerId) throws ClientException, ApiException {

        if (msg == null){
            System.out.println("null");
            return;
        }
        try {
                vkCore.getVk().messages().send(vkCore.getActor()).peerId(peerId).message(msg).randomId(random.nextInt(Integer.MAX_VALUE)).execute();
        } catch (ApiException | ClientException e) {
            e.printStackTrace();
        }
    }
    public boolean getMessage(Message message) throws ClientException, ApiException {
        int x = 0;
        int peerId = message.getFromId();
        String msg = message.getText();
        DataUser dataUser = null;
        for (DataUser datauser :
                Asker.dataUsers) {
            if(peerId == datauser.url){
                x++;
                if(message.getText().equalsIgnoreCase("Запись на занятия")) datauser.start = true;
                dataUser = datauser;

            }
        }
        if(x==0){
            DataUser dataUser1 = new DataUser(peerId);
            Asker.dataUsers.add(dataUser1);
            CommandManager.asker.dataSetter(peerId,dataUser1, msg);
            System.out.println("confirmed");
        }
        try {
            if(dataUser.start){
                CommandManager.asker.dataSetter(peerId,dataUser, msg);
                System.out.println("confirmed");
                return false;
            }
        }catch (Exception e){

        }

        return true;
    }
    public void sendKeyboard(int peerId) throws ClientException, ApiException {
        vkCore.getVk().messages().send(vkCore.getActor()).peerId(peerId).message("Задайте частозадаваемые вопросы из клавиатуры, вам ответят моментально.").keyboard(AskerKeyboard.getKeyMenu()).randomId(random.nextInt(Integer.MAX_VALUE)).execute();
    }
    public void sendKeyboard(int peerId, Keyboard keyboard, String msg) throws ClientException, ApiException {
        vkCore.getVk().messages().send(vkCore.getActor()).peerId(peerId).message(msg).keyboard(keyboard).randomId(random.nextInt(Integer.MAX_VALUE)).execute();
    }


    public MessagesSendQuery getSendQuery(){
        return vkCore.getVk().messages().send(vkCore.getActor());
    }

    /**
     * Обращается к VK API и получает объект, описывающий пользователя.
     * @param id идентификатор пользователя в VK
     * @return {@link UserXtrCounters} информацию о пользователе
     * @see UserXtrCounters
     */
    public static GetResponse getUserInfo(int id) throws ClientException, ApiException {
        try {
            return vkCore.getVk().users()
                    .get(vkCore.getActor())
                    .userIds(String.valueOf(id))
                    .execute()
                    .get(0);
        } catch (ApiException | ClientException e) {
            VKServer.vkCore = new VKCore();
        }
        return null;
    }

}
