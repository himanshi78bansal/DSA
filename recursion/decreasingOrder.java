class decreasingOrder {
    public static void function(int n){
        if (n==1){
            System.out.println(n);
            return;
        } 
            System.out.println(n);   // printing
            function(n-1);       // call self function
        }
    public static void main(String[] args) {
        function(10);
    }

}
