// Count sum of even and odd numbers

import java.util.Scanner;
public class count_even_odd {
    public static void main(String[] args) {
        int even = 0;
        int odd = 0;
        int choice = 1;
        Scanner sc = new Scanner(System.in);

        while(choice==1){
            
            System.out.print("Enter number : ");
            int n = sc.nextInt();
            
            if (n%2 == 0)
            {
                even = even + n;
            } else {
                odd += n;
            }
            System.out.print("Enter your choice '0' to stop or '1' to continue. : ");
            choice = sc.nextInt();
        }
        
        System.out.println(even);
        System.out.println(odd);

        sc.close();
    }
}
