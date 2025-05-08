package ArraysUnU;
import java.util.Random;

public class BubbleAAG {

    public static void bubble(int [] list){
        boolean swapped  = true; //BUBBLE *_*
        while (swapped ){
            swapped  = false;
            for(int i = 0; i<list.length-1; i++){
                if(list[i]>list[i+1]){
                    swapped  =true;
                    int temp = list[i];
                    list[i] = list[i+1];
                    list[i+1] = temp;
                }
            }

        }
    }

    public static void main (String [] args){
        Random rd = new Random();
        int [] list = new int [10];

        for(int i = 0; i<list.length; i++){
            list[i] = rd.nextInt(100);
        }
        bubble(list);


    }
}
