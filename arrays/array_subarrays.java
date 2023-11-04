// Subarrays

public class array_subarrays {
    public static void function(int number[])
    {
        int t = 0;
        for (int i = 0; i<number.length; i++)
        {
            for (int j = i; j<number.length; j++)
            {
                for (int k = i; k<=j; k++)
                {
                    System.out.print(number[k]+" ");
                }
                t++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total number of subarrays : "+t);
    }
    public static void main(String[] args) {

        int number[] = {2,4,6,8,10};

        function(number);
        
    }
}
