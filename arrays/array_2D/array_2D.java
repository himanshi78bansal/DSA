// 2D array

import java.util.*;
public class array_2D {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of rows : ");
        int row = sc.nextInt();

        System.out.print("Enter no. of cols : ");
        int cols = sc.nextInt();

        int number[][] = new int[row][cols];

        for (int i = 0; i<row; i++){
            for (int j = 0; j<cols; j++)
            {
                System.out.print("Enter the value of "+(i+1)+"th row and "+(j+1)+"th column : ");
                number[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i<row; i++){
            for (int j = 0; j<cols; j++)
            {
                System.out.print(number[i][j]+" ");
            }
            System.out.println();
        }
        
        sc.close();
    }
}
