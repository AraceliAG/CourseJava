package ArraysUnU;
import java.util.Arrays;

public class ModifyArray {
    public static void main(String[] args){

        int[] list ={1,2,3,4,5,6,7,8};

        Arrays.sort(list);

        int size = list.length;
        int size2 = list.length;

        for(int i =0; i<size2/2; i++){
            int numberCurrent = list[i];
            int lastNumber = list[size-1-i];

            list[i] = lastNumber;
            list[size-1-i] = numberCurrent;
            size2--;
        }
        for(int i = 0; i<list.length; i++){
            System.out.println(list[i]);

        }
    }
}
