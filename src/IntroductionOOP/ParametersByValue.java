package IntroductionOOP;

public class ParametersByValue {

    public static  void main(String[] args ){

        int hours = 2;
        String animal = "Pigs";

        System.out.println("Method main: ");
        System.out.println(animal + " mate for about " + hours + " hours");

        System.out.println("Method conversion: ");
        conversion(hours, animal);

    }

    public static void conversion(int hours, String animal){

        hours = 4;
        animal = "Horses";

        System.out.println(animal + " mate for about " + hours + " hours");

    }
}
