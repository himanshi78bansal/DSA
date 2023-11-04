import java.util.*;

public class duplicateParanthesis {
    public static boolean function(String str){
        Stack <Character> s = new Stack<>();

        for(int i = 0; i<str.length(); i++){ //O(n)
            char curr = str.charAt(i);
            // closing
            if(curr == ')'){
                int count = 0;
                while(s.peek() != '('){
                    s.pop();
                    count++;
                }
                if(count<1){
                    return true; //duplicate
                } else {
                    s.pop(); // opening pair
                }
            } else { 
                // opening
                s.push(curr);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String str = "(((a+b)+(c+d)))";
        System.out.println(function(str));
    }
}
