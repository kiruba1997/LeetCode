class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int min_value = prices[0];
        for(int i=1;i<prices.length;i++){
            if(profit<prices[i]-min_value){
                profit = prices[i]-min_value;
            }
            if(prices[i]<min_value){
                min_value= prices[i];
            }
        }
        return profit;
    }
}