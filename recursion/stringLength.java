// write a program to find out the length of a string using recursion

public class stringLength {

    public static int function(String name){
        if(name.isEmpty()){
            return 0;
        }else {
            return 1 +  function(name.substring(1));
        }
        }

    public static void main(String[] args) {
        String name = "Himanshi Bansal";
        System.out.println(function(name));
    }
}
