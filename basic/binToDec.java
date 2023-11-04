// Convert binary number to Decimal number

import java.util.Scanner;
public class binToDec {

    public static void bin_to_dec(int n){
        int pow = 0;
        int dec = 0;

        while(n!=0)
        {
            int ldig = n % 10; 
            dec =  (dec + (int)(Math.pow(2,pow)*ldig));
            pow++;
            n = n/10;
        }
        System.out.println(dec);
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a binary number : ");
        int n = sc.nextInt();

        bin_to_dec(n);
        
        sc.close();
    }    
}
