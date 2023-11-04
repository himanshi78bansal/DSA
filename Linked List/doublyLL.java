public class doublyLL {
    public class Node {
        int data;
        Node next;
        Node prev;

        Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            size++;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
        size++;
    }

    public void addLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            size++;
            return;
        }
        tail.next = newNode;
        newNode.prev = tail;
        newNode.next = null;
        size++;
    }

    public void removeFirst(){
        if(size == 0){
            System.out.println("List is empty");
            return;
        } else if(size == 1){
            head = tail = null;
            return;
        }
        head = head.next;
        head.prev = null;
        size--;
    }

    public void removeLast(){   // O(n)
        if(size == 0){
            System.out.println("List is empty");
            return;
        } else if(size == 1){
            head = tail = null;
            size--;
            return;
        }

        Node prev = head;

        //pointer do not reach @ desired idx-1
        for(int i = 0; i<size-2; i++){
            prev = prev.next;
        }

        // pointer reached @ desired idx-1
        prev.next = null;
        tail = prev;
        size--;
    }

    public void print(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + "<->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        doublyLL dll = new doublyLL();
        dll.addFirst(5);
        dll.addFirst(4);
        dll.addFirst(3);
        dll.addFirst(2);
        dll.addFirst(1);
        // dll.print();
        dll.addLast(9);
        dll.print();
        // dll.removeFirst();
        // dll.print();
        dll.removeLast();
        dll.print();
    }
}
