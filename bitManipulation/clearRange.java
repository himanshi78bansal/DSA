public class clearRange {
    public static void function(int n, int start, int end){
        int newNumber = n;
        for (int i = start; i<=end; i++){
            int bitmask = ~(1<<i);
            newNumber = newNumber&bitmask;
        }
        System.out.println(newNumber);
    }
    public static void profunction(int n, int start, int end){
        int a = (~0<<(end+1));
        int b = (1<<start)-1;
        int bitmask = a|b;
        System.out.println(n&bitmask);
    }
    public static void main(String[] args) {
        function(10, 2, 4);
        profunction(10, 2, 4);
    }
}
