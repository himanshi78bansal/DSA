// Selection sort

public class selection {
    public static void function(int arr[])
    {
        for (int i = 0; i < arr.length-1; i++)
        {
            int min_index = i;
            for(int j = i+1; j < arr.length; j++)
            {
                // for decreasing order use less than sign
                // for increasing order
                if(arr[min_index] > arr[j])
                {
                    min_index = j;
                }
            }
            //swap
            int temp = arr[min_index];
            arr[min_index] = arr[i];
            arr[i] = temp;
        }
    }
    public static void print(int arr[])
    {
        for (int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {5,4,1,3,2};
        function(arr);
        print(arr);
    }
}

