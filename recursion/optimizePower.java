public class optimizePower {
    public static int function(int base, int power){
        if(power == 0){
            return 1;
        }
        int halfPower = function(base, power/2) ;
        int ans = halfPower * halfPower;

        if(power%2 != 0) {
            return ans * base;
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(function(2, 5));
    }
}

// time complexity = O(logn)
