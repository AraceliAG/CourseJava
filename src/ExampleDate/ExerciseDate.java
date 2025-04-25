package ExampleDate;

//For this task, you are asked to enter a birthdate in
//string format, convert it into a java.util.Date,
//and calculate the person's age based on the current date.

import java.text.ParseException;
import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;

public class ExerciseDate {

    public static void main(String[] args){

        SimpleDateFormat format1 = new SimpleDateFormat("dd-MM-yyyy");
        Scanner sc = new Scanner(System.in);


        try{
            System.out.println("Enter your birthdate: ");
            String birthdateUser;
            birthdateUser = sc.nextLine();
            Date birthdate = format1.parse(birthdateUser);
            Date currentDate = new Date();

            long age ;
            age = currentDate.getTime() - birthdate.getTime();
            long endAge;
            endAge = age /(1000L * 60*60*24*365);
            System.out.println("Your age is: " + endAge);

        }catch (ParseException p){
            p.printStackTrace();;
        }

    }
}
