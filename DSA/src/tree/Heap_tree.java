package tree;

public class Heap_tree {
	public void sort(int A[]) {
		int n = A.length;
		// Build heap (rearrange array)
		for (int i = n / 2 - 1; i >= 0; i--)
			heapify(A, n, i); // 
		
		// One by one extract an element from heap
		for (int i = n - 1; i >= 0; i--) {
			// Move current root to end
			int temporary = A[0];
			A[0] = A[i];
			A[i] = temporary;

			// call max heapify on the reduced heap
			heapify(A, i, 0);
		}
	}

	// To heapify a subtree rooted with node i which is
	// an index in arr[]. n is size of heap
	void heapify(int A[], int n, int i) {
		int lar = i; // Initialize largest as root
		int L = 2 * i + 1; // left = 2*i + 1
		int R = 2 * i + 2; // right = 2*i + 2

		// If left child is larger than root
	 	if (L < n && A[L] > A[lar])
			lar = L;

		// If right child is larger than largest so far
		if (R < n && A[R] > A[lar])
			lar = R;

		// If largest is not root
		if (lar != i) {
			int swap = A[i];
			A[i] = A[lar];
			A[lar] = swap;

			// Recursively heapify the affected sub-tree
			heapify(A, n, lar);
		}
	}
	/* A utility function to print array of size n */
	static void print_array(int A[]) {
		int n = A.length;
		for (int i = 0; i < n; ++i)
			System.out.print(A[i] + " ");
		System.out.println();
	}
	public static void main(String args[]) {
		int A[] = { 22, 21, 3, 25, 26, 7 };
		Heap_tree ob = new Heap_tree();
		ob.sort(A);
		System.out.println("Sorted array is");
		print_array(A);
	}
}
