import java.util.*;

public class HashSetIteration {
    public static void main(String[] args) {
        HashSet <String> name = new HashSet<>();

        name.add("Ram");
        name.add("Shyam");
        name.add("Sita");
        name.add("Gita");

        // 1. Iteration using iterator
        Iterator it = name.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        // 2. Iteration using enhanced for loop
        for(String val : name){
            System.out.println(val);
        }
    }
}
