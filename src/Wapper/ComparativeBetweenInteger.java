package Wapper;

public class ComparativeBetweenInteger {

    public static void main(String[] args ){
        Integer num1 = Integer.valueOf(500);
        Integer  num2 =500;


        System.out.println("Value 1: " + num1);
        System.out.println("Value 2: " + num2);
        System.out.println("num1 is equal to num2 " + (num1.intValue()==num2.intValue()));
        System.out.println("num1 is equal to num2 " + (num1.equals(num2)));
    }
}
