// Using permutation formula
// (n-1+m-1)! divide by (n-1)!(m-1)!

public class gridWaysMaths {
    public static int fact(int n){
        // base case
        if(n == 1){
            return 1;
        }
        return (n*fact(n-1));
    }
    public static void main(String[] args) {
        int row = 3, col = 4; 
        System.out.println(fact(row-1+col-1)/(fact(row-1)*fact(col-1)));
    }
}
