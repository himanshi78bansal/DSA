public class array_buysellStocks {
    public static void function(int price[])
    {
        int buy = Integer.MAX_VALUE;
        int maxprofit = 0;

        for(int i = 0; i<price.length; i++)
        {
            // Minimum price to buy
            if(buy < price[i])
            {
                int profit = price[i] - buy;
                maxprofit = Math.max(maxprofit, profit);
            } else {
                buy = price[i];
            }
        }
        System.out.println("Maximum Profit : "+maxprofit);
    }
    public static void main(String[] args) {
        int price[] = {7,1,5,3,6,4};
        function(price);
    }
}
