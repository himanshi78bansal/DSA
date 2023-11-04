import java.util.*;
public class deque {
    public static void main(String[] args) {
        Deque <Integer> dq = new LinkedList<>();

        // add @ first
        dq.addFirst(1);
        dq.addFirst(2);
        dq.addFirst(3);

        // add @ last
        dq.addLast(4);
        dq.addLast(5);
        dq.addLast(6);

        System.out.println(dq);
        
        // remove @ first
        dq.removeFirst();

        // remove @ last
        dq.removeLast();
        
        System.out.println(dq);

        // get first element value
        System.out.println(dq.getFirst());

        // get last element value
        System.out.println(dq.getLast());
    }
}
