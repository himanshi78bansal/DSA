public class countSetBit {
    public static void function(int n){
        int count = 0;
        while(n>0){     //time complexity = O(log n)
        if ((n & 1) != 0){
            count++;
        }
        n = n>>1;
    }
    System.out.println(count);
    }
    public static void main(String[] args) {
        function(10);
    }
}
