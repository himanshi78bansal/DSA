// Staircase Search in 2D-array

import java.util.Scanner;
public class staircase_Search {
    public static void function(int arr[][], int n, int m, int key){

        // Starting from upper right corner
        
        int row = 0; int col = m-1;
            while(row <= n-1 && col >= 0){
                if(arr[row][col]==key){
                    System.out.println("array index : ("+row+","+col+")");
                    break;
                } else if(arr[row][col]<key){
                        row++;
                    } else{
                    col--;
                }  
            }

            // Starting from lower left corner

        // int row = n-1; int col = 0;
        // while(row >= 0 && col <= m-1){
        //     if (key==arr[row][col]){
        //         System.out.println("array index : ("+row+","+col+")");
        //         break;
        //     } else if (key < arr[row][col]){
        //         row--;
        //     } else{
        //         col++;
        //     }
        // }
    }
    public static void main(String[] args) {
        int arr[][] = {{10,20,30,40},{15,25,35,45},{27,29,37,48},{32,33,39,50}};
        int n = arr.length;
        int m = arr[0].length;
        for(int i = 0; i<n; i++){
            for (int j = 0; j<m; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.print("Enter key : ");
        Scanner sc = new Scanner(System.in);
        int key = sc.nextInt();
        function(arr,n,m,key);
        sc.close();
    }
}
