public class sumNatural {
    public static int function(int n){
        if (n==1){
            return 1;
        }
        int nm1 = function(n-1);         // calling self function
        int sum = n + nm1;
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(function(10));
        
    }
}

// time complexity = O(n)
// space complexity = O(n)