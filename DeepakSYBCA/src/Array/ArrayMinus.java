package Array;

public class ArrayMinus {

	public static int[] rearrange(int a[], int n) {
		int j = 0, temp;
		for (int i = 0; i < n; i++) {
			if (a[i] < 0) {
				if (i != j) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
				j++;
			}
		}

		return null;
	}

//	static void printArr(int a[],int n) {
//		
//		
//		for(int i=0;i<n;i++) {
//			System.out.print(a[i]+" ");
//		}
//	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { -9, -8, 5, -7, 3, 48, -87, 65, -7, 25 };

		int n = a.length;
		System.out.println("before arrangement \n");
		for (int i = 0; i < n; i++) {
			System.out.print(a[i] + " ");
		}
//       	for(int i:	rearrange(a,n)) {
//       		System.out.print(i+" ");
//       	}

		rearrange(a, n);
		System.out.println();
		for (int i : a) {
			System.out.print(i+" ");
		}

	}

}
