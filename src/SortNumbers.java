import java.util.Scanner;

public class SortNumbers {
    public static void main(String[] args){
        String resultado;
        int n1, n2;

        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER FIRST NUMBER: ");
        n1 = sc.nextInt();
        System.out.println("ENTER SECOND NUMBER: ");
        n2 = sc.nextInt();

        resultado = (n1 > n2) ? n1 + " y " + n2 : n2 + " y " + n1;


        System.out.println("Numbers sorted: " +  resultado);

    }
}
