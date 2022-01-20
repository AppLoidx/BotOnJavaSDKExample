package core.mailing;

import java.util.Date;
import java.util.Objects;

public class DateObject {
    byte month;
    byte weekDay;
    byte monthDay;
    public String time="";
    public int url;
    public String message = "";
    public DateObject(Date date){
        month=getMonth(date);
        weekDay=getWeekDay(date);
        monthDay = getMonthDay(date);
        time = getTime(date);
    }
    public DateObject(String date){
        String[] dateSplit = date.split(" ");
         month = Byte.valueOf(dateSplit[1]);
        weekDay = Byte.valueOf(dateSplit[2]);
        monthDay = Byte.valueOf(dateSplit[3]);
        time = (Integer.valueOf(dateSplit[4].split(":")[0])-1) + ":" + dateSplit[4].split(":")[1] + ":" + dateSplit[4].split(":")[2];
        if((Integer.valueOf(dateSplit[4].split(":")[0])-1)<10){
            time = "0"+time;
        }
        message = setMessage(String.valueOf(dateSplit[5]));
        url = Integer.valueOf(dateSplit[6]);
    }
    public byte getWeekDay(Date date){
        String weekDay = date.toString().split(" ")[0];
        switch (weekDay){
            case "Mon":
                return 0;
            case "Tue":
                return 1;
            case "Wed":
                return 2;
            case "Thu":
                return 3;
            case "Fri":
                return 4;
            case "Sat":
                return 5;
            case "Sun":
                return 6;
            default:
                return -1;
        }
    }
    public byte getMonth(Date date){
        String month = date.toString().split(" ")[1];
        switch (month){
            case "Jan":
                return 0;
            case "Feb":
                return 1;
            case "Mar":
                return 2;
            case "Apr":
                return 3;
            case "May":
                return 4;
            case "Jun":
                return 5;
            case "Jul":
                return 6;
            case "Aug":
                return 7;
            case "Sep":
                return 8;
            case "Oct":
                return 9;
            case "Nov":
                return 10;
            case "Dec":
                return 11;
            default:
                return -1;
        }
    }
    public byte getMonthDay(Date date){
        return Byte.parseByte(date.toString().split(" ")[2]);
    }
    public String getTime(Date date){

        return date.toString().split(" ")[3].split(":")[0] +":" + date.toString().split(" ")[3].split(":")[1] + ":" +date.toString().split(" ")[3].split(":")[2];
    }

    public String setMessage(String num){
        try {
            switch (Integer.valueOf(num)) {
                case 0:
                    return "Здравствуйте, не забудьте про занятие в Школе Роботов в " + (Integer.valueOf(time.split(":")[0]) + 1) + ":" + time.split(":")[1];
                case 1:
                    return "Здравствуйте, не забудьте про оплату на занятиях в Школе Роботов";
            }
        }catch (Exception e){
            return num;
        }
        return num;
    }

    @Override
    public boolean equals(Object o) {
        DateObject that = new DateObject(new Date());
        if (this == o) return true;
        if(month!=-1){
            if(month==that.month){
                if(monthDay!=-1){
                    if(monthDay == that.monthDay){
                        if(weekDay!=-1){
                            if(weekDay == that.weekDay){
                                if(time.equals(that.time)){
                                    return true;
                                }else {
                                    return false;
                                }
                            }else {
                                return false;
                            }
                        }else {
                            if(time.equals(that.time)){
                                return true;
                            }else {
                                return false;
                            }
                        }
                    } else {
                        return false;
                    }
                }else {
                    if(weekDay!=-1){
                        if(weekDay == that.weekDay){
                            if(time.equals(that.time)){
                                return true;
                            }else {
                                return false;
                            }
                        }else {
                            return false;
                        }
                    }else {
                        if(time.equals(that.time)){
                            return true;
                        }else {
                            return false;
                        }
                    }
                }
            }else {
                return false;
            }
        }else {
            if(monthDay!=-1){
                if(monthDay == that.monthDay){
                    if(weekDay!=-1){
                        if(weekDay == that.weekDay){
                            if(time.equals(that.time)){
                                return true;
                            }else {
                                return false;
                            }
                        }else {
                            return false;
                        }
                    }else {
                        if(time.equals(that.time)){
                            return true;
                        }else {
                            return false;
                        }
                    }
                } else {
                   return false;
                }
            }else {
                if(weekDay!=-1){
                    if(weekDay == that.weekDay){
                        if(time.equals(that.time)){
                            return true;
                        }else {
                            return false;
                        }
                    }else {
                        return false;
                    }
                }else {
                    if(time.equals(that.time)){
                        return true;
                    }else {
                        return false;
                    }
                }
            }
        }
    }

    @Override
    public String toString() {
        return "month= " + month +
                ", weekDay= " + weekDay +
                ", monthDay= " + monthDay +
                ", time= '" + time + '\'' +
                ", url= '" + url + '\'' +
                ", message= '" + message + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(month, weekDay, monthDay, time);
    }
}
