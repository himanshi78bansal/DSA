public class increasingOrder {
    public static void function (int n){
        if(n == 1){
            System.out.println(n);
            return;
        }

        function(n-1);      // call self function
        System.out.println(n);      // printing

    }
    public static void main(String[] args) {
        function(10);
    }
}
