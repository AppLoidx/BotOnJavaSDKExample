package core.commands;

import com.google.api.client.auth.jsontoken.JsonWebToken;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.exceptions.ApiException;
import com.vk.api.sdk.exceptions.ClientException;
import com.vk.api.sdk.objects.messages.Keyboard;
import com.vk.api.sdk.objects.messages.KeyboardButton;
import com.vk.api.sdk.objects.messages.KeyboardButtonAction;
import com.vk.api.sdk.objects.messages.TemplateActionTypeNames;
import vk.VKCore;
import vk.VKManager;

import java.util.ArrayList;
import java.util.List;

public class AskerKeyboard {

    VKCore vkCore = VKManager.vkCore;

    static KeyboardButton keyboardButtonAnk = new KeyboardButton().setAction(new KeyboardButtonAction().setLabel("Запись на занятия").setType(TemplateActionTypeNames.TEXT));
    static KeyboardButton keyboardButtonMes = new KeyboardButton().setAction(new KeyboardButtonAction().setLabel("Отправить сообщение менеджеру").setType(TemplateActionTypeNames.TEXT));
    static KeyboardButton keyboardButtonMenu = new KeyboardButton().setAction(new KeyboardButtonAction().setLabel("Меню").setType(TemplateActionTypeNames.TEXT));
    public static Keyboard getKeyMenu(){
        Keyboard keyboard = new Keyboard();
        List<List<KeyboardButton>> allKey = new ArrayList<>();
        List<KeyboardButton> line1 = new ArrayList<>();
        line1.add(new KeyboardButton().setAction(new KeyboardButtonAction().setLabel("Форма проведения занятия").setType(TemplateActionTypeNames.TEXT)));
        List<KeyboardButton> line2 = new ArrayList<>();
        line2.add(new KeyboardButton().setAction(new KeyboardButtonAction().setLabel("Возрастные ограничения").setType(TemplateActionTypeNames.TEXT)));
        List<KeyboardButton> line3 = new ArrayList<>();
        line3.add(new KeyboardButton().setAction(new KeyboardButtonAction().setLabel("Онлайн занятия").setType(TemplateActionTypeNames.TEXT)));
        line3.add(new KeyboardButton().setAction(new KeyboardButtonAction().setLabel("Дни работы").setType(TemplateActionTypeNames.TEXT)));
        List<KeyboardButton> line4 = new ArrayList<>();
        line4.add(new KeyboardButton().setAction(new KeyboardButtonAction().setLabel("Площадки занятий").setType(TemplateActionTypeNames.TEXT)));
        line4.add(new KeyboardButton().setAction(new KeyboardButtonAction().setLabel("Доступные курсы").setType(TemplateActionTypeNames.TEXT)));
        allKey.add(line1);
        allKey.add(line2);
        allKey.add(line3);
        allKey.add(line4);
        List<KeyboardButton> keyboardButtonAnkLine = new ArrayList<>();
        keyboardButtonAnkLine.add(keyboardButtonAnk);
        allKey.add(keyboardButtonAnkLine);
        List<KeyboardButton> keyboardButtonMesLine = new ArrayList<>();
        keyboardButtonMesLine.add(keyboardButtonMes);
        allKey.add(keyboardButtonMesLine);
        keyboard.setButtons(allKey);
        return keyboard;
    }

    public static Keyboard keyboardNull() {
        return new Keyboard();
    }
    public static Keyboard keyboardSendedManage() {
        Keyboard keyboard = new Keyboard();
        List<List<KeyboardButton>> allKey = new ArrayList<>();
        List<KeyboardButton> line1 = new ArrayList<>();
        line1.add(new KeyboardButton().setAction(new KeyboardButtonAction().setLabel("Прекратить общение").setType(TemplateActionTypeNames.TEXT)));
        allKey.add(line1);
        keyboard.setButtons(allKey);
        return keyboard;
    }

    public static Keyboard keyboardAgree() {
        Keyboard keyboard = new Keyboard();
        List<List<KeyboardButton>> allKey = new ArrayList<>();
        List<KeyboardButton> line1 = new ArrayList<>();
        line1.add(new KeyboardButton().setAction(new KeyboardButtonAction().setLabel("Я согласен").setType(TemplateActionTypeNames.TEXT)));
        line1.add(new KeyboardButton().setAction(new KeyboardButtonAction().setLabel("Я не согаласен").setType(TemplateActionTypeNames.TEXT)));
        allKey.add(line1);
        keyboard.setButtons(allKey).setInline(true);
        return keyboard;
    }
    public static Keyboard keyboardOn() {
        Keyboard keyboard = new Keyboard();
        List<List<KeyboardButton>> allKey = new ArrayList<>();
        List<KeyboardButton> line1 = new ArrayList<>();
        line1.add(new KeyboardButton().setAction(new KeyboardButtonAction().setLabel("Включить клавиатуру").setType(TemplateActionTypeNames.TEXT)));
        allKey.add(line1);
        keyboard.setButtons(allKey);
        return keyboard;
    }
    public static Keyboard keyboardOff(){
        Keyboard keyboard = new Keyboard();
        List<List<KeyboardButton>> allKey = new ArrayList<>();
        List<KeyboardButton> line1 = new ArrayList<>();
        line1.add(new KeyboardButton().setAction(new KeyboardButtonAction().setLabel("Выключить клавиатуру").setType(TemplateActionTypeNames.TEXT)));
        allKey.add(line1);
        keyboard.setButtons(allKey).setInline(true);
        return keyboard;
    }
        public static Keyboard keyboardChooseAge(){
        Keyboard keyboard = new Keyboard();
        List<List<KeyboardButton>> allKey = new ArrayList<>();
        List<KeyboardButton> line1 = new ArrayList<>();
        line1.add(new KeyboardButton().setAction(new KeyboardButtonAction().setLabel("Интересует 4-6 лет").setType(TemplateActionTypeNames.TEXT)));
        List<KeyboardButton> line2 = new ArrayList<>();
        line2.add(new KeyboardButton().setAction(new KeyboardButtonAction().setLabel("Интересует 7-10 лет").setType(TemplateActionTypeNames.TEXT)));
        List<KeyboardButton> line3 = new ArrayList<>();
        line3.add(new KeyboardButton().setAction(new KeyboardButtonAction().setLabel("Интересует 11+ лет").setType(TemplateActionTypeNames.TEXT)));
        allKey.add(line1);
        allKey.add(line2);
        allKey.add(line3);
        List<KeyboardButton> lineMenu = new ArrayList<>();
        lineMenu.add(keyboardButtonMenu);
        allKey.add(lineMenu);
        keyboard.setButtons(allKey);
        return keyboard;
    }

    public static Keyboard daysOfWeek(){
        Keyboard keyboard = new Keyboard();
        List<List<KeyboardButton>> allKey = new ArrayList<>();
        List<KeyboardButton> line1 = new ArrayList<>();
        line1.add(new KeyboardButton().setAction(new KeyboardButtonAction().setLabel("Понедельник").setType(TemplateActionTypeNames.TEXT)));
        List<KeyboardButton> line2 = new ArrayList<>();
        line2.add(new KeyboardButton().setAction(new KeyboardButtonAction().setLabel("Вторник").setType(TemplateActionTypeNames.TEXT)));
        List<KeyboardButton> line3 = new ArrayList<>();
        line3.add(new KeyboardButton().setAction(new KeyboardButtonAction().setLabel("Среда").setType(TemplateActionTypeNames.TEXT)));
        List<KeyboardButton> line4 = new ArrayList<>();
        line4.add(new KeyboardButton().setAction(new KeyboardButtonAction().setLabel("Четверг").setType(TemplateActionTypeNames.TEXT)));
        line1.add(new KeyboardButton().setAction(new KeyboardButtonAction().setLabel("Пятница").setType(TemplateActionTypeNames.TEXT)));
        line2.add(new KeyboardButton().setAction(new KeyboardButtonAction().setLabel("Суббота").setType(TemplateActionTypeNames.TEXT)));
        line3.add(new KeyboardButton().setAction(new KeyboardButtonAction().setLabel("Воскресенье").setType(TemplateActionTypeNames.TEXT)));
        line4.add(new KeyboardButton().setAction(new KeyboardButtonAction().setLabel("Готово").setType(TemplateActionTypeNames.TEXT)));
        allKey.add(line1);
        allKey.add(line2);
        allKey.add(line3);
        allKey.add(line4);
//        allKey.add(line5);
//        allKey.add(line6);
//        allKey.add(line7);
//        allKey.add(line8);
        keyboard.setButtons(allKey).setInline(true);
        return keyboard;
    }

    public static Keyboard placesShow(){
        Keyboard keyboard = new Keyboard();
        List<List<KeyboardButton>> allKey = new ArrayList<>();
        List<KeyboardButton> line1 = new ArrayList<>();
        line1.add(new KeyboardButton().setAction(new KeyboardButtonAction().setLabel("Тольятти: Автозаводский район ").setType(TemplateActionTypeNames.TEXT)));
        List<KeyboardButton> line2 = new ArrayList<>();
        line2.add(new KeyboardButton().setAction(new KeyboardButtonAction().setLabel("Тольятти: Центральный район").setType(TemplateActionTypeNames.TEXT)));
        List<KeyboardButton> line3 = new ArrayList<>();
        line3.add(new KeyboardButton().setAction(new KeyboardButtonAction().setLabel("Тольятти: Комсомольский район").setType(TemplateActionTypeNames.TEXT)));
        List<KeyboardButton> line4 = new ArrayList<>();
        line4.add(new KeyboardButton().setAction(new KeyboardButtonAction().setLabel("Самара").setType(TemplateActionTypeNames.TEXT)));
        List<KeyboardButton> line5 = new ArrayList<>();
        line5.add(new KeyboardButton().setAction(new KeyboardButtonAction().setLabel("Готово").setType(TemplateActionTypeNames.TEXT)));
        allKey.add(line1);
        allKey.add(line2);
        allKey.add(line3);
        allKey.add(line4);
        allKey.add(line5);
//        allKey.add(line6);
//        allKey.add(line7);
//        allKey.add(line8);
        keyboard.setButtons(allKey).setInline(true);
        return keyboard;
    }


    public static Keyboard distant(){
        Keyboard keyboard = new Keyboard();
        List<List<KeyboardButton>> allKey = new ArrayList<>();
        List<KeyboardButton> line1 = new ArrayList<>();
        line1.add(new KeyboardButton().setAction(new KeyboardButtonAction().setLabel("Дистанционно").setType(TemplateActionTypeNames.TEXT)));
        List<KeyboardButton> line2 = new ArrayList<>();
        line2.add(new KeyboardButton().setAction(new KeyboardButtonAction().setLabel("На площадке").setType(TemplateActionTypeNames.TEXT)));
        allKey.add(line1);
        allKey.add(line2);
        keyboard.setButtons(allKey).setInline(true);
        return keyboard;
    }


    public static Keyboard keyboardAskerLess7(boolean asker){
        Keyboard keyboard = new Keyboard();
        List<List<KeyboardButton>> allKey = new ArrayList<>();
        List<KeyboardButton> line1 = new ArrayList<>();
        line1.add(new KeyboardButton().setAction(new KeyboardButtonAction().setLabel("Конструирование \"Лего\"").setType(TemplateActionTypeNames.TEXT)));
        List<KeyboardButton> line2 = new ArrayList<>();
        line2.add(new KeyboardButton().setAction(new KeyboardButtonAction().setLabel("Техническое творчество").setType(TemplateActionTypeNames.TEXT)));
        allKey.add(line1);
        allKey.add(line2);
        if(asker) {
            List<KeyboardButton> keyboardButtonAnkLine = new ArrayList<>();
            keyboardButtonAnkLine.add(keyboardButtonAnk);
            allKey.add(keyboardButtonAnkLine);
            List<KeyboardButton> keyboardButtonMesLine = new ArrayList<>();
            keyboardButtonMesLine.add(keyboardButtonMes);
            allKey.add(keyboardButtonMesLine);
            keyboard.setButtons(allKey);
            List<KeyboardButton> lineMenu = new ArrayList<>();
            lineMenu.add(keyboardButtonMenu);
            allKey.add(lineMenu);
        }else {
            List<KeyboardButton> lineReady = new ArrayList<>();
            lineReady.add(new KeyboardButton().setAction(new KeyboardButtonAction().setLabel("Готово").setType(TemplateActionTypeNames.TEXT)));
            allKey.add(lineReady);
        }
        keyboard.setButtons(allKey);
        return keyboard;
    }
    public static Keyboard keyboardAskerMore7(boolean asker){
        Keyboard keyboard = new Keyboard();
        List<List<KeyboardButton>> allKey = new ArrayList<>();
        List<KeyboardButton> line1 = new ArrayList<>();
        line1.add(new KeyboardButton().setAction(new KeyboardButtonAction().setLabel("Первоклассный электронщик").setType(TemplateActionTypeNames.TEXT)));
        List<KeyboardButton> line2 = new ArrayList<>();
        line2.add(new KeyboardButton().setAction(new KeyboardButtonAction().setLabel("Детское программирование на Скретч").setType(TemplateActionTypeNames.TEXT)));
        List<KeyboardButton> line3 = new ArrayList<>();
        line3.add(new KeyboardButton().setAction(new KeyboardButtonAction().setLabel("Экспериментальная химия").setType(TemplateActionTypeNames.TEXT)));
        List<KeyboardButton> line4 = new ArrayList<>();
        line4.add(new KeyboardButton().setAction(new KeyboardButtonAction().setLabel("Юный криминалист").setType(TemplateActionTypeNames.TEXT)));
        List<KeyboardButton> line5 = new ArrayList<>();
        line5.add(new KeyboardButton().setAction(new KeyboardButtonAction().setLabel("Курс Roblox").setType(TemplateActionTypeNames.TEXT)));
        allKey.add(line1);
        allKey.add(line2);
        allKey.add(line3);
        allKey.add(line4);
        allKey.add(line5);
        if(asker) {
            List<KeyboardButton> keyboardButtonAnkLine = new ArrayList<>();
            keyboardButtonAnkLine.add(keyboardButtonAnk);
            allKey.add(keyboardButtonAnkLine);
            List<KeyboardButton> keyboardButtonMesLine = new ArrayList<>();
            keyboardButtonMesLine.add(keyboardButtonMes);
            allKey.add(keyboardButtonMesLine);
            keyboard.setButtons(allKey);
            List<KeyboardButton> lineMenu = new ArrayList<>();
            lineMenu.add(keyboardButtonMenu);
            allKey.add(lineMenu);
        }else {
            List<KeyboardButton> lineReady = new ArrayList<>();
            lineReady.add(new KeyboardButton().setAction(new KeyboardButtonAction().setLabel("Готово").setType(TemplateActionTypeNames.TEXT)));
            allKey.add(lineReady);
        }
        keyboard.setButtons(allKey);
        return keyboard;
    }
    public static Keyboard keyboardAskerMore11(int age, boolean asker){
        Keyboard keyboard = new Keyboard();
        List<List<KeyboardButton>> allKey = new ArrayList<>();
        List<KeyboardButton> line1 = new ArrayList<>();
        line1.add(new KeyboardButton().setAction(new KeyboardButtonAction().setLabel("Экспериментальная химия").setType(TemplateActionTypeNames.TEXT)));
        List<KeyboardButton> line2 = new ArrayList<>();
        line2.add(new KeyboardButton().setAction(new KeyboardButtonAction().setLabel("Юный криминалист").setType(TemplateActionTypeNames.TEXT)));
        line2.add(new KeyboardButton().setAction(new KeyboardButtonAction().setLabel("Курс Roblox").setType(TemplateActionTypeNames.TEXT)));
        List<KeyboardButton> line3 = new ArrayList<>();
        line3.add(new KeyboardButton().setAction(new KeyboardButtonAction().setLabel("Курс программирования \"Python\"").setType(TemplateActionTypeNames.TEXT)));
        List<KeyboardButton> line4 = new ArrayList<>();
        line4.add(new KeyboardButton().setAction(new KeyboardButtonAction().setLabel("Курс \"Робототехника и умный дом\"").setType(TemplateActionTypeNames.TEXT)));
        List<KeyboardButton> line5 = new ArrayList<>();
        line5.add(new KeyboardButton().setAction(new KeyboardButtonAction().setLabel("Курс по программе \"Unity\"").setType(TemplateActionTypeNames.TEXT)));
        if (asker){
            line5.add(new KeyboardButton().setAction(new KeyboardButtonAction().setLabel("Курс \"Blender\"").setType(TemplateActionTypeNames.TEXT)));
        }else {
            List<KeyboardButton> line0 = new ArrayList<>();
            line0.add(new KeyboardButton().setAction(new KeyboardButtonAction().setLabel("Курс \"Blender\"").setType(TemplateActionTypeNames.TEXT)));
            allKey.add(line0);
        }

        List<KeyboardButton> line6 = new ArrayList<>();
        line6.add(new KeyboardButton().setAction(new KeyboardButtonAction().setLabel("Курс программирования \"Java\"").setType(TemplateActionTypeNames.TEXT)));
        allKey.add(line1);
        allKey.add(line2);
        allKey.add(line3);
        allKey.add(line4);
        if(age>=12)allKey.add(line5);
        if(age>=13) allKey.add(line6);
        if(asker) {
            List<KeyboardButton> keyboardButtonAnkLine = new ArrayList<>();
            keyboardButtonAnkLine.add(keyboardButtonAnk);
            allKey.add(keyboardButtonAnkLine);
            List<KeyboardButton> keyboardButtonMesLine = new ArrayList<>();
            keyboardButtonMesLine.add(keyboardButtonMes);
            allKey.add(keyboardButtonMesLine);
            keyboard.setButtons(allKey);
            List<KeyboardButton> lineMenu = new ArrayList<>();
            lineMenu.add(keyboardButtonMenu);
            allKey.add(lineMenu);
        }else {
            List<KeyboardButton> lineReady = new ArrayList<>();
            lineReady.add(new KeyboardButton().setAction(new KeyboardButtonAction().setLabel("Готово").setType(TemplateActionTypeNames.TEXT)));
            allKey.add(lineReady);
        }
        keyboard.setButtons(allKey);
        return keyboard;
    }

}
