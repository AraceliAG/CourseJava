package ArraysUnU;

public class ChallengeArrayNumber {

    public static void main (String[] args){
        int[] array ={1,2,3,4,5,6,7,8,9,10};

        System.out.print("Original: ");
        for(int i: array){
            System.out.println(i);
        }

        int last=array[array.length-1]; //LAST VALUE
        System.out.println(" ");
        System.out.println("Later: ");
        System.out.println(array[array.length-2]);
        for(int i = array.length -2; i>=0;i-- ){
            System.out.println("i: " + array[i+1] + " j: " + array[i]);
            array[i+1] = array[i];
        }

        array[0] = last;

        for(int i:array){
            System.out.println(i);
        }
    }
}
