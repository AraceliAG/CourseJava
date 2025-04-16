package bucles;

import java.util.Scanner;
public class ForArrayBreakContinue {
    public static  void main(String[] args){
        String[] names = {"juan", "Pedro", "Roberto", "Bryan"};

        System.out.println("Here I print elements of my array");
        for (int i = 0; i<names.length; i++){

            System.out.println(names[i]);
        }

        System.out.println("\nHere I print elements if they aren't on the condition");
        for (int i = 0; i<names.length; i++){
            if(names[i].equalsIgnoreCase("juan") ||
            names[i].equalsIgnoreCase("Bryan")){
                //If those names are equals at the condition, then ignore and continue my loop
                continue;
            }
            System.out.println(names[i]);
        }

                //Scanner sc=new Scanner(System.in);

    }
}
