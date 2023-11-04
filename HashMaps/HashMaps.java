import java.util.*;

public class HashMaps {
    public static void main(String[] args) {

        HashMap <String, Integer> hm = new HashMap<>();     // Unordered
        hm.put("India",100);   // O(1)
        hm.put("China", 150);
        hm.put("Canada", 50);
        System.out.println(hm);

        LinkedHashMap <String, Integer> lhm = new LinkedHashMap<>();    // ordered
        lhm.put("India",100);   // O(1)
        lhm.put("China", 150);
        lhm.put("Canada", 50);
        System.out.println(lhm);

        TreeMap <String, Integer> thm = new TreeMap<>();    // sorted
        thm.put("India",100);   // O(1)
        thm.put("China", 150);
        thm.put("Canada", 50);
        System.out.println(thm);
    }
}
