package IntroductionOOP;
import java.util.Scanner;
public class ParameterByReference {

    public static  void  main(String[] args ){
        Scanner sc = new Scanner(System.in);
        int [] array = new int[5];

        for(int i = 0; i < array.length; i++ ){
            System.out.println("Enter number: " );
            array[i] = sc.nextInt();
        }

        System.out.println("Final array from main : ");

        for(int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }

        System.out.println("array from method transformation: ");
        transformer(array);

    }

    public static  void transformer(int [] array){
        for(int i = 0; i< array.length;i++ ){

            System.out.println(array[i]+=10);
        }
    }
}
