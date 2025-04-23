package ExampleDate;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Date2 {

    public static void main (String[] args){

        Date dt = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MMMM -yyyy HH:mm:ss");
        String dateF = sdf.format(dt);
        System.out.println(dateF);

    }
}
