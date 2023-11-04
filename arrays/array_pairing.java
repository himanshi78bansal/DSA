// Pairing of a array

import java.util.*;
public class array_pairing {
    public static void function (int number[])
    {
        int t = 0;
        for (int i = 0; i<number.length; i++)
        {
            for (int j = i+1; j<number.length; j++)
            {
                System.out.print("("+number[i]+"."+number[j]+") ");
                t++;
            }
            System.out.println();
        }
        System.out.println("Total number of pairs : "+t);

    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //input
        System.out.print("Enter array size : ");
        int size = sc.nextInt();

        int number[] = new int[size];
        for (int i = 0; i<size; i++)
        {
            number[i] = sc.nextInt();
        }

        function(number);

        sc.close();
        
    }
    
}
