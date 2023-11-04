import java.util.*;

public class QueueUsingDeque {
    public static class Queue{
        Deque <Integer> dq = new LinkedList<>();

        public boolean isEmpty(){
            return dq.isEmpty();
        }

        public void add(int data){
            dq.addLast(data);
        }

        public void remove(){
            if(isEmpty()){
                System.out.println("Empty Queue");
            }
            dq.removeFirst();
        }

        public int peek(){
            if(isEmpty()){
                System.out.println("Empty Queue");
            }
            return dq.getFirst();
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue();

        q.add(1);
        q.add(2);
        q.add(3);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
