import java.util.*;

public class pushBottom {

    public static void function(Stack<Integer> s, int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }

        int top = s.pop();
        function(s, data);
        s.push(top);

    }
    public static void main(String[] args) {
        Stack <Integer> s = new Stack<>();
        s.push(5);
        s.push(4);
        s.push(3);
        s.push(2);
        s.push(1);

        function(s, 0);

        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }
}
