public class practice {
    public static void count(int newarr){

        // return 1;
    }
    public static void main(String[] args) {
        int arr[] = {3,2,3,3,5,6,3};
        int newarr[] = new int[10];
        for(int i = 0; i<arr.length; i++){
            int n = arr[i];
            if(newarr[n] >= 0){
                count(n);
            }
        }
        // number(arr);
        // function(arr, 0, arr.length);
    }
}
