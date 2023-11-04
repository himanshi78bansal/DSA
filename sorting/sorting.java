//sorting

public class sorting {
    public static void bubble(int arr[]){
        for(int i = 0; i<arr.length-1; i++){
            for(int j = i+1; j<arr.length; j++){
                if(arr[i] < arr[j]){
                    //swap
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void selection(int arr[]){
        for(int i = 0; i<arr.length-1; i++){
            int max_index = i; 
            for(int j = i+1; j<arr.length; j++){
                if(arr[max_index] < arr[j]){
                    max_index = j; 
                }
            }
            //swap
            int temp = arr[max_index];
            arr[max_index] = arr[i];
            arr[i] = temp;
        }
    }

    public static void insertion(int arr[]){
        for (int i = 1; i < arr.length; i++) {
            int sorted = arr[i]; 
            int j = i - 1;
            // Move elements of sorted subarray that are greater than the sorted to one position ahead of their current position
            while (j >= 0 && arr[j] < sorted) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = sorted; // Insert the sorted into its correct position in the sorted subarray
        }
    }

    public static void counting(int arr[]){
        int largest = Integer.MIN_VALUE;
        for(int i = 0; i<arr.length; i++){
            if(largest<arr[i]){
                largest = arr[i];
            }
        }

        int count[] = new int[largest+1];
        for(int i = 0; i<arr.length; i++){
            count[arr[i]]++;
        }

        //sorting
        int j = 0;
        for(int i = count.length-1; i>=0; i--){
            while(count[i]>0){
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }

    public static void print(int arr[]){
        for(int i = 0; i<arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {3,6,2,1,8,7,4,5,3,1};
        bubble(arr);
        // selection(arr);
        // insertion(arr);
        // counting(arr);
        print(arr);
    }    
}
