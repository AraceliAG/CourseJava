package ExampleDate;

import java.text.ParseException;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ComparativeDate {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat format1 = new SimpleDateFormat("dd-MM-yyyy");
        Date date2 = new Date();  // Current date

        try {
            Date date = format1.parse("10-10-2002"); // First date

            System.out.println(format1.format(date)); // Print first date
            System.out.println(date2.getTime()); // Print second date (current time in milliseconds)

            if (date.after(date2)) {
                System.out.println("The first date is greater than the current date.");
            } else if (date.before(date2)) {
                System.out.println("The first date is less than the current date.");
            } else {
                System.out.println("Both dates are the same.");
            }

        } catch (ParseException p) {
            p.printStackTrace();
        }
    }
}
