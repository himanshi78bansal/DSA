import java.util.ArrayList;
public class Two_D {
    public static void main(String[] args) {
        // main list
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        
        // inner list 1
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1); list1.add(2);
        mainList.add(list1);

        // inner list 2
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(3); list2.add(4);
        mainList.add(list2);

        System.out.println(mainList);
    }
}
