package ArraysUnU;
import java.util.Random;

public class EvenOdd {
    public static void main(String[] args){
        Random rd = new Random();
        int[] array = new int[10];
        int evenC=0, oddC=0;

        for(int i =0; i<array.length; i++){
            array[i] = rd.nextInt(100);
        }

        for(int i = 0; i<array.length; i++){
            System.out.print(array[i] + " ");
        }

        for(int x: array){
            if(x % 2 ==0){
                evenC++;
            }else{
                oddC++;
            }
        }
        int[] even = new int [evenC];
        int [] odd = new int[oddC];
        int ev=0, od =0;

        for(int i:array){
            if(i % 2 ==0){
                even[ev] = i;
                ev++;
            }else{
                odd[od] = i;
                od++;
            }
        }
        System.out.println("even: ");
        for (int e : even){
            System.out.println(e);
        }
        System.out.println("odd: ");
        for (int o : odd){
            System.out.println(o);
        }
    }
}
