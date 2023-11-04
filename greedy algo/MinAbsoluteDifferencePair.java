//Given two arrays A and B of equal n. 
// Pair each element of array A to an element in array B, 
// such that the sum S of absolute difference of all pairs is minimum.

import java.util.*;
public class MinAbsoluteDifferencePair {
    public static void main(String[] args) {
        int a[] = {4,1,8,7};
        int b[] = {2,3,6,5};

        Arrays.sort(a);
        Arrays.sort(b);

        int minDiff = 0;

        for(int i = 0; i<a.length; i++){
            minDiff += Math.abs(a[i]-b[i]);
        }
        System.out.println("Minimum absolute difference of pairs : " + minDiff);
    }
}
