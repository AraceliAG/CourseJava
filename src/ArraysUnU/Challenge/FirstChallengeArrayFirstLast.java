package ArraysUnU.Challenge;

import java.util.Scanner;
public class FirstChallengeArrayFirstLast {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] array =new int[10];

        for(int i = 0; i<array.length; i++){
            System.out.println("Enter number: ");
            array[i] = sc.nextInt();
        }

        int counter = array.length-1;

        for(int i = 0; i<(array.length)/2; i++){
            System.out.println(array[counter-i] + " " + array[i] );

        }
    }
}
