// Maximum of Subarrays (Brute force technique)

public class array_maxsubarray2 {
    public static void function(int number[])
    {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i<number.length; i++)
        {
            sum = 0;
            for (int j = i; j<number.length; j++)
            {
                System.out.print("sum of "+sum+" and ");
                sum = sum + number[j];
                System.out.println(+number[j]+" is "+sum);
            }
            System.out.println();
            if(max<sum)
            {
                max = sum;
            }
        }
        System.out.print("Maximum value : "+max);
    }
    public static void main(String[] args) {

        int number[] = {1,-2,6,-1,3};

        function(number);
    }
}
