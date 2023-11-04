// Maximum of Subarrays (Brute force technique)

public class array_maxsubarray {
    public static void function(int number[])
    {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i<number.length; i++)
        {
            for (int j = i; j<number.length; j++)
            {
                sum = 0;
                for (int k = i; k<=j; k++)
                {
                    System.out.print(number[k]+" ");
                    sum += number[k];
                }
                System.out.print("\nsum : "+sum);
                System.out.println();
                if(max<sum)
                {
                    max = sum;
                }
                
            }
            System.out.println();
        }
        System.out.println("Maximum value : "+max);
        System.out.println();
    }
    public static void main(String[] args) {

        int number[] = {1,-2,6,-1,3};

        function(number);
    }
}
