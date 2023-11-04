// Given an array of size n, find all elements that appear more than [n/3] times.

import java.util.*;

public class majorityElement{
    public static void main(String[] args) {

        int nums[] = {1,3,2,5,1,3,1,5,1};          // example 1
        // int nums[] = {1,2};                     // example 2
        int n = nums.length;

        HashMap <Integer, Integer> map = new HashMap<>();
        
        for(int i = 0; i<nums.length; i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i], map.get(nums[i])+1);  // key = nums[i], value = frequency of occuring
            } else {
                map.put(nums[i],1);
            }

            // map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
            // it can be used instead of if statement 
            // it returns value of key by nums[i] and also can give defaultValue as 0
            
            // System.out.println("i = "+ i + " and than map = " + map);  // to check
        }

        ArrayList <Integer> arr = new ArrayList<>();

        for(int key : map.keySet()){
            if(map.get(key) > (n/3)){
                arr.add(key);
            }
        }
        System.out.println(arr);
    }
}

// O(n)