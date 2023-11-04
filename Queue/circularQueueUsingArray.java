public class circularQueueUsingArray {
    public static class Queue{
        static int arr[];
        static int size;
        static int rear;
        static int front;
        
        Queue(int n){
            arr = new int[n];
            rear = -1;
            front = -1;
            size = n;
        }

        public static boolean isEmpty(){    // O(1)
            return rear == -1 && front == -1;
        }

        public static boolean isFull(){     // O(1)
            return (rear+1)%size == front;
        }

        public static void add(int data){   // O(1)
            if(isFull()){
                System.out.println("Queue is full");
            }
            //for first element
            if(front == -1){
                front = 0;
            }
            rear = (rear+1) % size;
            arr[rear] = data;
        }

        public static void remove(){    // O(1)
            if(isEmpty()){
                System.out.println("Empty Queue");
            }
            
            if(rear == front){
                //for last element
                rear = front = -1;
            } else {
                //for normal element
                front = (front+1) % size;
            }
        }

        public static int peek(){   // o(1)
            if(isEmpty()){
                System.out.println("Empty Queue");
            }

            return arr[front];
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue(3); //size = 3

        // 3 elements added
        q.add(1);   // 1
        q.add(2);   // 1 -> 2
        q.add(3);   // 1 -> 2 -> 3

        q.remove();     //  _ -> 2 -> 3
        q.add(4);   // 4 -> 2 -> 3
        

        q.remove();     //  4 -> _ -> 3
        q.add(5);   // 4 -> 5 -> 3


        // printing circular queue
        while(!q.isEmpty()){
            System.out.println(q.peek()); // pointer @ 3, gives 3 -> 4 -> 5
            q.remove();
        }
    }

}
