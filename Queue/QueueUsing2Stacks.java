import java.util.*;

public class QueueUsing2Stacks {

    public static class Queue{
        static Stack <Integer> s1 = new Stack<>();
        static Stack <Integer> s2 = new Stack<>();

        public static boolean isEmpty(){
            return s1.isEmpty();
        }

        public static void add(int data){   // O(n)
            // Empty s1
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }

            // push element in s1
            s1.push(data);
            
            // push all elements of s2
            while(!s2.isEmpty()){
                s1.push(s2.pop());
            }
        }

        public static void pop(){   //O(1)
            if(isEmpty()){
                return;
            }
            s1.pop();
        }

        public static int peek(){   // O(1)
            if(isEmpty()){
                return -1;
            }
            return s1.peek();
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.pop();
        }
    }
}