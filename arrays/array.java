// Creating an array

import java.util.Scanner;
public class array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array : ");
        int n = sc.nextInt();

        int array[] = new int [n];

        System.out.println("\nInput\n");

        for(int i = 0; i<n; i++)
        {
            System.out.print("Enter the " + i + "th element of array : ");
            array[i] = sc.nextInt();
        }

        System.out.println("\nOutput\n");

        for(int i = 0; i<n; i++)
        {
            System.out.println(i + "th elemenat of array : " + array[i]);
        }

        sc.close();
    }    
}
