// factorial using recursion

public class factorial {
    public static int function(int n){
        if(n == 0){
            return 1;
        }
        int Nm1 = function(n-1);      // calling self function
        int fact = n * Nm1;
        return fact;
    }
    public static void main(String[] args) {
        System.out.println(function(5));
    }
}

// time complexity = O(n)
// space complexity = O(n)