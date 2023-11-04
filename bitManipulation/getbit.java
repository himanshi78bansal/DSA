// get ith bit 

import java.util.Scanner;
public class getbit {
    public static void function(int n, int p){
        int bitmask = 1<<p;
        if((n&bitmask) == 0){
            System.out.println("bit : 0");
        } else {
            System.out.println("bit : 1");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = sc.nextInt();
        System.out.print("Enter position : ");
        int p = sc.nextInt();
        function(n,p);
        sc.close();
    }
}
