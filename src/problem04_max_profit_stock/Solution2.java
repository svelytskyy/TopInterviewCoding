package problem04_max_profit_stock;

public class Solution2 {
	
	public int maxProfit(int[] prices) {
		int maxProfit = 0;
		int minPrice = Integer.MAX_VALUE;
		for(int i = 0; i<prices.length; i++) {
			if(minPrice > prices[i]) {
				minPrice = prices[i];
			}
			if(prices[i] - minPrice > maxProfit) {
				maxProfit = prices[i] - minPrice;
			}
		}
		return maxProfit;
	}

}
