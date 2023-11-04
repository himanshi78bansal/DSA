public class LinkedList{
    public class Node{
        int data; 
        Node next;

        // Constructor
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    // head and tail of list are static 
    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data){     // O(1)
        //step 1 - create new node in the start of list
        Node newNode = new Node(data);

        // if list is empty
        if(head == null){
            head = tail = newNode;
        } else {
            // step 2 - newNode next --> head
            newNode.next = head;
    
            // step 3 - head = newNode
            head = newNode;
        }

        size++;
    }

    public void addLast(int data){  // O(1)
        // create new node in the last of the list
        Node newNode = new Node(data);

        // step 1 - if list is empty
        if(head == null){
            head = tail = newNode;
            return;
        } else {
            // step 2 -  
            tail.next = newNode;
            // step 3 - 
            tail = newNode;
        }
        
        size++;
    }

    public void addMid(int idx, int data){  // O(n)
        // if list is empty
        if(head == null){
            addFirst(data); // add it @ first
            return;
        }
        Node newNode = new Node(data);  // newNode to insert in middle
        Node temp = head;   // a temporary node equals to head 
        int i = 0;  // pointer

        while(i < idx-1){   //pointer do not reach @ desired idx-1
            temp = temp.next;   
            i++;
        }

        // i = idx-1; temp --> prev // pointer reached @ desired idx-1
        newNode.next = temp.next;   // newNode pointing to next link
        temp.next = newNode;    // temp pointing to newNode

        size++;
    }

    public void removeFirst(){  // O(1)
        if(size == 0){
            System.out.println("List is empty");
            return;
        } else if(size == 1){
            head = tail = null;
            return;
        }
        head = head.next;
        size--;
    }

    public void removeLast(){   // O(n)
        if(size == 0){
            System.out.println("List is empty");
            return;
        } else if(size == 1){
            head = tail = null;
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

    public int itrSearch(int key){  // O(n)
        Node temp = head;
        int i = 0;

        while(temp != null){
            if(temp.data == key){
                return i;
            }
            temp = temp.next;
            i++;
        }

        // key not found
        return -1;
    }

    public int recSearch(int key){
        return helper(head, key);
    }

    public int helper(Node head, int key){  // O(n)
        // base case
        if (head == null){
            return -1;
        }

        // Node temp = head;
        
        if(head.data == key){
            return 0;
        }
        // recursion
        int idx = helper(head.next, key);

        // backtracking for index
        if(idx == -1){
            return -1;
        } else {
            return idx+1;
        }
    }

    public void reverse(){  // O(n)
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    public void print(){    // O(n)
        if(head == null){
            System.out.print("Linked list is null");
        }
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+"-->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.print(); // null list
        ll.addFirst(2); // add in start
        ll.print();
        ll.addFirst(1); // add in start
        ll.print();
        ll.addLast(3);  // add in end
        ll.print();
        ll.addLast(4);  // add in end
        ll.print();
        ll.addMid(2, 5);
        ll.print();
        ll.addMid(3, 6);
        ll.print();
        ll.removeFirst();
        ll.print();
        ll.removeLast();
        ll.print();
        System.out.println("Size of the list : "+size);
        System.out.println("index : " + ll.itrSearch(6));
        System.out.println("index : " + ll.itrSearch(10));
        System.out.println("index : " + ll.recSearch(2));
        System.out.println("index : " + ll.recSearch(3));
        ll.reverse();
        ll.print();
    }

    public LinkedList.Node function(LinkedList.Node head2) {
        return null;
    }
}