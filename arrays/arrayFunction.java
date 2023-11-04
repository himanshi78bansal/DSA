// Passing an marks to a function

import java.util.Scanner;
public class arrayFunction {

    public static void updatedArray(int marks[])
    {
        for (int i = 0; i<marks.length; i++)
        {
            marks[i] = marks[i] + 1;
        }
    } 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of marks : ");
        int n = sc.nextInt();

        // int marks[] = {98,99,87};
        int marks[] = new int [n];

        System.out.println("\nInput\n");

        for(int i = 0; i<n; i++)
        {
            System.out.print("Enter the " + i + "th element of marks : ");
            marks[i] = sc.nextInt();
        }

        updatedArray(marks);

        System.out.println("\nOutput\n");

        for (int i = 0; i<marks.length; i++)
        {
            System.out.println(i + "th elemenat of marks : " + marks[i]);
            System.out.println(marks.length);
        }

        sc.close();
    }    
}
