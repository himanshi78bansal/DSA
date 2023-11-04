// To check whether the given number is even or odd using bitwise operator

import java.util.Scanner;

public class oddeven {
    public static void function(int n){
        int bitmask = 1;
        if ((n & bitmask) == 0){
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
    }
    public static void main(String[] args) {
        System.out.print("Enter number to check : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        function(n);
        sc.close();
    }
}
