package ArraysUnU;

import java.util.Scanner;
public class ChallengePositionArrayAddValue {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int [] array = {1,2,3,4,5,6,7,8,9,0};

        int position, num;

        System.out.println("Enter number that you want  to add to the array: ");
        num = sc.nextInt();
        System.out.println("Enter the position that you want to add the number: ");
        position = sc.nextInt();

        int temp = array[position];
        for(int i = 0; i<array.length; i++){
            if(array[i] ==position){
            array[i] = num;
            }
        }
        System.out.println("--------------------");

        for(int i = position; i<array.length;i++ ){
           // System.out.println(array[i]);
            array[i] = temp-1;
            temp ++;



        }



        System.out.println("----------------finish:  ");
        for(int i :array){
            System.out.println(i);
        }

    }
}
