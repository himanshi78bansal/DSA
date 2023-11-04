// Reverse a array

import java.util.*;
public class array_reverse {
    public static void function(int number[])
    {
        int start = 0, end = number.length-1;

        while(start <= end)
        {
            int temp = number[start];
            number[start] = number[end];
            number[end] = temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) { 
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array : "); 
        int size = sc.nextInt();

        int number[] = new int[size];
        for(int i = 0; i<size; i++)
        {
            number[i] = sc.nextInt();
        }

        function(number);
        
        for (int i = 0; i<number.length; i++)
        {
            System.out.print(number[i] +" ");
        }
        sc.close();
    }
}
