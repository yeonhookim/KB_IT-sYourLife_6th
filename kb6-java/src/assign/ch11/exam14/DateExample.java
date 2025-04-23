package assign.ch11.exam14;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExample {
    public static void main(String[] args) {
        Date date = new Date(); //Date 클래스를 import 해야함
        String dateString = date.toString();
        System.out.println(dateString);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy.mm.dd HH:mm:ss");
        String dateString2 = sdf.format(date);
        System.out.println(dateString2);
    }
}
