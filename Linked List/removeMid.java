public class removeMid {
    public class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void remove(int n){
        // here "n" is the index from right(tail) side to be removed

        // calculate size of the list
        Node temp = head;
        int size = 0;
        while(temp != null){
            temp = temp.next;
            size++;
        }

        if(n == size){
            head = head.next;   // removeFirst()
            return;
        }

        // size-n
        Node prev = head;

        for(int i = 1; i<size-n; i++){
            prev = prev.next;
        }

        prev.next = prev.next.next;
        return;
    }

    public void print(){
        if(head == null){
            System.out.print("Empty List");
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+"-->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        removeMid rm = new removeMid();
        rm.addFirst(1);
        rm.addFirst(2);
        rm.addFirst(3);
        rm.addFirst(4);
        rm.print();
        rm.remove(2);
        rm.print();
    }
}
