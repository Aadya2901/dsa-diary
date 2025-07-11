public class BuySellStock {
    public static void buySellStock(int prices[]) {
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < buyPrice) {
                buyPrice = prices[i];
            }

            else {
                int profit = prices[i] - buyPrice;

                if (profit > maxProfit) {
                    maxProfit = profit;
                }
            }
        }
    }

    public static void main(String[] args) {
        int prices[] = { 7, 1, 5, 3, 6, 4 };

        buySellStock(prices);
    }
}

/*
 * Function maxProfit(prices[0..n-1]):
 * minPrice = ∞
 * maxProfit = 0
 * 
 * for i from 0 to n-1:
 * if prices[i] < minPrice:
 * minPrice = prices[i] // update best buy day
 * else:
 * profit = prices[i] - minPrice
 * if profit > maxProfit:
 * maxProfit = profit // update best profit
 * 
 * return maxProfit
 * 
 * Time Complexity: O(n)
 */