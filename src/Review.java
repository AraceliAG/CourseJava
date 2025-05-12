import java.util.Random;

public class Review {

    public static void main (String[] args){
        Random rdm  = new Random();
        int [] array = new int[10];

        for(int i = 0; i<array.length; i++){
            array[i] = rdm.nextInt(100);
        }

        for(int a:array){
            System.out.println(a);
        }

        boolean flag = true;

        while(flag){
            flag=false;

            for(int i=0; i<array.length - 1; i++){
                if(array[i]>array[i+1]){
                    flag=true;
                    int temp = array[i];
                    array[i] = array[i+1];
                    array[i+1]=temp;

                }
            }
        }
        System.out.println(" ");
        for(int i: array){
            System.out.println(i);
        }

    }


}
