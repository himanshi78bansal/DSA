// Reverse a String using Stack

import java.util.*;

public class reverseString{
    public static String function(Stack<Character> s, String str){
        StringBuilder sb = new StringBuilder("");
        while(!s.isEmpty()){
            sb.append(s.pop());
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "Hello";

        Stack <Character> s = new Stack<>();
        for(int i = 0; i<str.length(); i++){
            s.push(str.charAt(i));
        }

        System.out.println(function(s, str));
    }
}