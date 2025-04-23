package ExampleDate;
import java.util.Date;

public class GetTimeProgram {
    public static void main (String[] args){
        Date start = new Date();

        long sum=0;
        for(int i = 0; i<1000000; i++){
            sum+=i;
        }
        Date end = new Date();
        long endTime =  end.getTime()-start.getTime();
        System.out.println("End Time: " + endTime);
    }

}
