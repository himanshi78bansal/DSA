import java.util.*;

public class anagram {

    public static boolean function(String s, String t){
        // best case - length not match
        if(s.length() != t.length()){
            return false;
        }
        // create hashmap for charcter and their frequency
        HashMap <Character, Integer> map = new HashMap<>();
        // store values in hashmap 
        // default value 0
        for(int i = 0; i<s.length(); i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)+1);
        }
        // compare with 2nd string 
        // if exist than reduce frequency by 1
        for(int i = 0; i<t.length(); i++){
            if(map.containsKey(t.charAt(i))){
                map.put(t.charAt(i), map.get(t.charAt(i))-1);
            } else {
                return false;
            }          
            if(map.get(t.charAt(i))==0){
                map.remove(t.charAt(i));
            }
        }

        return map.isEmpty();

    }
    public static void main(String[] args) {
        String s = "race";
        String t = "care";
        System.out.println(function(s,t));
    }
}

// O(n)
