// print all the binary string of size N without consecutive ones.

public class binaryString {
    public static void function(int n, int lastPlace, String str){
        // base case
        if(n == 0){
            System.out.println(str);
            return;
        }

        // kaam
        function(n-1, 0, str + "0");
        if (lastPlace == 0){
            function(n-1, 1, str + "1");
        }
    }
    public static void main(String[] args) {
        function(3,0, "");
    }
}
