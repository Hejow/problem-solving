class Solution {
	public int maxProfit(int[] prices) {
		var price = Integer.MAX_VALUE;
		var profit = 0;

		for (var p : prices) {
			price = Math.min(price, p);
			profit = Math.max(profit, p - price);
		}

		return profit;
	}
}
