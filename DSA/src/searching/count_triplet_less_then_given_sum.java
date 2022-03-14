package searching;

import java.util.Arrays;

public class count_triplet_less_then_given_sum {
	static int solve(int arr[] , int n, int sum) {
		Arrays.sort(arr);
		int ans =0;
		for(int i=0; i<n-2;i++) {
			int j = i+1,k=n-1;
			while(j<k) {
				if(arr[i]+arr[j]+arr[k]>=sum)k--;
				else {
					ans+=(k-j);
					j++;
				}
			}
		}
	return ans;
	}
	public static void main(String[] args) {
		int arr[] = new int[] {1,3,4,5,7};
		int x =  12;
		System.out.println(solve(arr,arr.length,x));
		
		
	}
}
