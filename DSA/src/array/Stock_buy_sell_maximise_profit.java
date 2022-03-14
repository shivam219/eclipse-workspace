package array;

public class Stock_buy_sell_maximise_profit {
//	 single buy option
//	static int maxProfit(int []a) {
//		int maxProfit = 0;
//		int minSofar = a[0];
//		for(int i = 0; i<a.length;i++) {
//			minSofar = Math.min(minSofar, a[i]);
//			int profit = a[i] - minSofar;
//			maxProfit = Math.max(maxProfit, profit);
//		}
//		
//		return maxProfit;
//	} 
//	--------------- 
	// mutliple bu option

	static int  maxProfit(int arr[]) {
		int profit = 0;
		for(int i = 1; i<arr.length;i++) {
			if(arr[i]>arr[i-1]) {
				profit+=arr[i] - arr[i-1];
			}
		}
		return profit;
	}
	public static void main(String[] args) {
		System.out.println(maxProfit(new int[] {2,1,3,4,5,1}));
	}
}
