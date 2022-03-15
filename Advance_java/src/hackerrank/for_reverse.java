package hackerrank;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class for_reverse {
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
//
//		System.out.print("Size of input :- ");
//		
//		int[] a = {1,2,3,4};int n= a.length;
//		for (int i : a){
//			System.out.println(i);
//		}
//		while( n -- > 0)   /*n== 4 3 to 0*/ {
//			System.out.println(a[n]);
//		}

//		int n = sc.nextInt();
//		sc.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//		int[] arr = new int[n];
//
//		String[] arrItems = sc.nextLine().split(" ");
//		sc.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

//		for (int i = 0; i < n; i++) {
//			int arrItem = Integer.parseInt(arrItems[i]);
//			arr[i] = arrItem;
		// System.out.print();
//	}
//		for (int j = 0; j < arr.length; j++) {
//			System.out.print(arr[j] + " ");
//		}

//		sc.close();
//		System.out.println("revers in aray");
//		 int n = sc.nextInt();
//	        sc.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//	        int[] arr = new int[n];
//
//	        String[] arrItems = sc.nextLine().split(" ");
//	        sc.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//	      
//	    
//	            while(n-- >0){          
//	                System.out.print(arrItems[n]+" ");
//	            }
//	        sc.close();

//		  BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//	        int n = scanner.nextInt();
//	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//	        int[] arr = new int[n];
//
//	        String[] arrItems = scanner.nextLine().split(" ");
//	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//	        for (int i = 0; i < n; i++) {
//	            int arrItem = Integer.parseInt(arrItems[i]);
//	            arr[i] = arrItem;
//	        }
//
//	        int[] result = countingSort(arr);
//
//	        for (int i = 0; i < result.length; i++) {
//	            bufferedWriter.write(String.valueOf(result[i]));
//
//	            if (i != result.length - 1) {
//	                bufferedWriter.write(" ");
//	            }
//	        }
//
//	        bufferedWriter.newLine();
//
//	        bufferedWriter.close();
//
//	        scanner.close();
//	}
//	 private static final Scanner scanner = new Scanner(System.in);
//	 static int[] countingSort(int[] arr) {
//      
////         int[] a = new int[arr.length];
//         Arrays.sort(arr);
//		return arr;

//-----Sorting array without any method--------------------------------------------------
//		int[] arr = new int[] { 78, 34, 1, 3, 90, 34, -1, -4, 6, 55, 20, -65 };
//
//		System.out.println("Before " + arr + "after");
//		// sorting logic
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = i + 1; j < arr.length; j++) {
//				int tmp = 0;
//				if (arr[i] > arr[j]) {
//					tmp = arr[i];
//					arr[i] = arr[j];
//					arr[j] = tmp;
//				}
//			}
//			System.out.println(arr[i]);
//		}

		System.out.println("Program to sort without method");
//		String arr = sc.nextLine(); // splite by space
		int n = 0;
		System.out.print("Enter number :-");
		n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.print("Enter Element :- ");
			arr[i]=sc.nextInt();  
			sc.nextLine();
		}
		System.out.print("\n[");
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				int t = 0 ;
				if(arr[i]> arr[j]) {
					t =arr[i];
					arr[i] = arr[j];
					arr[j] = t;
					
				}
			}
		System.out.print( arr[i]+ " ");
		}
		System.out.print("]");

	}

}
