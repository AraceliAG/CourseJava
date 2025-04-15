import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int opc;
        float n1, n2, addition, subtraction, multiplication, division;

        System.out.println("ENTER FIRST NUMBER: ");
        n1 = sc.nextFloat();

        System.out.println("ENTER SECOND NUMBER: ");
        n2 = sc.nextFloat();

        System.out.println("Your numbers are: " + n1 + " and " + n2);

        do {
            System.out.println("SELECT OPTION ");
            System.out.println("1. ADDITION ");
            System.out.println("2. SUBTRACTION ");
            System.out.println("3. MULTIPLICATION ");
            System.out.println("4. DIVISION ");
            System.out.println("5. EXIT");
            opc = sc.nextInt();

            switch (opc) {
                case 1:
                    addition = n1 + n2;
                    System.out.println("RESULT OF ADDITION: " + addition);
                    break;
                case 2:
                    subtraction = n1 - n2;
                    System.out.println("RESULT OF SUBTRACTION: " + subtraction);
                    break;
                case 3:
                    multiplication = n1 * n2;
                    System.out.println("RESULT OF MULTIPLICATION: " + multiplication);
                    break;
                //The division is equal to
                case 4:
                    division = n1 / n2;
                    System.out.println("RESULT OF DIVISION: " + division);


            }
        }while (opc<5);
    }
}
