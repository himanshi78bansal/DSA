public class insertion {
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i]; // Store the current element
            int j = i - 1;
            // Move elements of sorted subarray that are greater than the key to one position ahead of their current position
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key; // Insert the key into its correct position in the sorted subarray
        }
    }
    
    public static void print(int arr[])
    {
        for(int i = 0; i<arr.length; i++)
        System.out.print(arr[i]+" ");
    }
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 12, 1, 6, 3, 9};
        insertionSort(arr);
        print(arr);
    }
}
