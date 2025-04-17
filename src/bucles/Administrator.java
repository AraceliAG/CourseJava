package bucles;
import java.util.Scanner;

public class Administrator {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int opc;

        System.out.println("Select an option: ");


        do{
            System.out.println("1. Update ");
            System.out.println("2. Delete");
            System.out.println("3. Add");
            System.out.println("4. List ");
            System.out.println("5. Exit");
            opc = sc.nextInt();

            switch (opc){
                case 1:
                    System.out.println("User updated successfully");
                    break;
                case 2:
                    System.out.println("User deleted successfully");
                    break;
                case 3:
                    System.out.println("User added successfully");
                    break;
                case 4:
                    System.out.println("Displaying the users list");
                    break;
            }
        }while(opc<5);

        System.out.println("You have exited the program");


    }
}
