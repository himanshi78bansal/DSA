// clear last i bits 

public class clearLastBits {
    public static void function(int n, int p){
        int newNumber = n;
        for (int i = 0; i<p; i++){
            int bitmask = ~(1<<i);
            newNumber = newNumber&bitmask;
        }
        System.out.println(newNumber);
    }

    public static void profunction(int n, int p){
        int bitmask = (~0)<<p;
        System.out.println(n&bitmask);
    }
    public static void main(String[] args) {
        function(15, 2);
        function(10, 2);
        profunction(15, 2);
    }
}
