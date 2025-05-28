package ArraysUnU.Challenge;

public class Histogram {

    public static void main(String[] args){
        int []  array = {4, 3, 4, 6, 6, 4, 1, 4, 5, 4, 1, 1};
        String a1 ="";

        for(int i = 1; i<7;i++){
            for(int j = 0; j<array.length;j++){
                if(i==array[j]){
                    a1+="*";
                }
            }System.out.println(i + ": "+ a1);
            a1="";
        }
    }
}
