package common;

import java.text.SimpleDateFormat;

/**
 * Для работа с датой и временем
 *
 * @author Артур Куприянов
 * @version 1.0.0
 */
public class Date {

    public static String getDate(){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd.MM.yyyy hh:mm");
        return simpleDateFormat.format(new java.util.Date());
    }

    public static String getTimeNow(){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm");
        return simpleDateFormat.format(new java.util.Date());
    }
}
