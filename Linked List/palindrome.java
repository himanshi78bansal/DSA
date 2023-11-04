public class palindrome {
    public class Node{
        int data;
        Node next;

        Node (int data){
            this.data = data;
            this.next = null;
        }
    }

        public static Node head;
        public static Node tail;

        public void addFirst(int data){
            Node temp = new Node(data);
            if(head == null){
                head = tail = temp;
            } else {
                temp.next = head;
                head = temp;
            }
        }

        // slow-fast approach
        public Node mid(Node head){
            Node slow = head;
            Node fast = head;

            while(fast != null && fast.next != null){
                slow = slow.next;   //+1
                fast = fast.next.next; //+2
            }
            return slow;    // mid
        }
        public boolean function(){
            if(head == null || head.next == null){
                return true;
            }

            // step1 - find mid
            Node midNode = mid(head);

            // step2 - reverse from midNode
            Node prev = null;
            Node curr = midNode;
            Node next;

            while(curr != null){
                next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }
            Node right = prev;  // right half head
            Node left = head;   // left half head

            // step3 - check left half & right half
            while(right != null){
                if(left.data != right.data){
                    return false;
                }
                left = left.next;
                right = right.next;
            }
            return true;
        }
    
        public void print(){
            if(head == null){
                System.out.println("Empty list");
            }
            Node temp = head;
            while(temp != null){
                System.out.print(temp.data+"-->");
                temp = temp.next;
            }
            System.out.println("null");
        }
    public static void main(String[] args) {
        palindrome pl = new palindrome();
        pl.addFirst(1);
        pl.addFirst(2);
        pl.addFirst(1);
        pl.addFirst(2);
        pl.addFirst(1);
        pl.print();
        System.out.println(pl.function());
    }
}
