// To check whether number is prime or not

import java.util.Scanner;
public class isprime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        boolean isprime = true;

        if (n==2)
        {
            System.out.println("Number is prime.");
        }
        else
        {
            for (int i = 2; i<=Math.sqrt(n); i++)
        {
            if (n%i == 0)
            {
                isprime = false;
                break;
            }
        }
        if (isprime == true)
        {
            System.out.println("Number is prime.");
        }
        else
        {
            System.out.println("Number is not prime.");
        }
        sc.close();
        }
    }
}
