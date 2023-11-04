// string

import java.util.Scanner;
public class input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your full name : ");

        // string input
        String name = sc.nextLine(); 
        System.out.println("Your name : "+name);

        //string length using length() function
        System.out.println("Length : "+name.length());  

        //concatenation
        String firstName = "Himanshi";
        String lastName = "Bansal";
        String fullName = firstName + " " + lastName;
        System.out.println(fullName);

        // charAt(index)
        System.out.println(fullName.charAt(3));
        for(int i = 0; i<fullName.length(); i++){
            System.out.print(fullName.charAt(i)+" ");
        }

        System.out.println();
        
        // str1.equals(str2)
        String str1 = "Hi";
        String str2 = "Hi";
        if(str1.equals(str2)){
            System.out.println("Strings are equal.");
        } else {
            System.out.println("Strings are not equal.");
        }

        // compareTo
        String[] fruits = {"apple", "mango", "banana"};
        String largest = fruits[0];
        for(int i = 1; i<fruits.length; i++){
            if(largest.compareTo(fruits[i])<0){
                largest = fruits[i];
            } 
        }
        System.out.println(largest);

        // compareTo example
        if(str1.compareTo(str2) == 0){
            System.out.println("Both are equal");
        } else {
            System.out.println("Not equal");
        }

        sc.close();
    }
}
