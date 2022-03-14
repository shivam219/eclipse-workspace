package searching;

public class Find_min_and_max {
	public static void main(String[] args) {
		int arr[] = new int[] { 2, 20,  10, 50 };
		int min = arr[0], curmin = 0;
		int max = 0, curmax = 0;
		for (int i = 0; i < arr.length; i++) {
			curmax = curmin = arr[i];
			if (min > curmin)
				min = curmin;
			if (max < curmax) {
				max = curmax;
			}
		}
		System.out.println("min =  " + min + "  max = " + max);
	}
}
