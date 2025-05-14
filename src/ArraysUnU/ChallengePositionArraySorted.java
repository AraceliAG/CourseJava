package ArraysUnU;
import java.util.Scanner;

public class ChallengePositionArraySorted {
    public static void main (String[] args ){

        int number;
        int [] array = {15,17,19,23,25,27};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        number = sc.nextInt();

        int position=0;

        while (position< array.length && number>array[position]){
            position ++;
        }
        for (int i = array.length-2; i>=position; i--){
            array[i+1] = array[i];
            }

        array[position] = number;

        for (int i:array){
            System.out.println(i);
        }



    }
}
