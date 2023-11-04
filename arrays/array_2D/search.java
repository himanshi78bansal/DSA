// Search, find largest, find smallest in 2D array

import java.util.*;
public class search {
    public static void function(int arr[][], int num){

        for (int i = 0; i<arr.length; i++){
            for (int j = 0; j<arr[0].length; j++)
            {
                if(arr[i][j] == num){
                    System.out.println("("+i+","+j+")");
                    break;
                }
            }
        }
    }
    
    // Largest
    public static void largest(int arr[][]){
        int large = Integer.MIN_VALUE;
        for (int i = 0; i<arr.length; i++){
            for (int j = 0; j<arr[0].length; j++)
            {
                if(large < arr[i][j]){
                    large = arr[i][j];
                }
            }
        }
        System.out.println("Largest element in the array is : "+large);
    }
    
    // Smallest
    public static void smallest(int arr[][]){
        int small = Integer.MAX_VALUE;
        for (int i = 0; i<arr.length; i++){
            for (int j = 0; j<arr[0].length; j++)
            {
                if(small > arr[i][j]){
                    small = arr[i][j];
                }
            }
        }
        System.out.println("Smallest element in the array is : "+small);
    }
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of rows : ");
        int row = sc.nextInt();

        System.out.print("Enter no. of cols : ");
        int cols = sc.nextInt();

        int arr[][] = new int[row][cols];

        //input
        for (int i = 0; i<row; i++){
            for (int j = 0; j<cols; j++)
            {
                // System.out.print("Enter the value of "+(i+1)+"th row and "+(j+1)+"th column : ");
                arr[i][j] = sc.nextInt();
            }
        }

        // output
        for (int i = 0; i<row; i++){
            for (int j = 0; j<cols; j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        System.out.print("Enter number to search : ");
        int num = sc.nextInt();
        
        function(arr,num);
        largest(arr);
        smallest(arr);
        sc.close();
    }
}
