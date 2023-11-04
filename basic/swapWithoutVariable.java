public class swapWithoutVariable {
    public static void function(int a, int b){
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("a : "+a+" and b : " +b);
    }
    public static void main(String[] args) {
        function(5,3);
    }
}
