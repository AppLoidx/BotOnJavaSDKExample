package core.mailing;

import com.vk.api.sdk.exceptions.ApiException;
import com.vk.api.sdk.exceptions.ClientException;
import com.vk.api.sdk.objects.messages.Message;
import core.Command;
import vk.VKManager;

import java.util.ArrayList;
import java.util.Date;

public class Timer{
    public ArrayList<DateObject> dateObjects = new ArrayList<>();

    public Timer(){

    }
    public void add(Message message) {
//        try {
//            for (DateObject dateObj :
//                    dateObjects) {
//                if(dateObj.url)
//            }
//        }catch (Exception e){
//
//        }

        dateObjects.add(new DateObject(message.getText()));
    }

    @Override
    public String toString() {
        String str = "timer: ";
        for (DateObject date :
                dateObjects) {
            str +="\n" +date.toString() ;
        }
        return str;
    }
    public void autoSend(DateObject dateObject) throws ClientException, ApiException {
        new VKManager().sendMessage(dateObject.message, dateObject.url);
    }
}
