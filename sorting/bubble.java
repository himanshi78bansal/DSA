//  Bubble sorting

public class bubble {
    public static void function (int arr[])
    {
        for(int i = 0; i <= arr.length; i++)
        {
            for(int j = 0; j < arr.length-1-i; j++)
            {
                if(arr[j]>arr[j+1])
                {
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void print(int arr[])
    {
        for(int i = 0; i<arr.length; i++)
        System.out.print(arr[i]+" ");
    }
    public static void main(String[] args) {
        int arr[]= {5,4,1,2,3};
        function(arr); 
        print(arr);
    }
}
