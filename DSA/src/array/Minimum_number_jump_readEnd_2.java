package array;

public class Minimum_number_jump_readEnd_2 {

	public static void main(String[] args) {

		int arr[] = { 2, 3, 3, 4, 6, 5, 3, 2, 4, 2, 1, 4, 2, 1, 4, 5 };
		System.out.println("Total values in arry : " + arr.length);
		int last = 0, cur = 0, count = 0, n = arr.length, si = 0, first = 0;
		boolean con = false;
		for (int i = 0; i < n; i++) {
			cur = arr[i];
			if (n < arr[0]) {
				System.out.println("we reach to end to min - 1 ");
				break;
			}
			if (cur > 1) {
//				0  1  2  3  4  5  6  7  8  9  10
//				2, 3, 20, 4, 2, 3, 1, 2, 2, 5, 6  //22
				for (int c = i; c < cur + i; c++) { // c == 2 cur = 22

					if (arr[c] <= arr[c + 1]) {//
						last = arr[c + 1]; // 2
						first = arr[c];
						si = c + 1;
						if (n <= last + i || n <= first + i) {
							System.out.println("We reach to end ");
							con = true;
							count++;
							break;
						}
					}
				}
				if (last == 0) {
					i = cur + i - 1;
					last = 0;
				}
				if (last > 0) {
					i = si + i - 1;
					last = 0;
				}

			}
			if (con) {
				count++;
				break;
			}

			count++;
		}
		System.out.println("We reach to end minimum jump" + count);

		for (int i = 1; i < 10; i++) {

			System.out.println("i : " + i);
			if (i == 5)
				break;
		}
	}
}
