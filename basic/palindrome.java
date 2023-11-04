// To check the given number is palindrome or not

import java.util.Scanner;
public class palindrome {

    public static int logic (int n, int reverse)
    {
        while(n != 0)
        {
        int rem = n % 10;
        reverse = (reverse * 10) + rem;
        n = n/10;
        }
        System.out.println("Number after check : " + reverse);
        return (reverse);
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to check : ");
        int n = sc.nextInt();

        int reverse = 0;

        int check = logic(n,reverse);

        if (n == check)
        {
            System.out.println("Yes, Number is palindrome.");
        } else {
            System.out.println("No, Number is not palindrome.");
        }
        sc.close();
    }   
}

