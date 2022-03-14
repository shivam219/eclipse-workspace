package searching;

public class Fist_and_last {
//	 Auxiliary Space: सहायक स्थान:
	// Function for finding first and last occurrence
	// of an elements
	public static void findFirstAndLast(int arr[], int p) {
		int n = arr.length;
		int first = -1, last = -1;
		for (int i = 0; i < n; i++) {
			if (p != arr[i])//7 != 1
				continue; // not execute statement after continue
			if (first == -1)
				first = i;
			last = i;
		}
		if (first != -1) {
			System.out.println("First Occurrence = " + first + " index ");
			System.out.println("Last Occurrence = " + last + " index ");
		} else
			System.out.println("Not Found");
	}

	public static void main(String[] args) {
//		int arr[] = { 1, 2, 2, 2, 2, 3, 4, 7 };
		 int arr[] = {1, 3, 5, 5, 5, 5, 7,7, 8,8}    ;
		int x = 7;
		findFirstAndLast(arr, x);
	} // binary search
	  public static int first(int arr[], int low, int high, int x, int n)
	    {
	        if (high >= low) {
	            int mid = low + (high - low) / 2;
	            if ((mid == 0 || x > arr[mid - 1]) && arr[mid] == x)
	                return mid;
	            else if (x > arr[mid])
	                return first(arr, (mid + 1), high, x, n);
	            else
	                return first(arr, low, (mid - 1), x, n);
	        }
	        return -1;
	    }
	 
	    /* if x is present in arr[] then returns the index of
	    LAST occurrence of x in arr[0..n-1], otherwise
	    returns -1 */
	    public static int last(int arr[], int low, int high, int x, int n)
	    {
	        if (high >= low) {
	            int mid = low + (high - low) / 2;
	            if ((mid == n - 1 || x < arr[mid + 1]) && arr[mid] == x)
	                return mid;
	            else if (x < arr[mid])
	                return last(arr, low, (mid - 1), x, n);
	            else
	                return last(arr, (mid + 1), high, x, n);
	        }
	        return -1;
	    }
	 
}

