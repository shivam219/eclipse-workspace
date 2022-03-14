package array;

public class Buy_and_Sell_almost_twice_for_profit {
	public static void main(String[] args) {
		int arr[] = new int[] { 2, 10, 12, 2, 10 };
		int last = 0, sell = 0, buy = 0, cout = 0;
		for (int i = 0; i < arr.length - 1; i++) { // 4
			buy = arr[0];
			if (arr[i] < arr[i + 1]) {
				for (int j = i + 1; j < arr.length - 1; j++) {
					if (arr[j] < arr[j + 1]) {
						sell = arr[j + 1];// 10
						i = j + 1;
					} else if (arr[j] > arr[j + 1]) {
						sell = arr[j];

					}
					if (j == arr.length - 1) {
						cout = sell - buy;

					}

				}
			}

		}
		System.out.println(cout);
	}
}
