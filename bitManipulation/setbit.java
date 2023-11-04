public class setbit{
    public static void function(int n, int p){
        int bitmask = 1<<p;
        int  newnumber = n|bitmask;
        System.out.println(newnumber);
    }

    public static void main(String[] args) {
        function(10,2);
    }
}