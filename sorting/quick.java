public class quick {
    public static void function(int arr[], int si, int ei){
        // base case
        if(si>=ei){
            return;
        }
        // work
        int pivot = pivotfun(arr,si,ei);    // last element
        function(arr, si, pivot-1);     // left
        function(arr, pivot+1, ei);     // rigth
        
    }
    public static int pivotfun(int arr[], int si, int ei){
        int pivot = arr[ei];
        int i = si-1;   // to make place for element smaller than pivot
        for(int j = si; j<ei; j++){
            if(arr[j] <= pivot){
                i++;
                //swap
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        //swap of pivot on its position
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;
        return i;
    }
    public static void printfun(int arr[]){
        for (int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {6,3,9,8,2,5};
        function(arr, 0, arr.length-1);
        printfun(arr);
    }
}
