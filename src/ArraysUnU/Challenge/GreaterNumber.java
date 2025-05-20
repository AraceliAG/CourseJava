package ArraysUnU.Challenge;

import java.util.Random;
public class GreaterNumber {
    public static  void main (String[] args){
        Random rd = new Random();
        int [] array = new int[11];

        for(int i = 0; i< array.length; i++){
            array[i] = rd.nextInt(11,100);
        }

        for(int i : array){
            System.out.println(i);
        }

        int piv = array[0];
        for(int i=1; i<array.length; i++){

            if(array[i]>piv){
                piv = array[i];
            }
        }
        System.out.println("Greater number is: " + piv);
    }
}
