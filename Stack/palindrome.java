import java.util.*;

public class palindrome {
    public static boolean function(String str){
        Stack <Character> s = new Stack<>();
        int n = str.length();
        
        // push
        for(int i = 0; i<n/2; i++){
            char curr = str.charAt(i);
            s.push(curr);
        }

        //pop
        if(n%2 != 0){ // for odd length
            n += 1;
        }

        for(int i = n/2; i<n-1; i++){
            char top = s.pop();
            if(top != str.charAt(i)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "AABCBA";
        System.out.println(function(str));
    }
}
