public class primitivosFloat {


    public static void main (String[] args){
        //WHEN THERE is 2.12e2f IT MEANs moving the decimal point 2 place to the right
        //and when it is 2.122e-10f, it means moving the decimal point 10 place to the left


        float num1 = 2.12e2f;
        float num2 = 2.12e-10f;
        System.out.println(num1);
        System.out.println(num2);

        System.out.printf("%.12f%n", num2);

        System.out.println(Float.SIZE);
        System.out.println(Float.BYTES);
        System.out.println(Float.MAX_VALUE);
        System.out.println(Float.MIN_VALUE);
        System.out.println(" ");
        System.out.println(Double.SIZE);
        System.out.println(Double.BYTES);
        System.out.println(Double.MAX_VALUE);
        System.out.println(Double.MIN_VALUE);
    }


}
