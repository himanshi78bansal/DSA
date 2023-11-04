public class firstOccurence {
    public static int function(int arr[], int i, int key){

        if(i == arr.length-1){              // Base case
            return -1;
        }
        if(arr[i] == key){          // check condition
            return i;
        }
    
    return function(arr, i+1, key);
}
    public static void main(String[] args) {
        int arr[] = {1,2,4,6,3,1,8,9,2};

        System.out.println(function(arr, 0, 9));

    }
}


// time and space complexity = O(n)