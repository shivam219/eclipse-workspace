package array;

public class merge_sort {
	static void mergeSort(int arr[], int l, int r) {
		if (l < r) {
			int mid = (l + r) / 2;
			mergeSort(arr, l, mid);
			mergeSort(arr, mid + 1, r);
			merge(arr, l, mid, r);
		}
	}
	static int b [] = new int[10]; 
	static void merge(int a[], int l, int mid, int r) {
		int i = l;
		int j = mid+1;
		int k = l ;
		while(l <=mid && j<= r) {
			if(a[i]<a[j]) {
				b[k]= a[i];i++;
			}
			else {
				b[k]= a[j];j++;
			}
			k++;
		}
		if(i>mid) {
			while(j<=r) {
				b[k] = a[j];
				j++ ; k++;
				
			}
		}
		else 
			while(i<=mid) {
				b[k] = a[i];
				k++;i++;
			}
		
		 System.arraycopy(b	, 0, a, 0, b.length);
	}


	public static void main(String[] args) {
		int arr[] = new int[] { 9, 4, 7, 6, 3, 1, 5 };
		int l = 0, r = arr.length - 1;
		mergeSort(arr, l, r);
	}

}
