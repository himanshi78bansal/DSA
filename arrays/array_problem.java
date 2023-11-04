// Print the spiral order matrix as output for a given matrix of numbers.

import java.util.*;
public class array_problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of rows : ");
        int row = sc.nextInt();
        System.out.print("Enter no. of cols : ");
        int cols = sc.nextInt();
        int number[][] = new int[row][cols];
        for (int i = 0; i<row; i++)
        {
            for (int j = 0; j<cols; j++)
            {
                System.out.print("Enter the value of "+(i+1)+"th row and "+(j+1)+"th column : ");
                number[i][j] = sc.nextInt();
            }
        }

        System.out.print("Enter the no. to find : ");
        int n = sc.nextInt();

        for (int i = 0; i<row; i++)
        {
            for (int j = 0; j<cols; j++)
            {
                if(number[i][j] == n)
                {
                    System.out.println("Row Number = "+(i+1));
                    System.out.println("Column Number = "+(j+1));
                }
            }
        }
        sc.close();
    }
}
