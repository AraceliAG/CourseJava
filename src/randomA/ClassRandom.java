package randomA;

import java.util.Random;
public class ClassRandom {
    public static void main(String[] args){

        Random rd = new Random();
        int rdE = 100 + rd.nextInt(200 -100);
        System.out.println(rdE);

        String[] colors ={"Red", "Yellow", "Blue", "Green", "Black"};
        int color = rd.nextInt(colors.length);
        System.out.println(colors[color]);
    }
}
