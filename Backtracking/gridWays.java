public class gridWays {
    public static int function(int i, int j, int n, int m){
        // base case
        if(i == n-1 && j == m-1){   // last cell condition
            return 1;
        } else if(i == n || j == m){    // boundry cross condition
            return 0; 
        }

        // recursion
        int w1 = function(i, j+1, n, m);    // right
        int w2 = function(i+1, j, n, m);    // down

        return w1 + w2; 
    }
    public static void main(String[] args) {
        int n = 3, m = 4;
        System.out.println(function(0,0,n,m));
    }
}
