import java.util.PriorityQueue;

public class create{
    public static void main(String[] args) {
        PriorityQueue <Integer> pq = new PriorityQueue<>();

        // add
        pq.add(3);  // O(log n)
        pq.add(4);
        pq.add(1);
        pq.add(7);

        // peek
        while(!pq.isEmpty()){
            // by default ascending order
            System.out.println(pq.peek());  // O(1)
            // pop
            pq.remove();    // O(log n)
        }
    }
}