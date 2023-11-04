
public class palindrome {
    public static boolean function(String string){
        int n = string.length();

        for (int i = 0; i <= n/2; i++){
            if(string.charAt(i) != string.charAt(n-i-1)){
                return false;
            } 
        }
        return true;
    }
    public static void main(String[] args) {
        String string = "racecar";

        if(function(string)==true){
            System.out.println("String is palindrome");
        } else {
            System.out.println("String is not palindrome");
        }

    }
}
