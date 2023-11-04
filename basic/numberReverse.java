// Reverse the number

import java.util.Scanner;
public class numberReverse{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // while(n>0){
        //     int ldig = n%10;
        //     System.out.print(ldig);
        //     n = n/10;
        // }

        int rev = 0;
        while(n>0){
            int ldig = n%10;
            rev = (rev*10) + ldig;
            n = n/10;
        }
        System.out.println(rev);
        sc.close();
    }
}


