public class subarray {
    public static void function(String arr, String ans, int i){
        // base case
        if(i==arr.length()){
            if(ans.length()==0){
                System.out.println("null");
            } else {
                System.out.println(ans);
            }
            return;
        }

        // recursion
        function(arr, ans+arr.charAt(i), i+1);    // yes           
        function(arr, ans, i+1);    // No
    }
    public static void main(String[] args) {
        String arr = "abc";
        String ans = "";
        function(arr, ans, 0);
    }
}
