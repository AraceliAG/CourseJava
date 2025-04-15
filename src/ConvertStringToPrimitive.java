import java.util.Scanner;
public class ConvertStringToPrimitive {


    public static void main(String[] args){
        String word;
        double n1;
        float n2;
        String bool;
        boolean b;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number ");
        word= sc.next();
        System.out.println("Enter a word: ");
        bool = sc.next();
        n1 = Double.parseDouble(word);
        n2 = Float.parseFloat(word);
        b = Boolean.parseBoolean(bool);


        System.out.println(n1);
        System.out.println(n2);
        System.out.println(b);


    }
}
