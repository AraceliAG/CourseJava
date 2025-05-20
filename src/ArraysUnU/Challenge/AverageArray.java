package ArraysUnU.Challenge;
import java.util.Scanner;

public class AverageArray {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int [] array = new int [7];

        for(int i = 0; i<array.length; i++){
            array[i] = sc.nextInt();
        }
        int p=0, n=0, z=0;
        float p2=0, n2=0;
        for(int i: array){

            if(i>0){
                p++;
                p2+=i;
            }else if(i<0){
                n++;
                n2+=i;
            }else  if (i==0){
                z++;
            }
        }

        System.out.println("Average positive number: " + p2/p);
        System.out.println("Average negative number: " + n2/n);
        System.out.println("Total 0: " + z);

    }
}
