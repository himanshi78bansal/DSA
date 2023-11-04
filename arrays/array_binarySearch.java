// Binary Search

import java.util.*;
public class array_binarySearch {
    public static void function(int number[], int target)
    {
        int l = 0;
        int h = number.length-1;
            
        while(l<=h)
        {
            int mid = (l+h)/2;

            if(number[mid]<target)
            {
                l = mid + 1;
            }else{
                h = mid - 1;
            }
            
            if(number[mid]==target)
            {
                System.out.println(mid);
            }
        }
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int size = sc.nextInt();
        int number[] = new int[size];
        for (int i = 0; i<size; i++)
        {
            number[i] = sc.nextInt();
        }
        System.out.print("Enter number to find : ");
        int target = sc.nextInt();

        function(number,target);
        
        sc.close();
    }
}
