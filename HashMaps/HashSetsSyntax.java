import java.util.*;
// import java.util.HashSet;

public class HashSetsSyntax{
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();

        hs.add(1);
        hs.add(2);
        hs.add(1);
        hs.add(5);
        hs.add(7);
        hs.add(5);  

        
        // to print
        System.out.println(hs);
        // only [1,2,5,7] will print bcoz no duplicate element allowed in set..


        // to remove
        hs.remove(2);

        // to check availability
        if(hs.contains(2)){
            System.out.println("2 not removed");
        } else {
            System.out.println("2 is removed");
        }

        // to check size
        System.out.println(hs.size());

        // to clear
        hs.clear();

        // check empty
        if(hs.isEmpty()){
            System.out.println("cleared");
        } else {
            System.out.println("not cleared");
        }
    }
}