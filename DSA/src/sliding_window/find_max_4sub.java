package sliding_window;

public class find_max_4sub {
	public static void main(String[] args) {

		int arr[] = { 2, 3, 4, 5, 3, 2, 1, 4 };
		int i = 0;
		int sum = 0;
		int j = 0;
		int k = 3;
		int max = 0;
		while (j < arr.length) {
			sum = sum + arr[j];
			if (j - i + 1 < k)
				j++;
			else if (j - i + 1 == k) {
				if (max < sum) {
					max = sum;
				}
				sum = sum - arr[i];
				i++;
				j++;
			}
//			else if(j)

		}
		System.out.println(max);

	}
}
