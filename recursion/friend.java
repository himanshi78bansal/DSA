public class friend {
    public static int function(int n){
        if(n == 1 || n == 2){
            return n;
        }
        // // single
        // int singWays = function(n-1);
        // // pairing
        // int pairWays = function(n-2);
        // int totWays = singWays + (n-1) * pairWays;
        // return totWays;

        // or
        return function(n-1) + (n-1) * function(n-2);

    }
    public static void main(String[] args) {
        System.out.println(function(4));
    }
}
