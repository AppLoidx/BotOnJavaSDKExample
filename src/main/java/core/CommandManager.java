package core;

import core.commands.*;
import core.commands.path.*;

import java.util.HashSet;

/**
 * @author Arthur Kupriyanov
 */
public class CommandManager {
    private static HashSet<Command> commands = new HashSet<>();
    public static Asker asker = new Asker("Запись на занятия");
    static {
        commands.add(new AddNew("Добавить"));
        commands.add(new Forma("Форма проведения занятия"));
        commands.add(new DaysOfWork("Дни работы"));
        commands.add(new AgeQuest("Возрастные ограничения"));
        commands.add(new OnlineFormat("Онлайн занятия"));
        commands.add(new Places("Площадки занятий"));
        commands.add(new KursChooser("Доступные курсы"));
        commands.add(new takeLow("Интересует 4-6 лет"));
        commands.add(new takeMiddle("Интересует 7-10 лет"));
        commands.add(new takeBig("Интересует 11+ лет"));
        commands.add(new Menu("Меню"));

        commands.add(new Lego("Конструирование \"Лего\""));
        commands.add(new Tech("Техническое творчество"));
        commands.add(new Elec("Первоклассный электронщик"));
        commands.add(new Scratch("Детское программирование на Скретч"));
        commands.add(new Him("Экспериментальная химия"));
        commands.add(new Crimin("Юный криминалист"));
        commands.add(new Roblox("Курс Roblox"));
        commands.add(new Robo("Курс \"Робототехника и умный дом\""));
        commands.add(new Python("Курс программирования \"Python\""));
        commands.add(new Unity("Курс по программе \"Unity\""));
        commands.add(new Java("Курс программирования \"Java\""));
        commands.add(new Blender("Курс \"Blender\""));

        commands.add(new SenderMen("Отправить сообщение менеджеру"));
        commands.add(new KeyOff("Выключить клавиатуру"));
        commands.add(new KeyOn("Включить клавиатуру"));
//        commands.add(new SenderMen("Прекратить общение"));
        commands.add(asker);
        commands.add(new Unknown("unknown"));
    }

    public static HashSet<Command> getCommands(){
        return commands;
    }
    public static void addCommand(Command command) { commands.add(command);}
}
