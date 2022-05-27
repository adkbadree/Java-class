package Practice;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.Date;

public class PredefinedDatePractice {

    public static void main(String[] args) {

        Date today = new Date();
        LocalDate localDate = LocalDate.now();
        LocalTime localtime = LocalTime.now();
        LocalDateTime localDateTime = LocalDateTime.now();

        Calendar calendar = Calendar.getInstance();



        System.out.println(today);
        System.out.println(localDate);
        System.out.println(localtime);
        System.out.println(localDateTime);
        System.out.println(calendar);

    }
}
