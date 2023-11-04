// Activity Selection (Sorted)

import java.util.*;
public class ActivitySelection{
    public static void function(int start[], int end[]){

        ArrayList<Integer> list = new ArrayList<>();
        // first activity(default)
        int count = 1;
        list.add(0);

        //last end time
        int lastend = end[0];

        for(int i = 1; i<start.length; i++){    // O(n)  
            if(start[i]>=lastend){
                count++;
                lastend = end[i];
                list.add(i);
            }
        }
        System.out.println("maximum activities : "+count);
        // print activity no.
        for(int i = 0; i<list.size(); i++){
            System.out.print("A"+list.get(i)+" ");
        }
    }

    public static void main(String[] args){
        int start[] = {1, 3, 0, 5, 8, 5};
        int end[] = {2, 4, 6, 7, 9, 9};     // sorted

        function(start, end);
    }
}