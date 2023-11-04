import java.util.*;

public class HashSets {
    public static void main(String[] args) {

        HashSet <String> name1 = new HashSet<>();   // Unordered
        name1.add("Ram");
        name1.add("Shyam");
        name1.add("Sita");
        name1.add("Gita");
        System.out.println(name1);

        LinkedHashSet <String> name2 = new LinkedHashSet<>();   // Ordered
        name2.add("Ram");
        name2.add("Shyam");
        name2.add("Sita");
        name2.add("Gita");
        System.out.println(name2);

        TreeSet <String> name3 = new TreeSet<>();   // Sorted
        name3.add("Ram");
        name3.add("Shyam");
        name3.add("Sita");
        name3.add("Gita");
        System.out.println(name3);
    }
}
