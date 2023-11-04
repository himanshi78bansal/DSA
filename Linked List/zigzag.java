public class zigzag {
    public class Node {
        int data;
        Node next;

        Node(int data){
            this.data = data;
        }
    }

    public static Node head;
    public static Node tail;

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
    }

    public Node mid(Node head){
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public Node reverse(Node currNode){
        if(head == null || head.next == null){
            return head;
        }

        Node prev = null;
        Node curr = currNode;
        Node next;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public void function(){
        // step1 - find mid
        Node mid = mid(head);   // mid function call

        // step2 - reverse 2nd half
        Node currNode = mid.next;
        mid.next = null;
        Node reverse = reverse(currNode);   // reverse function call

        // step3 - alternate merge (zigzag)
        Node LH = head; // left head
        Node RH = reverse;  // right head
        Node nextL, nextR;
        
        while(LH != null && RH != null){
            // zigzag pattern 
            nextL = LH.next;
            LH.next = RH;
            nextR = RH.next;
            RH.next = nextL;
            // value updation
            LH = nextL;
            RH = nextR;
        }
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
        zigzag ll = new zigzag();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.addLast(6);
        ll.print();
        ll.function();
        ll.print();
    }
}
