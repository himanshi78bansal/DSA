// Occurence of an element in array

public class arrayOccurence {
    public static void function(int arr[], int key, int i){
        // base case 
        if(i == arr.length){
            return;
        }

        // kaam 
        if(arr[i] == key){
            System.out.println(i);
        }
        function(arr, key, i+1);

    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,2};

        function(arr, 2, 0);
    }
}
    

