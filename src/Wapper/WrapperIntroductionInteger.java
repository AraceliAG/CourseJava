package Wapper;

public class WrapperIntroductionInteger {
    public static void main(String[] args ){

        int a =12;
        String num = "123";

        Integer num2 = Integer.valueOf(num);

        System.out.println("This is a string to int conversion");

        Integer[] array = {1,2,3,4,5,6,7,8,9,10};

        int counter = 0;
        for (Integer i: array){
            if(i%2==0){
                counter+=i;
            }
        }
        System.out.println("Result: " + counter);

        int[] array2 = {1,2,3,4,5,6,7,8,9,10};
        for(int i:array2){
            System.out.println(i);
        }

        String lastStringNumber = "777";
        Integer lastNum = Integer.valueOf(lastStringNumber);
        System.out.println(lastNum);

    }
}
