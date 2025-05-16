//OVERVIEW
import java.util.HashSet;
import java.util.HashMap;
public class HashMapAndSet {
    public static void main (String [] args){

        HashSet <String> testHashSet =  new HashSet<String> ();

        testHashSet.add("Juanito");
        testHashSet.add("Juanita");
        testHashSet.add("Juan");
        testHashSet.remove("Juanito");

        System.out.println(testHashSet);

        HashMap<String, String> testHashMap = new HashMap <String, String> ();
        testHashMap.put("1", "Juanito");
        testHashMap.put("2", "Juanita");
        testHashMap.put("3", "Juan");
        testHashMap.remove("2");

        System.out.println(testHashMap);

    }
}
