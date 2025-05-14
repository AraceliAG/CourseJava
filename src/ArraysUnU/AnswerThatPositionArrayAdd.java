package ArraysUnU;
import java.util.Scanner;

public class AnswerThatPositionArrayAdd {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);

        int array [] = {1,2,3,4,5,6,7,8,9,0};

        int number, position;
        number = sc.nextInt();
        position = sc.nextInt();

        for(int i = array.length-2; i>=position; i--){
            array[i+1] = array[i];
        }

        array[position]=number;
        for(int i: array){
            System.out.println(i);
        }
    }
}
