public class StringConcatenation {

    public static void main(String[] args){

        String name = "Luna";
        String lastName = "Zapata";

        String fullName = name.concat(" ".concat(lastName));

        System.out.println(fullName);
    }
}
