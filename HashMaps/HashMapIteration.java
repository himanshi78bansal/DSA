import java.util.*;

public class HashMapIteration {
    public static void main(String[] args) {
        HashMap <String, Integer> hm = new HashMap<>();

        hm.put("Ram", 99);
        hm.put("Shyam", 98);
        hm.put("Sita", 100);
        hm.put("gita", 99);

        Set <String> keys = hm.keySet();    // O(1)
        System.out.println(keys);

        for(String k : keys){
            System.out.println("Key = " + k + " and its marks = " + hm.get(k));
        }
    }    
}
