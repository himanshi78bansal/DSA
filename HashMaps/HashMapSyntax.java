import java.util.*;

public class HashMapSyntax{
    public static void main(String[] args) {
        HashMap <String, Integer> hm = new HashMap<>();
        // Insert
        hm.put("India",100);    // O(1)
        hm.put("China", 150);
        hm.put("USA", 50);

        System.out.println(hm);
        // remove
        hm.remove("China");
        System.out.println(hm);

        // Get
        System.out.println(hm.get("India"));    // O(1)

        // contains
        System.out.println(hm.containsKey("India"));
        System.out.println(hm.containsKey("Indonesia"));

        // size
        System.out.println(hm.size());

        // isEmpty
        System.out.println(hm.isEmpty());

        // clear
        hm.clear();
        System.out.println(hm.isEmpty());

    }
}