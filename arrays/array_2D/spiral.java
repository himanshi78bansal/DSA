public class spiral {
    public static void function(int arr[][], int n, int m){
        int row_start = 0;
        int row_end = n-1;
        int col_start = 0;
        int col_end = m-1;

        while(row_start <= row_end && col_start <= col_end ){
            // row1
            for(int i = col_start; i<col_end; i++){
                System.out.print(arr[row_start][i]+" ");
            }
            // col1
            for(int i = row_start; i<row_end; i++){
                System.out.print(arr[i][col_end]+" ");
            }
            // row2
            for(int i = col_end; i>col_start; i--){
                if(row_start == row_end)
                break;
                System.out.print(arr[row_end][i]+" ");
            }
            // col2
            for(int i = row_end; i>row_start; i--){
                if(col_start == col_end)
                break;
                System.out.print(arr[i][col_start]+" ");
            }
            row_start++;
            row_end--;
            col_start++;
            col_end--;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int n = arr.length;
        int m = arr[0].length;
        for(int i = 0; i<n; i++){
            for (int j = 0; j<m; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        function(arr,n,m);
    }
}
