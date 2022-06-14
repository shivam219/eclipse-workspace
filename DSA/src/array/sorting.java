package array;

import java.util.Arrays;

import searching.main;

public class sorting {

	public static void main(String[] args) {
		int arr[] = {8,1,2,10,4,5,6};
		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				if(arr[i]>arr[j]) {
					int temp  = arr[i];
					arr[i]= arr[j];
					arr[j]= temp;
				}
			}
		}
	System.out.println(	Arrays.toString(arr));
	}
}
class sortTillK{
	public static void sort(char[] ch, int k) {
		int i = 0, r =k;
		while(i<=r) {
			char c = ch[i];
			ch[i] = ch[r];
			ch[r] =c;
			i++;
			r--;
		}
	}
	public static void main(String[] args) {
		String str = "shivam";
//		              012345
		char ch[] = str.toCharArray();
		sort(ch,3);
		System.out.println(ch);
	}
}
