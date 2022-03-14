package array;

import java.util.Arrays;

public class Smallest_subAray_with_sum_greater_than_agiven_alue {
//	 public static<T> int[] subArray(int[] arr, int beg, int end) {
//	        return Arrays.copyOfRange(arr, beg, end + 1);
//	    }
	static void subArrayGreaterSum(int arr[]) {
		int i = 0; int j = 0; String s = "";int  sum = 9; int cur = 0; boolean flag = false, flag2= false;
		int len = Integer.MAX_VALUE; int dif= 0;
		while(j<arr.length) {
			cur += arr[j];
			if(arr[j]==sum) { flag2 = true ;}
			else if(cur == sum)  flag = true;
			if (cur>sum || flag2) {
				while(cur>=sum) { 
					cur = cur - arr[i];i++;
					if(cur==sum) { flag = true; break;}
				}
			}
			if(flag) {System.out.println("SubArray " + cur + "  at " +i+ " " + j);
			dif = j-i+1;
				if(len>dif) {
					len = dif;
					s= Arrays.toString(Arrays.copyOfRange(arr,i,j+1));
				}flag=false; flag2=false;
				cur = cur - arr[i]; 	i++;
			}
			j++;
		}
	System.out.println(len + " "+ s);
	}
	public static void main(String[] args) {
		int arr[] = new int[] {2,2,4,1,2,1,4,5,7,9 , 4,5};
//		int arr[] = new int[] {4,5,7,9 , 4,5};
		System.out.println(Arrays.toString(arr));
//		String s = String.valueOf(Arrays.toString(arr));
//		System.out.println(s);
		
//		s=sysou
		subArrayGreaterSum(arr);
	}
}
