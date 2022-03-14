package array;

public class Find_duplicate_elements_in_array_size_of_n_plus_1 {
	public static void main(String[] args) {
		int arr[] = new int[] {1,2,3,2,10,1,4,5,10};
		int n = 7 ;
		for(int i = 0; i<n;i++) {
			System.out.print(arr[arr[i]%n] +  "  "
					+ arr[i] +" " +
					arr[i]%n );
			System.out.print(arr[arr[i]%n]+n);
			arr[arr[i]%n] = (arr[arr[i]%n]+n) ;
//			System.out.print(arr[i] +" " );
			System.out.println();
		}
		float f = 1f;
		float f2 = 7f;
		
		System.out.println(f%f2);
		for(int i = 0; i<n;i++) {
//				System.out.println(arr[i]/n);
			if(arr[i]/n>1)System.out.println(i);
		
		}
	}
}
