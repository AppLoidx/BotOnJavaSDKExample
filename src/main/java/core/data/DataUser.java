package core.data;

import core.commands.AddNew;
import core.commands.Asker;
import vk.VKManager;

import java.util.ArrayList;

public class DataUser {
    public int url;
    public String FIO;
    public int age;
    public String phone;
    public String school;
    public String days;
    public String places;
    public String individual;
    public String classSchool;
    public boolean start = false;
    public byte question = 0;
    public String programms;
    public String distant;
    public boolean sendMessage = false;
    public boolean keuboardOn = false;
    public boolean oneTime = true;

    public DataUser(int url){
        this.url = url;
        Asker.dataUsers.add(this);
    }

    @Override
    public String toString() {
        return "DataUser{" +
                "Ссылка на человека: http://vk.com/id" + url +
                ",\n ФИО='" + FIO + '\'' +
                ",\n Возраст=" + age +
                ",\n Телефон='" + phone + '\'' +
                ",\n Школа='" + school + '\'' +
                ",\n Дни, в которые удобно='" + days + '\'' +
                ",\n Вид занятия='" + individual + '\'' +
                ",\n Класс в школе='" + classSchool + '\'' +
                ",\n Дистанционно или в классе ='" + distant + '\'' +
                ",\n Площадка='" + places + '\'' +
                ",\n Интересующие программы='" + programms + '\'' +
                '}';
    }
}
