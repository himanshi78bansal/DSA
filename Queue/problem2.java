// Interleave two halves of a Queue 1,6,2,7,3,8,4,9,5,10

import java.util.*;
public class problem2 {
    public static void main(String[] args) {
        Queue <Integer> q = new LinkedList<>();
        for(int i = 1; i<=10; i++){
            q.add(i);   // 1,2,3,4,5,6,7,8,9,10
        }
        
        int n = q.size();

        Queue <Integer> temp = new LinkedList<>();
        for(int i = 0; i<n/2; i++){
            temp.add(q.remove());   //  1,2,3,4,5
        }

        // main work -> adding first element of temp, than add first element of q(self) 
        while(!temp.isEmpty()){
            q.add(temp.remove());
            q.add(q.remove());
        }

        // printing
        while(!q.isEmpty()){
            System.out.print(q.peek()+" ");
            q.remove();
        }
    }
}

// time -> O(n)
// space -> O(n)
