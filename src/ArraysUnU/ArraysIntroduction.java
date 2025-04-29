package ArraysUnU;
import java.util.Arrays;
import java.util.Scanner;

public class ArraysIntroduction {

    public static void main(String[] args){
        int [] numbers = {5,2,4,3,1};
        Arrays.sort(numbers);
        for(int n:numbers){
            System.out.println(n);
        }
        int size = numbers.length;
        System.out.println("----------------");

        for(int i = size-1; i>=0; i--){
            System.out.println(numbers[i]);
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("----------------");
        System.out.println("What size do you want for your array? ");
        int sizeArray;
        sizeArray = sc.nextInt();
        int [] array2 = new int[sizeArray];

        for(int j = 0; j<sizeArray; j++){
            System.out.println("Enter number: ");
            array2[j] = sc.nextInt();
        }

        System.out.println("Final array: ");
        for(int nF:array2){
            System.out.println(nF);
        }



    }

}
