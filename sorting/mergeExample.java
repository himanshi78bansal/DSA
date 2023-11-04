// Apply merge sort to sort an array of Strings.

public class mergeExample{
    public static String[] function(String arr[], int si, int ei){
        // Base case
        if(si == ei){
            String A[] = {arr[si]};
            return A;
        }

        //kaam
        int mid = (si+ei)/2;
        String arr1[] = function(arr, si, mid);  // left part
        String arr2[] = function(arr, mid+1, ei);  // right part
        String arr3[] = mergefun(arr1, arr2);  // right part
        return arr3;
    }

    public static String[] mergefun(String[] arr1, String arr2[]) {
        int m = arr1.length;
        int n = arr2.length;
        String temp[] = new String[m+n];    

        int i = 0; 
        int j = 0;
        int k = 0;

        while(i<m && j<n){
            if(if_alpha_smaller(arr1[i], arr2[j])){
                temp[k] = arr1[i];
                i++;
                k++;
            } else {
                temp[k] = arr2[j];
                j++;
                k++;
            }
        }
        while(i<m){
            temp[k] = arr1[i];
            i++;
            k++;
        }
        while(j<n){
            temp[k] = arr2[j];
            j++;
            k++;
        }
        return temp;
    }
    
    public static boolean if_alpha_smaller(String str1, String str2){
        if(str1.compareTo(str2) < 0){
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        String arr[] = {"sun", "earth", "mars", "mercury"};
        String a[] = (function(arr, 0, arr.length-1));
        for(int i = 0; i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}