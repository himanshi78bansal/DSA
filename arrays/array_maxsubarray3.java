// Maximum of subarray using Kadan's Algorithm

public class array_maxsubarray3 {
    public static void function(int number[], int sum, int max)
    {
        //Kadan's algo
        for (int i = 0; i<number.length; i++)
        {
            // add current value
            sum = sum + number[i];
            // check if sum less than 0  
            if(sum < 0)
            {
                sum = 0;
            }
            // updating maximum value
            if (max < sum)
            {
                max = sum;
            }
        }

        System.out.println("According to Kadan's algorithm max : "+max);
    }
    public static void main(String[] args) {
        // initial values
        int sum = 0;
        int max = Integer.MIN_VALUE;
        // input array
        int number[] = {-2,-3,4,-1,-2,1,5,-3};

        function(number,sum,max);

        // Exception case (if all the numbers are negative)
        for(int i = 0; i<number.length; i++)
        {
            if(number[i]<=0)
            {
                if (max<number[i])
                {
                    max = number[i];
                }
            } else {
                break;
            }
        }
        System.out.println("Exception case result max : "+max);
        
    }
}