// Tower of hanoi

public class hanoi {
    public static void function(int n, String src, String helper, String dest){
        if(n==1){
            System.out.println("Transfer disk "+n+" from "+src+" to "+dest);
            return;
        }
        // transfer top n-1 from src to helper using dest as 'helper'
        function(n-1,src,dest,helper);
        // transfer nth from src to dest
        System.out.println("Transfer disk "+n+" from "+src+" to "+dest);
        // transfer n-1 from helper to dest using src as 'helper'
        function(n-1, helper, src, dest);
    }
    public static void main(String[] args) {
        int n = 3;
        function(n, "A", "B", "C");
    }
}
