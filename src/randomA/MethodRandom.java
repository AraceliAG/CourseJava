package randomA;

public class MethodRandom {
    public static void main(String [] args){
        String[] colors ={"Red", "Yellow", "Blue", "Green", "Black"};

        double rd = Math.random();
        double sizeColors = colors.length - 1; //Declaration size
        rd = rd*=sizeColors;
        rd = Math.floor(rd);
        //System.out.println(Math.floor(sizeColors));
        System.out.println(colors[(int)rd]);
    }
}
