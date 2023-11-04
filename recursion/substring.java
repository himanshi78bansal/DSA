public class substring{
    public static int function(String str, int i, int j, int n){
        if(n == 1){
            return 1;
        }
        if(n <= 0){
            return 0;
        }
        
        int result = function(str, i+1, j, n-1) + function(str, i, j-1, n-1) - function(str, i+1, j-1, n-2);

        if(str.charAt(i) == str.charAt(j)){
            result++;
        }
        return result;
    }
    public static void main(String[] args) {
        String str = "abcab";
        int n = str.length();
        System.out.println(function(str, 0, n-1, n));
    }
}