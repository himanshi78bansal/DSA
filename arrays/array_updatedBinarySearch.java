// updated binary search (roteted sorted array) using loops

public class array_updatedBinarySearch{
    public static void main(String[] args) {
        int arr[] = {3, 5, 7, 8, 1, 2};
        int si = 0;
        int ei = arr.length-1;
        int mid = (si+ei)/2;
        int target = 7;

        // case : found
        if(arr[mid] == target){
            System.out.println(mid);
        }

        while(si <= ei){
                // mid at line 1
                if(arr[si] <= arr[mid]){
                    // case a : left side
                    if(target >= arr[si] && target <= arr[mid]){
                        ei = mid-1;
                    // case b : right side
                    } else {
                        si = mid+1;
                    }
                // mid at line 2
                } else {
                    // case c : right side
                    if (target >= arr[mid] && target <= arr[ei]){
                        si = mid+1;
                    // case d : left side
                    } else {
                        ei = mid-1;
                    }
                }
            }
            System.out.println(mid);
        }
    }