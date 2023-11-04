public class merge {
    public static void printfun(int arr[]){
        for (int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void dividefun(int arr[], int si, int ei){
        int mid = si+(ei-si)/2;
        if(si >= ei){
            return;
        }
        dividefun(arr, si, mid);     // left part
        dividefun(arr, mid+1, ei);   // right part
        mergefun(arr, si, mid, ei);
    }

    public static void mergefun(int arr[], int si, int mid, int ei){
        int temp[] = new int[ei-si+1];
        int i = si;     // iterator for left part
        int j = mid + 1;     // iterator for right part
        int k = 0;     // iterator for temp part

        while(i<=mid && j<=ei){
        if(arr[i]<arr[j]){
            temp[k] = arr[i];
            i++;
        } else {
            temp[k] = arr[j];
            j++;
        }
        k++;
    }

    //left part
    while(i<=mid){
        temp[k++] = arr[i++];
    }

    // right part
    while(j<=ei){
        temp[k++] = arr[j++];
    }

    // copy temp to original array
    for(i = si, k = 0; k<temp.length; i++,k++){
        arr[i] = temp[k];
    }

    }
    public static void main(String[] args) {
        int arr[] = {6,3,9,5,2,8};
        dividefun(arr,0, arr.length-1);
        printfun(arr);
    }
}
