package assign.ch11.exam15;

import java.util.Calendar;

public class CalendarExample {
    public static void main(String[] args) {
        Calendar now = Calendar.getInstance();

        int year = now.get(Calendar.YEAR);//상수 선언 k5 1번 그랜져 2번 했던 거 생각
        int month = now.get(Calendar.MONTH);
        int day = now.get(Calendar.DAY_OF_MONTH);

        int week = now.get(Calendar.DAY_OF_WEEK);
        String weekday = null;

//        if (week == Calendar.MONDAY) {
        if (week == 1) {
            weekday = "일요일";
        }
        else if (week == 2) {
            weekday = "월요일";
        }
        else if (week == 3) {
            weekday = "화요일";
        }
        else if (week == 4) {
            weekday = "수요일";
        }
        else if (week == 5) {
            weekday = "목요일";
        }
        else if (week == 6) {
            weekday = "금요일";
        }
        else if (week == 7) {
            weekday = "토요일";
        }
        int amPm = now.get(Calendar.AM_PM);
        String amPmString = null;
        if (amPm == Calendar.AM) {
            amPmString = "오전";
        } else {
            amPmString = "오후";
        }

        int hour = now.get(Calendar.HOUR_OF_DAY);
        int minute = now.get(Calendar.MINUTE);
        int second = now.get(Calendar.SECOND);

        System.out.print(year + "년 ");
        System.out.print(month + "월 ");
        System.out.println(day + "일");
        System.out.print(weekday + " ");
        System.out.println(amPmString);
        System.out.print(hour + "시 ");
        System.out.print(minute + "분 ");
        System.out.print(second + "초");
    }
}
