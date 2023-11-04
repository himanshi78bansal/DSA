// update ith bit means set bit as per user will

public class updatebit {
    public static void function(int n, int p, int newbit){
        if (newbit == 0){
            // clearbit
            int bitmask = ~(1<<p);
            System.out.println(n & bitmask);
        } else {
            // setbit
            int bitmask = 1<<p;
            System.out.println(n | bitmask);
        }
    }   

    public static void profunction(int n, int p, int newbit){
        // clearbit
        int bitmask = ~(1<<p);
        int cleared = n&bitmask;

        // set desired bit
        int newBitMask = newbit << p;
        System.out.println(n|newBitMask);
    }
    public static void main(String [] args){
        // normal method 
        function(10, 1, 0);

        // pro method
        profunction(10,2,1);
    }
}
