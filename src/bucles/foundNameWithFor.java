package bucles;

import java.util.Scanner;
public class foundNameWithFor {
    public static void main(String[] args){
        String [] names = {"juan", "Pedro", "Roberto", "Bryan"};
        Scanner sc = new Scanner(System.in);
        String name;


        boolean evaluate = true;
        int i=0;
        do{
            System.out.println("Enter name for searching: ");
            name = sc.nextLine();

                if (names[i].toLowerCase().contains(name.toLowerCase())) {
                    System.out.println("The name exist in the array ");
                    evaluate = false;
                } else {
                    System.out.println("This name don't exist ");
            }
      }while (evaluate);



    }
}
