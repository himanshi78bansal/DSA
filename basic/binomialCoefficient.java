// Calculate binomial coefficient

import java.util.Scanner;
public class binomialCoefficient {
    public static int factorial(int n)
    {
        int fact = 1;

        for (int i = 1; i<=n; i++)
        {
            fact = fact*i;
        }
        return fact;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);

        System.out.print("Enter the value of n : ");
        int n = sc.nextInt();
        
        System.out.print("Enter the value of r : ");
        int r = sc.nextInt();

        int factn = factorial(n);
        int factr = factorial(r);
        int factnmr = factorial(n-r);

        int value = factn/(factr*factnmr);

        System.out.println(value);

        sc.close();
    }    
}
