import java.util.Scanner;
public class Buffer {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        int i = sc.nextInt();
        double d = sc.nextDouble();
        //It's important to clean the buffer because nextLine() reads the leftover "\n"
        sc.nextLine();
        String s = sc.nextLine();

        System.out.println("String : " + s);
        System.out.println("Double : " + d);
        System.out.println("Int: " + i);

    }
}
