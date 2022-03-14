package interview_;

public class Main {
	public static void main(String[] args) {
		int arr[] = { 10, 4, 2, 5, 7 };
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
//		int arr[] = { 10, 4, 2, 5, 7 };
		System.out.println(max);
		int x = 0;
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < arr.length; i++) {
			int val = arr[i];//7
			if (val != max) {
				if (max - val < min) {//3
					min = max - val;
					x = arr[i];
				}
			}//x = 7
		}
		System.out.println(x);

	}
}
