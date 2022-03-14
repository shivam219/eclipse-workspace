package queue;

public class First_mius_vl {
	public static void main(String[] args) {
	    int arr[] = {12, -1, -7, 8, -15, 30, 16, 28};
	    int n = arr.length;
		firstMinus(arr);
	}

	public static void firstMinus(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			if (arr[i - 1] < 0) {
				System.out.print(arr[i-1]+ " ");
				continue;
			}
			else if (arr[i] < 0) {
				System.out.print(arr[i]+ " ");
			}
			else System.out.print(0 + " " );
		}
		System.out.println("Guu");
	}
}
