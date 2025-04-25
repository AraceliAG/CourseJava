package ExampleDate;

import java.text.ParseException;
import java.util.Date;
import java.text.SimpleDateFormat;

public class ConversionStringToDate {
    public static void main(String [] args){
        SimpleDateFormat format1 = new SimpleDateFormat("dd-MM-yyyy");

        try{
            Date date = format1.parse("04-20-2025");
            System.out.println(date);
            System.out.println(format1.format(date));
        }catch (ParseException p){
            p.printStackTrace();
        }


    }
}
