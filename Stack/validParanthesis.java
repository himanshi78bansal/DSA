import java.util.*;

public class validParanthesis {

    public static boolean function(String str){  //O(n)
        Stack <Character> s = new Stack<>();
        for(int i = 0; i<str.length(); i++){
            char curr = str.charAt(i);
            //opening brackets
            if(curr == '{' || curr == '[' || curr == '('){
                s.push(curr);
            } else {
            // closing brackets
                if(s.isEmpty()){
                    return false;
                }
                if(s.peek() == '{' && curr == '}' //{}
                    || s.peek() == '[' && curr == ']' //[] 
                    || s.peek() == '(' && curr == ')'){ //()
                    s.pop();
                }
            }
        }
        if(s.isEmpty()){
            return true; 
        } else {
            return false;
        }
    }
    public static void main(String[] args) {

        String str = "{[()]}";
        System.out.println(function(str));
    }
}
