package ArraysUnU;
import java.util.Scanner;


public class AddElementArray {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        int [] array = {1,2,3,4,6,7,8,9,10};
        int [] array2 = new int[array.length + 1];

        int element, last, position;
        last = array [array.length-1];
        position = 0;
        System.out.println("Insert number for add to the array : ");
        element = sc.nextInt();

        while (position<array.length && element>array[position]){
            position++;
        }

        for(int i = array.length-2; i>=position; i--){
            array[i+1] = array[i];
        }
        System.arraycopy(array, 0, array2, 0, array.length);

        if(element>last){
            array2[array2.length -1]  = element;
        }else{
            array2[array2.length-1] = last;
            array2[position] = element;
        }

        for(int i: array2){
            System.out.println(i);
        }

    }
}
