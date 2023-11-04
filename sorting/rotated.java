// search target in a rounded sorted array 

public class rotated {
    public static int function(int arr[], int target, int si, int ei){
        // base case
        if(si>ei){
            return -1;
        }

        //kaam
        int mid = (si+ei)/2;

        // case found
        if (arr[mid] == target){
            return mid;
        }

        // mid at line 1
        if(arr[si] <= arr[mid]){
            // case a : left
            if(target >= arr[si] && target <= arr[mid]){
                return function(arr, target, si, mid-1);
            } else {
            // case b : right
                return function(arr, target, mid+1, ei);
            }
        }
        // mid at line 2 
        else {
            // case c : left
            if (target >= arr[mid] && target <= arr[ei]){
                return function(arr, target, mid+1, ei);
            } else {
            // case d : right
                return function(arr, target, si, mid-1);
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {5,7,9,10,2,4};
        System.out.println(function(arr, 10, 0, arr.length-1));
    }
}
