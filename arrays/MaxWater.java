// import java.util.Arrays;

public class MaxWater {
    public static void main(String[] args) {
        int arr[] = {1,8,6,2,5,4,8,3,7};
        int n = arr.length;
        int sum[] = new int[n];
        int height = 0;
        int width = 0;
        for(int i = 0; i<n; i++){
            for(int j = i+1; j<n; j++){
                height = Math.min(arr[i],arr[j]);
                width = j-i;
                sum[i] = height*width;
            }
        }
        int max = 0;
        for(int i = 0; i<n; i++){
            if(max < sum[i]){
                max = sum[i];
            }
        }
        System.out.println(max);
    }
}
