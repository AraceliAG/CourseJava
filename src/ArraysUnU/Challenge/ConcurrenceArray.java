package ArraysUnU.Challenge;

public class ConcurrenceArray {

    public static void main (String[] args){
        int [] array = {1, 2, 3, 3, 4, 5, 5, 5, 6, 7};
        int pivot = array[0];
        int counter = 0;
        int counter2 =0;

        for (int i=0;  i<array.length; i++){
            for(int j = 0; j<array.length; j++) {
                System.out.println(array[j]);
            }
//                if(array[i] == array[j]){
//                    counter++;
//                    System.out.println(array[j] + "=" + counter);
//
//                }




        }

        System.out.println(pivot+ "= " + counter);
    }
}
