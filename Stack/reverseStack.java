import java.util.*;

public class reverseStack{

    public static void function(Stack <Integer> s){
        if(s.isEmpty()){
            return;
        }

        int top = s.pop();
        function(s);
        pushBottom(s, top);

    }

    public static void pushBottom(Stack<Integer> s, int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }

        int top = s.pop();
        pushBottom(s, data);
        s.push(top);
        
    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);

        function(s);
        
        while(!s.isEmpty()){
            System.out.println(s.pop());   
        }
    }
}
