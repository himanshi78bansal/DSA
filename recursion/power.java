public class power {
    public static int function(int base, int power){
        if(power == 0){
            return 1;
        }
        int nm1 = function(base, power-1);
        int ans = base*nm1;
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(function(2, 5));
    }
}

// time complexity = O(n)
