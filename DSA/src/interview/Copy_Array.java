package interview;

public class Copy_Array {
	public static void main(String[] args) {
		int arr[] = new int[4];
		int arr2[] = arr.clone();
		
		System.arraycopy(arr, 0, arr2, 0, arr.length);
		
	}
}
