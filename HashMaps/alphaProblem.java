// Find Itinerary from Tickets

import java.util.*;
public class alphaProblem {
    public static String function(HashMap <String, String> map){
        HashMap <String, String> revMap = new HashMap<>();

        for(String key : map.keySet()){
            revMap.put(map.get(key), key);
        }
        
        System.out.println(revMap);
        
        for(String key : map.keySet()){
            if(!revMap.containsKey(key)){
                return key; // starting point
            }
        }
        return null;
    }
    public static void main(String[] args) {

        // from - to (given)
        HashMap <String, String> map = new HashMap<>();
        map.put("Chennai", "Bengluru");
        map.put("Mumbai", "Delhi");
        map.put("Goa", "Chennai");
        map.put("Delhi", "Goa");

        // System.out.println(map);

        String start = function(map);
        System.out.print(start);

        for(String key : map.keySet()){
            System.out.print("->"+map.get(start));
            start = map.get(start);
        }
    }
}
