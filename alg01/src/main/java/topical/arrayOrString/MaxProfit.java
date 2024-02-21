package topical.arrayOrString;

/**
 * @author hff
 * @Description: 买卖股票的最佳时机
 * @date 2023/8/18 10:32
 */
public class MaxProfit {

    /**
    * 给定一个数组 prices ，它的第 i 个元素 prices[i] 表示一支给定股票第 i 天的价格。
     * 你只能选择 某一天 买入这只股票，并选择在 未来的某一个不同的日子 卖出该股票。设计一个算法来计算你所能获取的最大利润。
     * 返回你可以从这笔交易中获取的最大利润。如果你不能获取任何利润，返回 0 。
     *
     * 该方法会超时
    * */
    public static int maxProfit(int[] prices) {
        int max = 0;
        if(prices.length == 0){
            return 0;
        }
        for (int i = 0; i < prices.length; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                if(max < (prices[j] - prices[i])){
                    max = prices[j] - prices[i];
                }
            }
        }
        return max;
    }

    public static int maxProfit2(int[] prices) {
        int maxProfit = 0;
        int preMin = prices[0];
        int n =prices.length;
        for (int i = 0; i < n; i++) {
            maxProfit = Math.max(maxProfit, prices[i] - preMin);
            preMin = Math.min(preMin, prices[i]);
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        int i = maxProfit2(prices);
        System.out.println("max profit: " + i);
    }
}
