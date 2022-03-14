package string;

public class sum_of_two_in_aray {
	public static void main(String[] args) {
		int arr[] = {1 , 3, 4 ,9, 11, 16 , 17 , 20}; 
		int B =12; 
		sumOfTwo(arr, B);
	}

	public static void sumOfTwo(int[] arr , int B) {
		int l = 0; int r = arr.length-1;
		while(r>l) {
			int sum = arr[l]+arr[r];
			if(sum==B) {
				System.out.println("Founded  At " +  l  +  " "  + r);
			}
			if(sum<B) {
				l++;
			}
			else r--;
		}
		System.out.println("no founded");
	}
}
