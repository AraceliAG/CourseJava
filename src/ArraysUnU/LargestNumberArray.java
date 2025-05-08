package ArraysUnU;
import java.util.Random;

public class LargestNumberArray {
    public static void main(String[] args){

        Random rdm = new Random();
        int array [] = new int [10];

        for(int i = 0; i<array.length; i++){
            array[i] = rdm.nextInt(100);
        }

        for(int i = 0; i< array.length; i ++){
            System.out.print (array[i] + " ");
        }

        int max= 0;
        for(int i = 0 ; i< array.length; i++){

            if(array[max] > array[i]){
                continue;
            }else{
                max = i;
            }
        }
        System.out.println();
        System.out.println("Largest number is: " + array[max]);
    }
}
