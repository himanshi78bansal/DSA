// Activity Selection (Not Sorted)  O(nlog(n))

import java.util.*;
public class ActivitySelection2{
    public static void function(int start[], int end[]){

        int activities[][] = new int[start.length][3];
        for(int i = 0; i<start.length; i++){
            activities[i][0] = i;
            activities[i][1] = start[i];
            activities[i][2] = end[i];
        }

        // sorting using lambda function
        Arrays.sort(activities, Comparator.comparingDouble(o -> o[2]));


        ArrayList<Integer> list = new ArrayList<>();
        // first activity(default)
        int count = 1;
        list.add(activities[0][0]);

        //last end time
        int lastend = activities[0][2];

        for(int i = 1; i<start.length; i++){    // O(n)  
            if(activities[i][1]>=lastend){
                count++;
                lastend = activities[i][2];
                list.add(activities[i][0]);
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