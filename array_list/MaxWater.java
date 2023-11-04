import java.util.ArrayList;

// brute force --> time - O(n^2)
public class MaxWater {
    public static int function(ArrayList<Integer> height){
        int maxWater = 0; 
        int n = height.size();
        for(int i = 0; i<n; i++){
            for(int j = i+1; j<n; j++){
                int hvalue = Math.min(height.get(i),height.get(j));
                int width = j-i;
                int currWater = hvalue * width;
                maxWater = Math.max(currWater, maxWater);
            }
        }
        return maxWater;
    }

    // 2-Pointer method --> time - O(n)
    public static int function2(ArrayList<Integer> height){
        int lp = 0;     // leftPointer
        int rp = height.size()-1;       // rightPointer
        int maxWater = 0;
        while(lp<rp){
            // calculator water
            int ht = Math.min(height.get(lp),height.get(rp));   // heiht
            int wd = rp-lp;     // width
            int currWater = ht*wd;
            maxWater = Math.max(maxWater, currWater);

            // update pointer
            if(height.get(lp)<height.get(rp)){
                lp++;
            } else {
                rp--;
            }
        }
        return maxWater;
    }
    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);

        System.out.println(function(height));
        System.out.println(function2(height));

    }
}
