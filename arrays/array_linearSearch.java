// linear search in an arry

import java.util.*;
public class array_linearSearch {
    public static void function(int number[], int n)
    {
        for (int i = 0; i<number.length; i++)
        {
            if (number[i]==n)
            {
                System.out.println(i+1);
                break;
            }
        }
    }
    public static void main(String[]args){
        System.out.print("Enter an array : ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        // int number[] = {45,78,90};
        // int n = 78;
        int number[] = new int[size];
        for (int i = 0; i<size; i++)
        {
            number[i] = sc.nextInt();
        }
        System.out.print("Enter the number you find : ");
        int n = sc.nextInt();

        function(number, n);
        sc.close();
        
    }
}
