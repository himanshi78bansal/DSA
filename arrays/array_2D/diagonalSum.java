public class diagonalSum {
    public static void function(int arr[][], int n, int m){
        //brute force
        // primary diagonal
        int sum = 0;
        if(n==m){
        for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){
                if(i == j){
                    // System.out.println("sum1 : "+arr[i][j]);
                    sum += arr[i][j];
                }
                // secondary diagonal
                else if(i+j == n-1){
                    // System.out.println("sum2 : "+arr[i][j]);
                    sum += arr[i][j];
                }
            }
        }
        System.out.println(sum);
    }

    // //optimized
    // for(int i = 0; i<n;i++){
    //     sum+=arr[i][i];
    //     if(i!=n-i-1) // j = n-i-1 (i+j = n-1)
    //     sum+=arr[i][n-i-1];
    // }
    // System.out.println(sum);
    }
    public static void main(String[] args) {
        int arr[][] = {{1,2,3,4,9},{5,6,0,7,8},{1,2,3,4,9},{5,6,0,7,8},{1,2,3,4,9}};
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
