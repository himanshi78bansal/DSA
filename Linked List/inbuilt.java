import java.util.LinkedList;

public class inbuilt {
    public static void main(String[] args) {
        // create
        LinkedList <Integer> ll = new LinkedList<>();
        // add
        ll.addLast(2);
        ll.addLast(3);

        ll.addFirst(1);
        ll.addFirst(0);
        // 0-->1-->2-->3 
        System.out.println(ll);

        // remove
        ll.removeFirst();
        ll.removeLast();

        System.out.println(ll);
    }
}
