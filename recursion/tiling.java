public class tiling {
    public static int function(int n){
        if(n == 0 || n == 1){
            return 1;
        }
        // // vertical
        // int ver = function(n-1);
        // // horizontal
        // int hor = function(n-2);
        // // total
        // int totWays = ver + hor;
        // return totWays;

        //or
        return function(n-1) + function(n-2);
    }
    public static void main(String[] args) {
        System.out.println(function(4));
    }
}
