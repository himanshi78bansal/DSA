class onArrays{
    public static void function(int arr[], int i, int val){
        // base case
        if (i == arr.length){
            printfun(arr);
            return;
        }
        // recursion
        arr[i] = val;  //current value
        function(arr, i+1, val+1);  
        arr[i] = arr[i]-2;   //returning value (backtracking)
    }
    public static void printfun(int arr[]){
        for (int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int arr[] = new int [5];
        function(arr, 0, 1);
        printfun(arr);
    }
}

// time - O(n)
// space - O(n)