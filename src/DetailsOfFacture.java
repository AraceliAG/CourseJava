import java.util.Scanner;
public class DetailsOfFacture {
    public static void main (String [] args){

        String nameFacture;
        double price1, price2, addition, tax, total;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter name facture: ");
        nameFacture = sc.nextLine();

        System.out.println("Enter first price: ");
        price1 = sc.nextDouble();

        System.out.println("Enter second price: ");
        price2 = sc.nextDouble();

        addition = price1 + price2;
        tax = (addition * 0.19);
        total = addition + tax;

        System.out.println("The facture " + nameFacture + " has a total brute of "
        + addition +  " , with a tax of " + tax + " and the amount after" +
                "of tax is " + total);



    }
}
