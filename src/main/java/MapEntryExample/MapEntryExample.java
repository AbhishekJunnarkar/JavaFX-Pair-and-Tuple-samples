package MapEntryExample;


import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * Map.Entry interface in Java provides certain methods to access the entry in the Map. \
 * By gaining access to the entry of the Map we can easily manipulate them.
 * Map.Entry is a generic and is defined in the java.util package.
 */
public class MapEntryExample {

    //equals (Object o) – It compares the object (invoking object) with the Object o for equality
    //K getKey() – Returns the key for the corresponding map entry
    //V getValue() – Returns the value for the corresponding map entry
    //int hashcode() – Returns the hashcode for the corresponding map entry
    //V setValue(V v) – Sets the value of the map with specified value v
    //Set<Map.Entry> entrySet() – Returns the Set view of the entire map.
    public static void main(String[] args) {
        LinkedHashMap<String,Integer> m = new LinkedHashMap<>();

        m.put("Abhishek",37);
        m.put("Abhinav", 36);
        m.put("Priyanka",34);
        m.put("Sumedha", 33);

        //Using EntrySet to get the entries of the Map
        Set<Map.Entry<String,Integer>> s = m.entrySet();

        for( Map.Entry<String,Integer> it :s){
            //Use the getKey to get the key of the it element
            //Use the getValue to get the value of the it element
            System.out.println("Name is "+it.getKey() +" and age is "+it.getValue());
        }


    }
}
