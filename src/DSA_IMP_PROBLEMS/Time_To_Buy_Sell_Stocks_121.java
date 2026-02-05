package DSA_IMP_PROBLEMS;

public class Time_To_Buy_Sell_Stocks_121 {
    public static void main(String[] args) {
        int[] prices = {7,6,4,3,1};
        System.out.println(maxProfit(prices));
    }

    public static int maxProfit(int[] prices){
        int min = prices[0];
        int profit = 0;
        for(int i = 1; i < prices.length; i++){
            if(prices[i] < min){
                min = prices[i];
            }
            profit = Math.max(prices[i] - min, profit);
        }
        return  profit;
    }
}
