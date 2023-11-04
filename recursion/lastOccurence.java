public class lastOccurence {
    public static int function(int arr[], int i, int key){
        if(i == 0){
            return -1;
        }
        if(arr[i] == key){
            return i;
        }
        return function(arr, i-1, key);
    }
    
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,6,9,2,0,4};
        System.out.println(function(arr, arr.length-1, 4));
    }    
}
