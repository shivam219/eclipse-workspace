package hashing;
public class reaarrange_To_anagram {
	   public static int solve(String A) {
	         int arr[] = new int[5];
	        for(int i=0;i<A.length();i++){
	            arr[A.charAt(i)-97]++;
	        }
	        int count=0;
	        for(int i=0;i<arr.length;i++){System.out.println(arr[i]%2);
	            if(arr[i]%2==1) {count++;}
	        }
	        if (count>1)return 0;
	        return 1;
	    }
	   public static void main(String[] args) {
		   	System.out.println(solve("aabbdc"));
	   }	
}