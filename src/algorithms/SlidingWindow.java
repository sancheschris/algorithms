package algorithms;

public class SlidingWindow {
    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{7, 1, 5, 3, 6, 4}));

        System.out.println(maxProfitBrutalForce(new int[]{7, 6, 4, 3, 1}));

        System.out.println(maxProfitImproved(new int[]{7, 1, 5, 3, 6, 4}));
    }

    public static int maxProfit(int[] prices) {
        int left = 0;
        int right = 1;
        int maxProfit = 0;

        while (right < prices.length) {
            if (prices[left] < prices[right]) {
                int profit = prices[right] - prices[left];
                maxProfit = Math.max(maxProfit, profit);
            } else {
                left = right;
            }
            right++;
        }
        return maxProfit;
    }

    public static int maxProfitBrutalForce(int[] prices) {
        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                if (prices[i] < prices[j]) {
                    int profit = prices[j] - prices[i];
                    maxProfit = Math.max(maxProfit, profit);
                }
            }
        }
        return maxProfit;
    }

    public static int maxProfitImproved(int[] prices) {
        int buyPrice = prices[0];
        int maxProfit = 0;

        for (int price : prices) {
            if (price < buyPrice) {
                buyPrice = price;
            } else {
                int profit = price - buyPrice;
                maxProfit = profit > maxProfit ? profit : maxProfit;
            }
        }
        return maxProfit;


    }
}
