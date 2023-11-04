public class mergeSort{
    public class Node{
        int data;
        Node next;
        
        Node(int data){
            this.data = data;
            this.next = null;
        }
    } 

    public static Node head;
    public static Node tail;

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
    }

    public Node getMid(Node head){
        Node slow = head;
        Node fast = head.next;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;    // midNode
    }

    public Node merge(Node newLeft, Node newRight){
        Node newMerge = new Node(-1);
        Node temp = newMerge;

        while(newLeft != null && newRight != null){
            if(newLeft.data <= newRight.data){
                temp.next = newLeft;
                temp = temp.next;
                newLeft = newLeft.next;
            } else {
                temp.next = newRight;
                temp = temp.next;
                newRight = newRight.next;
            }
        }

        while(newLeft != null){
            temp.next = newLeft;
            temp = temp.next;
            newLeft = newLeft.next;
        }

        while(newRight != null){
            temp.next = newRight;
            temp = temp.next;
            newRight = newRight.next;
        }

        return newMerge.next;
    }

    public Node function(Node head){
        if(head == null || head.next == null){
            return head;
        }

        // find mid
        Node mid = getMid(head);

        // recursion (left & right mergeSort)
        Node righthead = mid.next;
        mid.next = null;
        Node newLeft = function(head);
        Node newRight = function(righthead);

        // merge
        return merge(newLeft, newRight);
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
        mergeSort ll = new mergeSort();

        ll.addFirst(1);
        ll.addFirst(3);
        ll.addFirst(8);
        ll.addFirst(2);
        ll.addFirst(9);

        ll.print();

        ll.head = ll.function(ll.head);
        ll.print();
    }
}