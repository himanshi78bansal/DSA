public class fibonacci {
    public static int function(int n){
        if(n==0){
            return 0;
        } else if (n==1){
            return 1;
        } 
        int fib = function(n-1) + function(n-2);

        return fib;
        
    }
    public static void main(String[] args) {
        System.out.println(function(50));
    }
}


// time complexity = O(2^n)
// space complexity = O(n)
