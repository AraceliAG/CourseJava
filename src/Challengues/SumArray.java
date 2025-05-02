package Challengues;
import java.util.Scanner;

public class SumArray {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int size;
        System.out.println("Enter the size of your array: ");
        size = sc.nextInt();
        int [] array = new int[size];

        for(int i = 0; i<size; i++){
            System.out.println("Enter number: ");
            array[i] = sc.nextInt();
        }

        int sum=0;

        for (int n: array) {
            sum+=n;

        }

        System.out.println("Sum array: " +  sum );

    }
}
