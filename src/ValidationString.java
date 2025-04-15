public class ValidationString {

    public static void main(String[] args){

        String a = " d";
        boolean bol = a.isBlank();

        if(bol){
            System.out.println("Is Empty");
        }else{
            System.out.println("Not empty");
        }

    }
}
