package array;

public class Best_time_to_buy_sell_share {
	public static void main(String[] args) {
		int arr[] = new int[] { 2, 10, 4, 2, 50 };
		int buy = 0, sell = 0;
		for (int i = 0; i < (arr.length - 1); i++) {
			buy = arr[i];
			if (arr[i] < arr[i + 1]) { // 2 < 10
				for (int j = i + 1; j < arr.length - 1; j++) { // 10 > 4| 4 > 2
					if (arr[j] >= arr[j + 1]) {
					} else
						break;
				}
			} else {
				if (arr[i] < arr[i + 1])
					buy = arr[i + 1];
			}

		}

	}
}
