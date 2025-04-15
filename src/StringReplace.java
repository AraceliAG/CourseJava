public class StringReplace {

    public static void main (String[] args){
        String name = "Luna";
        String lastName = "Zapata";

        String fullName = name.concat(" ".concat(lastName));

        String upper = fullName.replace("a", "A");

        System.out.println(upper);
    }
}
