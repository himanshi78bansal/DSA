// Triangle Pattern

import java.util.Scanner;
public class pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // triangle pattern

        for (int i = 1; i<=n; i++)
        {
            for (int j = 1; j<=i; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        
        System.out.println();

        // Inverted triangle pattern
        
        for (int i = 1; i<=n; i++)
        {
            for (int j = n; j>=i; j--)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        
        System.out.println();
        
        // Half pyramid pattern

        for (int i = 1; i<=n; i++)
        {
            for (int j = 1; j<=i; j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
        
        System.out.println();
        
        // character pattern

        char ch = 'A';
        for (int i = 1; i<=n; i++)
        {
            for (int j = 1; j<=i; j++)
            {
                System.out.print(ch+" ");
                ch++;
            }
            System.out.println();
        }

        sc.close();
    }    
}



