// Union of two arrays

import java.util.*;

public class union {
    public static void main(String[] args) {
        int arr1[] = {7,3,9};
        int arr2[] = {6,3,9,2,9,4};

        HashSet <Integer> set = new HashSet<>();

        for(int i : arr1){
            set.add(i);
        }

        for(int i : arr2){
            set.add(i);
        }

        System.out.println("Union of two arrays : "+set);
        System.out.println("size : "+set.size());
    }    
}
