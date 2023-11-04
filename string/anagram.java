// To check whether the given strings is anagram or not.

import java.util.Arrays;

public class anagram {

    // According to me 

    public static void function1(String str1, String str2){
        function2(str1,str2);

        StringBuilder sb = new StringBuilder(""); // Make a new string

        if (str1.length()==str2.length()){  // check if length is equal or not 
            for (int i = 0; i<str1.length(); i++){   //loop to render in str1
                for (int j = 0; j<str2.length(); ){    // Loop to render in str2
                    if(str1.charAt(i)==str2.charAt(j)){  // Check str1's character exist in str2 or not 
                        sb.append(str1.charAt(i));   // write in new string 
                        break;
                    }else{    // else j++
                        j++;
                    }
                }
            }
        } 
        
        if(str1.compareTo(sb.toString()) == 0){    // check whether the str1 and new string sb are equal or not 
            System.out.println("Strings are anagram.");
        } else {
            System.out.println("Strings are not anagram.");
        }
    }

    // According to Sharadha

    public static boolean function2(String str1, String str2){
        // Remove spaces and convert to lowercase
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();

        // Check if the lengths are equal
        if (str1.length() != str2.length()) {
            return false;
        }

        // Convert strings to character arrays
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();

        // Sort the character arrays
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        // Compare sorted arrays
        return Arrays.equals(charArray1, charArray2);
    }

        public static void main(String[] args) {
            String str1 = "rgace";
            String str2 = "carge";
            function1(str1, str2);
            if(function2(str1,str2)){
                System.out.println("Strings are anagram.");
            } else {
            System.out.println("Strings are not anagram.");
            }
            }
        }
    