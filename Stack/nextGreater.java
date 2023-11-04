import java.util.*;

public class nextGreater {
    public static void main(String[] args) {
        int arr[] = {6,8,0,1,3};
        int nextGen[] = new int[arr.length];

        Stack <Integer> s = new Stack<>();

        for(int i = arr.length-1; i>=0; i--){

            // step1 - while
            while(!s.isEmpty() && arr[s.peek()]<=arr[i]){
                s.pop();
            }

            // step2 - is-else
            if(s.isEmpty()){
                nextGen[i] = -1; 
            } else {
                nextGen[i] = arr[s.peek()];
            }

            // step3 - push in s
            s.push(i);

        }

        for(int i = 0; i<arr.length; i++){
            System.out.print(nextGen[i]+" ");
        }
    }
}
