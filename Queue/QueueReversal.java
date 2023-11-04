// Reverse a Queue

import java.util.*;
public class QueueReversal {
    public static void main(String[] args) {
        // Create a queue
        Queue <Integer> q = new LinkedList<>();

        // Add elements to the queue
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        // Create a Stack
        Stack <Integer> s = new Stack<>();

        // push all elements of queue to stack
        while(!q.isEmpty()){
            s.push(q.remove());
        }

        // add all elements of stack to queue
        while(!s.isEmpty()){
            q.add(s.pop());
        }

        // printing 
        while(!q.isEmpty()){
            System.out.print(q.peek()+" ");
            q.remove();
        }
    }
}
// time -> O(n)
// space -> O(n)