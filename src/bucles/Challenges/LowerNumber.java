package bucles.Challenges;
import java.util.Scanner;
public class LowerNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int size;

        System.out.println("Enter the number of values to compare: ");
        size = sc.nextInt();
        int [] elements =new int[size];
        int num;

        for (int i = 0; i<size; i++){
            System.out.println("Enter the number ");
            num = sc.nextInt();
            elements[i] = num;
        }
        int pivot = elements[0];
        System.out.println(pivot);
        for (int i=1; i<elements.length; i++){
            if(pivot<elements[i]){

                continue;
            }
            pivot = elements[i];

        }
        if(pivot<10){
            System.out.println("The number "+ pivot+ " is less than 10" );

        }else {
            System.out.println("The number "+ pivot+ " is greater than 10 ");
        }



    }
}
