// Largest number exists in the array

import java.util.*;
public class array_largestNumber {
    public static void largest(int number[]){
        int large = Integer.MIN_VALUE; // Smallest number on numberline minus infinity
        int small = Integer.MAX_VALUE; // Largest number on numberline plus infinity
        for(int i = 0; i<number.length; i++){
            if (number[i]>large){
                large = number[i];
            }
            if(number[i]<small)
            {
                small = number[i];
            }
        }
        System.out.println("Largest number : "+large);
        System.out.println("Smallest number : "+small);
    }
    public static void main(String[] args) {
        //Scanner object
        Scanner sc = new Scanner(System.in);
        //input size of array
        System.out.print("Enter size of array : ");
        int size = sc.nextInt();

        int number[] = new int[size];
        //input array
        for (int i = 0; i<size; i++)
        {
            number[i] = sc.nextInt();
        }
        largest(number);
        sc.close();
    }

}
