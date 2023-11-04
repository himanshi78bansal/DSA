// Given the weights and values of N items, 
// put these items in a knapsack(bori) of weight W 
// to get the MAXIMUM TOTAL VALUE in the knapsack

public class FractionalKnapSack{
    public static void main(String[] args) {
        int value[] = {60, 100, 120};
        int weights[] = {10, 20, 30};

        int capacity = 50;
        int maxVal = 0;

        for(int i = 0; i<value.length; i++){
            int ratio = value[i]/weights[i];
            if(capacity >= weights[i]){
                capacity = capacity - weights[i];
                maxVal = maxVal + value[i];
            } else {
                maxVal = maxVal + (ratio * capacity);
                break;
            }
        }

        System.out.println(maxVal);
    }
}