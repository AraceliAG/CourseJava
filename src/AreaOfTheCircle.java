import java.util.Scanner;


//area = PI*r²
public class AreaOfTheCircle {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        double area, radio;
        double pi = Math.PI;
        System.out.println("ENTER THE CIRCLE'S RADIUS   : ");
        radio = sc.nextFloat();
        area = pi * (Math.pow(radio, 2));

        System.out.println("CIRCLE'S AREA: " + area);
    }
}
