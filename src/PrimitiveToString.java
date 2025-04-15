import java.util.Scanner;

public class PrimitiveToString {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n1 =10;
        float nf;
        String a,b,c;
        a = Integer.toString(n1);
        System.out.println(a + "Uwu");

        System.out.println("ENTER NUMBER ");
        nf = sc.nextFloat();
        b = Float.toString(nf);
        c = String.valueOf(nf);
        System.out.println(b);
        System.out.println(c);

    }




}
