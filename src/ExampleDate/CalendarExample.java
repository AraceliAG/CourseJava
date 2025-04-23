package ExampleDate;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalendarExample {

    public static void main(String[]args){
        Calendar calendarX = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        Date dateX = calendarX.getTime();
        String endDate = sdf.format(dateX);

        System.out.println(endDate);

    }
}
