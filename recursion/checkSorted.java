// to check whether the array is sorted or not

public class checkSorted {
    public static boolean myfunction(int i, int arr1[]){
        if(i == 1){         // base case
            return true;
        }

        if(arr1[i]<arr1[i-1]){          //check condition
            return false;
        }

        return myfunction(i-1, arr1);     // function call
    }   

    public static boolean herfunction(int i, int arr[]){
        if(i == arr.length-1){         // base case
            return true;
        }

        if(arr[i]>arr[i+1]){          //check condition
            return false;
        }

        return herfunction(i+1, arr);     // function call
    }   
    public static void main(String[] args) {
        // int arr1[] = {1,3,5,7,9,12};
        int arr[] = {3,2,6,8,1,7};

        // int i = arr1.length-1;      // for my function
        int i = 0;          // for her function

        // if(myfunction(i, arr1) == true){
        //     System.out.println("sorted");
        // } else {
        //     System.out.println("unsorted");
        // }

        if(herfunction(i, arr) == true){
            System.out.println("sorted");
        } else {
            System.out.println("unsorted");
        }
    } 
}
