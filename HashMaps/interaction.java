// Intersaction of two arays

import java.util.*;

public class interaction {
    public static void main(String[] args) {
        int arr1[] = {7,3,9};
        int arr2[] = {6,3,9,2,9,4};
        List<Integer> ans = new ArrayList<>();

        HashSet <Integer> set = new HashSet<>();

        for(int i : arr1){
            set.add(i);
        }

        int count = 0;
        for(int i : arr2){
            if(set.contains(i)){
                count++;
                ans.add(i);
                set.remove(i);
            }
        }
        System.out.println(ans);
        System.out.println(count);
    }
}
