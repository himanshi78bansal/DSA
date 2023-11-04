// Convert Decimal number to Binary number

import java.util.Scanner;
public class decToBin {

    public static void dec_to_bin(int n){
        int pow = 0;
        int bin = 0;

        while(n!=0)
        {
            int rem = n % 2;
            bin =  (bin + (int)(Math.pow(10,pow)*rem));
            pow++;
            n = n/2;
        }
        System.out.println(bin);
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Decimal number : ");
        int n = sc.nextInt();

        dec_to_bin(n);
        
        sc.close();
    }    
}
