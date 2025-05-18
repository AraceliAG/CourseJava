package ArraysUnU;

import java.util.Scanner;
public class DeleteElementArray {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        int[] array = {1,2,3,4,5,6,7,8,9,10};

        for(int i:array){
            System.out.println(i);
        }

        System.out.println("Insert position: ");
        int n;
        n= sc.nextInt();

        for(int i = n; i<array.length-1; i++){
            array[i] = array[i+1];
        }

        int[] b = new int [array.length-1];
        System.arraycopy(array, 0, b, 0, b.length);
        array=b;
        System.out.println("Array: ");
        for(int i: b){
            System.out.println(i);
        }
    }
}
