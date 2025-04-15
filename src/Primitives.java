public class Primitives {

    public static  void main(String[] args){

        byte numByte = 122;
        short numShort = 32745;
        int numInt = 1123123123;
        long numLong =9223372036854775807L;


        System.out.println("numeros de byte " + Byte.BYTES);
        System.out.println("bites " + Byte.SIZE);
        System.out.println("numeros max " + Byte.MAX_VALUE);
        System.out.println("numeros min " + Byte.MIN_VALUE);
        System.out.println("");

        System.out.println("numeros de byte " + Short.BYTES);
        System.out.println("bites " + Short.SIZE);
        System.out.println("numeros max " + Short.MAX_VALUE);
        System.out.println("numeros min " + Short.MIN_VALUE);

        System.out.println("");
        System.out.println("numeros de byte " + Integer.BYTES);
        System.out.println("bites " + Integer.SIZE);
        System.out.println("numeros max " + Integer.MAX_VALUE);
        System.out.println("numeros min " + Integer.MIN_VALUE);

        System.out.println("");
        System.out.println("numeros de byte " + Long.BYTES);
        System.out.println("bites " + Long.SIZE);
        System.out.println("numeros max " + Long.MAX_VALUE);
        System.out.println("numeros min " + Long.MIN_VALUE);
    }
}
