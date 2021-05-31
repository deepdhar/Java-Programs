package Arrays;

public class StockBuyAndSell {
	
	//naive solution
	static int maxProfit(int price[], int start, int end) {
		if(end<=start) return 0;
		int profit=0;
		
		for(int i=start; i<end; i++) {
			for(int j=i+1; j<end; j++) {
				if(price[j]>price[i]) {
					int curr_profit = price[j] - price[i] + maxProfit(price, start, i-1) + maxProfit(price, j+1, end);
					profit = Math.max(profit, curr_profit);
				}
			}
		}
		return profit;
	}
	
	
	
	//efficient solution
	static int maxProfit2(int price[]) {
		int profit=0;
		for(int i=1; i<price.length; i++) {
			if(price[i] > price[i-1])
				profit += price[i] - price[i-1];
		}
		return profit;
	}

	
	
	
	public static void main(String[] args) {
		int arr[] = {7,1,5,3,6,4};
		System.out.println(maxProfit(arr,0,6));
	}

}
