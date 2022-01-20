package core.commands;

import com.vk.api.sdk.exceptions.ApiException;
import com.vk.api.sdk.exceptions.ClientException;
import com.vk.api.sdk.objects.messages.Keyboard;
import com.vk.api.sdk.objects.messages.KeyboardButton;
import com.vk.api.sdk.objects.messages.Message;
import core.Command;
import core.data.DataUser;
import core.mailing.DateObject;
import vk.VKCore;
import vk.VKManager;
import vk.VKServer;

import java.util.*;

public class Asker extends Command {
    public static Set<DataUser> dataUsers = new HashSet<>();
    public Asker(String name) {
        super(name);
    }
    boolean started;

    @Override
    public void exec(Message message) throws ClientException, ApiException {
        DataUser datauser = null;
        try {
            for (DataUser dataUser :
                    dataUsers) {
                if (message.getFromId() == dataUser.url){
                    dataUser.start = true;
                    System.out.println("here");
                }
            }
        }catch (Exception e) {
        }



        if(datauser == null){
            datauser = new DataUser(message.getFromId());
            dataUsers.add(datauser);
        }

    }
    public void dataSetter(int peerId, DataUser dataUser, String msg) throws ClientException, ApiException {

        if(dataUser.start){
//            DateObject dateObject = new DateObject(new Date());
//            dateObject.message= "Вы не заполнили анкету, пожалуйста, заполните анкету ещё раз, пожалуйста";
//            dateObject.time=new Date().toString().split(" ")[3].split(":")[0] +":" + (Integer.valueOf(new Date().toString().split(" ")[3].split(":")[1])<10?"0":"") +(Integer.valueOf(new Date().toString().split(" ")[3].split(":")[1])+1) + ":" +new Date().toString().split(" ")[3].split(":")[2];
//            dateObject.url = peerId;
//
//            dateObject.startedAnket = true;
//            System.out.println("message accepted " + dateObject.toString());
//
//            for (DateObject dO :
//                    VKServer.timer.dateObjects ) {
//                if(dO.url == peerId && dateObject.startedAnket == true){
//                    VKServer.timer.dateObjects.remove(dO);
//                }
//            }
//            VKServer.timer.dateObjects.add(dateObject);

            switch (dataUser.question) {
                case 0:
                    if(msg.equalsIgnoreCase("Запись на занятия")) {
                        started = true;
                        dataUsers.add(dataUser);
                        new VKManager().sendMessage("Здравствуйте, просим ознакомиться с офертой, продолжая заполнять анкету вы принимаете условия оферты, Вы подтверждаете своё согласие на обработку организацией \"Школароботов\" персональных данных", peerId);
                        new VKManager().sendKeyboard(peerId,AskerKeyboard.keyboardAgree(), "Согласие на обработку и передачу персональных данных\n" +
                                "Пользуясь данным интернет ресурсом, в порядке ст. 9 Федерального закона от 27.07.2006 г. № 152- ФЗ «О персональных данных» (далее – ФЗ «О персональных данных») я, как Пользователь чата Школароботов даю согласие на обработку ООО «Школа новых профессий», ОГРН 1166313087390, ИНН 6321408321, адрес места нахождения: 445033, РФ, Самарская область, г. Тольятти, ул. Революционная, д. 7Б, оф. 5 моих персональных данных и подтверждаю, что давая такое согласие, я действую своей волей и в своем интересе. \n" +
                                "\n" +
                                "В соответствии с ФЗ «О персональных данных» я согласен (-на) предоставить информацию, относящуюся к моей личности: фамилия, имя, отчество; год, месяц, день рождения; пол; данные паспорта гражданина Российской Федерации (серия, номер, дата выдачи, наименование органа, выдавшего документ); данные заграничного паспорта (серия, номер, дата выдачи, срок окончания действия паспорта); биометрические персональные данные , содержащиеся в заграничном паспорте; фамилия и имя, как они указаны в заграничном паспорте; адрес места жительства; должность; контактный телефон; электронный адрес; сведения, запрашиваемые консульскими службами посольства страны планируемого посещения для рассмотрения вопроса о выдаче визы; иную информацию. Либо, если я являюсь законным представителем юридического лица, я согласен предоставить информацию, относящуюся к реквизитам юридического лица: наименование, юридический адрес, виды деятельности, наименование и ФИО исполнительного органа. \n" +
                                "\n" +
                                "В случае предоставления персональных данных третьих лиц, я подтверждаю, что мною получено согласие третьих лиц, в интересах которых я действую, на обработку их персональных данных, в том числе: сбор, систематизацию, накопление, хранение, уточнение (обновление или изменение), использование, распространение (в том числе, трансграничная передача), обезличивание, блокирование, уничтожение, а также осуществление любых иных действий с персональными данными в соответствии с действующим законодательством. \n" +
                                "\n" +
                                "Согласие на обработку персональных данных дается мною в целях получения услуг, реализуемых ООО «Школа новых профессий». \n" +
                                "\n" +
                                "Я выражаю свое согласие на осуществление со всеми выше указанными персональными данными следующих действий: сбор, систематизация, накопление, хранение, уточнение (обновление или изменение), использование, распространение (в том числе, трансграничная передача), обезличивание, блокирование, уничтожение, а также осуществление любых иных действий с персональными данными в соответствии с действующим законодательством. Обработка данных может осуществляться с использованием средств автоматизации, так и без их использования (при неавтоматической обработке). При обработке персональных данных ООО «Школа новых профессий» не ограничено в применении способов их обработки. \n" +
                                "\n" +
                                "Настоящим я признаю и подтверждаю, что в случае необходимости ООО «Школа новых профессий» вправе предоставлять мои персональные данные для достижения указанных выше целей третьему лицу, в том числе и при привлечении третьих лиц к оказанию услуг в указанных целях. Такие третьи лица имеют право на обработку персональных данных на основании настоящего согласия. \n" +
                                "\n" +
                                "Настоящее согласие на обработку моих персональных данных может быть отозвано мною посредством письменного уведомления ООО «Школа новых профессий». \n" +
                                "\n" +
                                "Настоящим подтверждаю, что ознакомлен (а) с правами субъектов персональных данных, закрепленными в главе 3 ФЗ «О персональных данных». \n" +
                                "\n" +
                                "Я осознаю, что продолжение заполнения анкеты означает мое письменное согласие с условиями, описанными заранее.");
//                        new VKManager().sendKeyboard(peerId, new Keyboard().setButtons(new ArrayList<>()), "Напишите возраст (4-99) человека, который будет учиться в нашей школе");


                        dataUser.question++;
                    }
                    break;
                case 1:
                    if(msg.equalsIgnoreCase("Я согласен")) {
                        new VKManager().sendKeyboard(peerId, new Keyboard().setButtons(new ArrayList<>()), "Напишите возраст (4-99) человека, который будет учиться в нашей школе");
                        dataUser.question++;
                    }else{
                        dataUser.start = false;
                        dataUser.question = 0;
                        new VKManager().sendMessage("Вы отменили прохождение анкетирования", peerId);
                    }
                    break;
                case 2:
                    try {
                        dataUser.age = Integer.valueOf(msg);
                        System.out.println(msg);
                        dataUser.question++;
                        new VKManager().sendMessage("Напишите Фамилию, Имя, отчество (Если имеется) ученика", peerId);
                    }catch (Exception e){
                        new VKManager().sendMessage("Напишите число", peerId);
                    }

                    break;
                case 3:
                    try {
                        dataUser.FIO = msg;
                        System.out.println(msg);
                        dataUser.question++;
                        new VKManager().sendMessage("Напишите ваш контактный телефон", peerId);
                    }catch (Exception e){
                        new VKManager().sendMessage("Напишите число", peerId);
                    }

                    break;
                case 4:
                    dataUser.phone = msg;
                    dataUser.question++;
                    new VKManager().sendMessage("Вам удобны индивидуальные или групповые занятия?", peerId);
                    break;
                case 5:
                    dataUser.individual = msg;
                    dataUser.question++;
                    new VKManager().sendKeyboard(peerId,AskerKeyboard.distant(),"Вам удобнее заниматься дистанционно или на площадке?");
                    break;
                case 6:
                    dataUser.distant = msg;
                    dataUser.question++;
                    new VKManager().sendKeyboard(peerId, AskerKeyboard.daysOfWeek(),"Выберите дни недели, в которые вам удобно заниматься и как только закончите выберите \"Готово\"");
                    break;
                case 7:
                    if(msg.equals("Готово"))
                    {
                        if(dataUser.distant.equals("Дистанционно")) {
                            dataUser.question+=2;
                            msg= " ";
                            dataSetter(peerId, dataUser, msg);
                            }else {
                            dataUser.question++;
                            new VKManager().sendKeyboard(peerId, AskerKeyboard.placesShow(), "Выберите места, в которых вам удобно заниматься и как только закончите выберите \"Готово\"");
                        }
                    }else{
                        if (!msg.equals(null)) dataUser.days += msg +", ";
                        new VKManager().sendMessage("Записали Ваш ответ!", peerId);
                    }
                    break;
                case 8:
                    if(msg.equals("Готово"))
                    {
                        dataUser.question++;
                        msg = " ";
                        dataSetter(peerId, dataUser, msg);
                    }else{
                        if (!msg.equals(null)) dataUser.places += msg;
                        new VKManager().sendMessage("Записали Ваш ответ!", peerId);
                    }

                    break;
                case 9:
                    if (dataUser.age < 7 && started) {
                        new VKManager().sendKeyboard(peerId, new AskerKeyboard().keyboardAskerLess7(false), "Выберите направления (направление), подобранные для вас и как только закончите выберите \"Готово\"");
                        started = false;
                    } else if (dataUser.age > 6 && dataUser.age < 11 && started) {
                        new VKManager().sendKeyboard(peerId, new AskerKeyboard().keyboardAskerMore7(false), "Выберите направления (направление), подобранные для вас и как только закончите выберите \"Готово\"");
                        started = false;
                    } else if (dataUser.age > 10 && started) {
                        new VKManager().sendKeyboard(peerId, new AskerKeyboard().keyboardAskerMore11(dataUser.age, false),"Выберите направления (направление), подобранные для вас и как только закончите выберите \"Готово\"");
                        started = false;
                    }
                    if(msg.equals("Готово"))
                    {
                        dataUser.question++;
                        dataSetter(peerId, dataUser, msg);
                    }else{
                        if (!msg.equals(null)) dataUser.programms += msg + ", ";
                        new VKManager().sendMessage("Записали Ваш ответ!", peerId);
                    }
                    break;
                case 10:
                    new VKManager().sendMessage("Спасибо за ответы, Ваша заявка принята, ожидайте ответа менеджера", peerId);
                    new VKManager().sendKeyboard(peerId);
                    String str = dataUser.toString();
                    new VKManager().sendMessage(str, 7538697);
                    dataUser.start=false;
                    dataUser.question=0;
            }
        }
}
}