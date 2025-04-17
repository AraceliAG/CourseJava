package bucles.Challenges;
import java.util.Scanner;
public class Multiplication {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double n1, n2;
        System.out.println("Enter first number: ");
        n1 = sc.nextDouble();
        System.out.println("Enter second number: ");
        n2 = sc.nextDouble();

        double counter=0;
        if(n1<0){
            for(int i =0; i<n2; i++){
                counter +=n1;
            }
        }else if (n1>=1){
            for(int i =0; i<n1; i++){
                counter +=n2;
            }
        }
        System.out.println("multiplication: " + counter);
    }
}
