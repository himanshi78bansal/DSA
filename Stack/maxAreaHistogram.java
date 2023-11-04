// Maximum area of rectangle in histogram

// Answer based on next Greater

import java.util.*;

public class maxAreaHistogram { //O(n)
    public static int function(int arr[]){
        int left[] = leftSmaller(arr);
        int right[] = rightSmaller(arr);
        int area[] = new int[arr.length]; // height * width
        int max = 0;

        for(int i = 0; i<arr.length; i++){
            int height = arr[i];
            int width = right[i] - left[i] - 1;
            area[i] = height * width;
            max = Math.max(area[i], max);
        }

        return max;
    }

    // smaller in left direction left[] = {-1,-1,1,2,1,4} (index)
    public static int[] leftSmaller(int arr[]){
        int left[] = new int[arr.length];
        Stack <Integer> s = new Stack<>();

        for(int i = 0; i<arr.length; i++){
            while(!s.isEmpty() && arr[s.peek()] >= arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                left[i] = -1;
            } else {
                left[i] = s.peek(); // stores index
            }
            s.push(i); // remember - storing index(i) of array instead of valuearr(i) in the stack
        }
        return left;
    }

    // smaller in right direction right[] = {1,6,4,4,6,6} (index)
    public static int[] rightSmaller(int arr[]){
        int right[] = new int[arr.length];
        Stack <Integer> s = new Stack<>();
        
        for(int i = arr.length-1; i>=0; i--){
            while(!s.isEmpty() && arr[s.peek()] >= arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                right[i] = arr.length;
            } else {
                right[i] = s.peek();
            }
            s.push(i);
        }
        return right;
    }

    public static void main(String[] args) {
        int arr[] = {2,1,5,6,2,3}; // heights of histogram
        System.out.println("max area in histogram : "+function(arr));
    }
}
