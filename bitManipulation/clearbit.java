// clear ith bit means make it zero

import java.util.Scanner;
public class clearbit {
    public static void function(int n, int p){
        int bitmask = ~(1<<p);
        System.out.println(n & bitmask);
    }
    public static void main(String[] args) {
        function(10,1);
    }
}
