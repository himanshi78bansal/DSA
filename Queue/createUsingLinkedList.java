public class createUsingLinkedList {

    public static class Node{
        
        int data; 
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }

    }

    public static class Queue{
        static Node head = null;
        static Node tail = null;
    
        public static boolean isEmpty(){    //O(1)
            return head == null && tail == null;
        }
    
        public static void add(int data){   //O(1)
            Node newNode = new Node(data);
            if(isEmpty()){
                head = tail = newNode;
            }

            tail.next = newNode;
            tail = newNode;
        }

        public static void remove(){    //O(1)
            if(isEmpty()){
                return;
            }

            if(tail == head){
                head = tail = null;
            } else {
                head = head.next;
            }
        }

        public static int peek(){   //O(1)
            if(isEmpty()){
                return -1;
            }

            return head.data;
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
