public class RotatedArrat {
    public static int search(int nums[], int target, int si, int ei){
        if(si>ei){
            return -1;
        }
        
        int mid = si+(ei-si)/2;

        // case found
        if(nums[mid]==target){
            return mid;
        }

        // line 1
        if(nums[si]<=mid){
            // left
            if(target>=nums[si] && target<=mid){
                return search(nums, target, si, mid-1);
            } else {
                // right
                return search(nums, target, mid+1, ei);
            } 
        // line 2
        } else {
            // right
            if(target<=ei && target>=mid){
                return search(nums, target, mid+1, ei);
            } else {
                // left
                return search(nums, target, si, mid-1);
            }
        }
    }
    public static void main(String[] args) {
        int nums[] = {4,5,6,7,0,1,2};
        int target = 4;
        System.out.println(search(nums,target,0,nums.length));
    }
}
