package M_f;

import java.util.Arrays;

public class s {
	public class Solution {
	    public String solve(String A) {
	        int arr[] = new int[A.length()];
	        for(int i = 0; i<arr.length;i++){
//	            arr[i] = Integer.parseInt(A.charAt(i));
	            arr[i] = Integer.parseInt(A.charAt(i)+"");
	        }
	        int d1 = 0,d2 ; boolean flag = false; int idx = 0;
	        int n = arr.length-1;
	        for(int i = n ;i>0;i--){
	            if(arr[i-1]>arr[i]){
	                flag = true;
	            }
	            else {
	                flag = false;
	                d1 = arr[i-1];
	                idx = i-1;
	                break;
	            }
	        }
	        if(flag){
	            return "-1";
	        } int min = Integer.MAX_VALUE;  int idx2 = 0;
	        for(int i = idx+1; i<arr.length;i++){
	            if(arr[idx]<arr[i] ){
	                if(min>arr[i]){
	                    min = arr[i]; idx2 = i;
	                } 
	            }
	        }
	        int temp  = arr[idx];
	        arr[idx] = arr[idx2];
	        arr[idx2] = temp;

	    int val = Integer.MAX_VALUE;
	    int x = 0;
	    for (int i = idx; i < arr.length; i++) {
	        for (int j = i; j < arr.length; j++) {
	            if (arr[j] < val) {
	                val = arr[j];
	                x = j;
	            }

	        }
	        int temp1 = arr[i];
	        arr[i] = val;
	        arr[x] = temp1;
	        val = Integer.MAX_VALUE;
	    }

	    return Arrays.toString(arr);
	    }
	}

}
