// check whether the given number is the power of 2 or not

public class powerOfTwo {
    public static void function(int n){
        if((n & n-1) == 0){
            System.out.println("yes");
        } else {
            System.out.println("not");
        }
    }    
    public static void main(String[] args) {
        function(15);
    }
}
