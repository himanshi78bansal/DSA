// Trapping water

public class array_trappingWater {
    public static void trappedWater(int height[])
    {
        int trappedwater = 0;
        int n = height.length;
        // Calculate leftMax boundary - array
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for(int i = 1; i<n; i++)
        {
            leftMax[i] = Math.max(leftMax[i-1],height[i]);
        }
        // Calculate rightMax boundary - array
        int rightMax[] = new int[n];
        rightMax[n-1] = height[n-1];
        for(int i = n-2; i>=0; i--)
        {
            rightMax[i] = Math.max(rightMax[i+1],height[i]);
        }
        //loop
        for(int i = 0; i<n; i++)
        {
            // waterlevel = min(leftmax,rightmax)
            int waterlevel = Math.min(leftMax[i], rightMax[i]);
            trappedwater += waterlevel - height[i];
            // trappedwater = (waterlevel - height) * width of bar
        }
        System.out.println("Trapped Water in the given heights : "+trappedwater);
    }
    public static void main(String[] args) {
        int height[] = {4,2,0,6,3,2,5};
        trappedWater(height);
    }
}
