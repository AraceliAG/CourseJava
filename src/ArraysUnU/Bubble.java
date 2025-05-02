package ArraysUnU;

public class Bubble {


    public static void main (String [] args ){

        int [] array = {2,5,6,8,4,7,10,3,9,1};
        int size = array.length;

        for(int i = 0; i<size; i++ ){
            System.out.println("This number is i: " + array[i]);
            for(int j=0; j<size;j++ )

                if(array[i]<array[j]){
                    System.out.println("This number is j: " + array[j]);
                    int aux = array[i];
                    array[i] = array[j];
                    array[j] = aux;
                }

        }

        System.out.println("--------------");

        for (int n : array) {
            System.out.println(n);

        }
    }
}
