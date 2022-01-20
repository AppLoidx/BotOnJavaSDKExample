package vk;


import com.vk.api.sdk.exceptions.ApiException;
import com.vk.api.sdk.exceptions.ClientException;
import com.vk.api.sdk.objects.messages.*;
import core.commands.Asker;
import core.data.DataUser;
import core.mailing.DateObject;
import core.mailing.Timer;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class VKServer {
    public static VKCore vkCore;

    static {
        try {
            vkCore = new VKCore();
        } catch (ApiException | ClientException e) {
            e.printStackTrace();
        }
    }

    public static Timer timer = new Timer();

    public static void main(String[] args) throws NullPointerException, ApiException, InterruptedException, ClientException {
        System.out.println("Running server...");
        Asker.dataUsers.add(new DataUser(-1));
        while (true) {
            Thread.sleep(600);
            try {
            for (DateObject dateObj :
                    timer.dateObjects) {
                if (dateObj.equals(new Date())) {
                    new VKManager().sendMessage(dateObj.message, dateObj.url);
//                    if (dateObj.startedAnket) {
//                        System.out.println(dateObj.toString());
//                        for (DataUser dataUser :
//                                Asker.dataUsers) {
//                            System.out.println(dataUser.toString());
//
//                            if (dataUser.url == dateObj.url) {
//                                dataUser.start = false;
//                                dataUser.question = 0;
//                                dateObj.startedAnket = false;
//
//                                timer.dateObjects.remove((Object)dateObj);
//                            }
//
//                        }
//                    }
                    System.out.println("0");
                }
            }
            }catch (Exception e){
                e.printStackTrace();
            }
                try {
                    Message message = vkCore.getMessage();
                    if (message != null) {
                        ExecutorService exec = Executors.newCachedThreadPool();
                        if (new VKManager().getMessage(message)) exec.execute(new Messenger(message));
                    }
                } catch (ClientException e) {
                    vkCore = new VKCore();
                    System.out.println("Возникли проблемы");
                    final int RECONNECT_TIME = 10000;
                    System.out.println("Повторное соединение через " + RECONNECT_TIME / 1000 + " секунд");
                    Thread.sleep(RECONNECT_TIME);
                }
            }
        }
    }