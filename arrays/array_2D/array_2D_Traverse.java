// Print the spiral order matrix as output for a given matrix of numbers. 

public class array_2D_Traverse{
    public static void main(String[] args) {

        int matrix[][] = {{1,2,3,4,5,6}, {6,2,7,4,8,1}, {2,9,3,6,5,0}, {0,3,5,1,9,6}, {1,2,3,8,5,0}};

        int n = 5, m = 6;
        System.out.println("\n");
        for(int i = 0; i<n; i++)
        {
            for (int j = 0; j<m; j++)
            {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        
        System.out.println("\n");
        
        
        int row_start = 0, cols_start = 0, row_end = n-1, cols_end = m-1;

        while(row_start<=row_end && cols_start<=cols_end)
        {
                //left to right
            for(int i = cols_start; i<=cols_end;i++)
            {
                System.out.print(matrix[row_start][i]+" ");
            }
            row_start++;
            //top to bottom
            for(int i = row_start; i<=row_end;i++)
            {
                System.out.print(matrix[i][cols_end]+" ");
            }
            cols_end--;
            //right to left
            for(int i = cols_end; i>=cols_start;i--)
            {
                System.out.print(matrix[row_end][i]+" ");
            }
            row_end--;
            //bottom to top
            for(int i = row_end; i>=row_start;i--)
            {
                System.out.print(matrix[i][cols_start]+" ");
            }
            cols_start++;
        }
        System.out.println();
    }
}
