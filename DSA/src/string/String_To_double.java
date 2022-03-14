package string;

import java.util.ArrayList;
import java.util.Arrays;

public class String_To_double {
	public static String clrFirst(String A) {
		for (int i = 0; i < A.length(); i++) {
			if (A.charAt(i) == '0') {
				continue;
			}
			A = A.substring(i, A.length());
			break;
		}
		return A;
	}
	public static String clrLast(String A) {
		boolean flag = false;
		boolean flag2 = false;
		for (int i = 0; i < A.length(); i++) {
			if (A.charAt(i) == 48 | A.charAt(i) == '.') {
				if (A.charAt(i - 1) == '.') {
					for (int j = i; j < A.length(); j++) {
						flag2 = true;
						if ((A.charAt(j) != 48 && A.charAt(j) != '.')) {
							flag2 = false;
							break;
						}
					}
				} else {
					for (int j = i; j < A.length(); j++) {
						flag = true;
						if (A.charAt(j) != 48 && A.charAt(j) != '.') {
							flag = false;
							break;
						}
					}
				}
			}
			if (flag2) {
				A = A.substring(0, i - 1);
			}
			if (flag) {
				A = A.substring(0, i);
			}
		}
		return A;
	}
	


	public static int compareVersion(String A, String B) {
		A= clrFirst(A);
		B= clrFirst(B);
		A= clrLast(A);
		B= clrLast(B);
		if(A.length()==1 && B.length()==1 ) {
			if(A.charAt(0)>B.charAt(0))return 1;
			else if(A.charAt(0)<B.charAt(0))return -1;		
			return 0;
		}
	
		int len1 = A.length() - 1;
		int len2 = B.length() - 1;
		int max = Math.max(len1, len2);
		
		for (int i = 0; i <= max; i++) {
			if( i > len1) {
				return -1;
			}
			if ( i > len2) {
				return 1;
			}
			if (A.charAt(i) == '.' && B.charAt(i) != '.')
				return -1;
			if (A.charAt(i) != '.' && B.charAt(i) == '.')
				return 1;
			if(i==max) {
				if(A.charAt(i)>B.charAt(i))return 1;
				else if(A.charAt(i)<B.charAt(i))return -1;
				return 0;
			}
		}
		return 0;
	}
	public static void main(String[] args) {
//		System.out.println(compareVersion("9.6", "6.61154768574.1982"));	
//		System.out.println(compareVerisons("9.6", "6.61154768574.1982"));	
		ArrayList<Integer> ar = new ArrayList<Integer>();
		Integer aar[] = {17,220};
	    ar.addAll(Arrays.asList(aar));
	    aar= ar.toArray(aar);
		
	}
	public static int compareVerisons(String v1,String v2) {
		  ArrayList<String> a = new ArrayList<>(Arrays.asList(v1.split("[.]")));
	        ArrayList<String> b = new ArrayList<>(Arrays.asList(v2.split("[.]")));

	        while(a.size() > b.size()) b.add("0");
	        while(a.size() < b.size()) a.add("0");
	        for(int i=0,j=0; i<a.size() && j<b.size(); i++,j++){
	            double d1 = Double.parseDouble(a.get(i));
	            double d2 = Double.parseDouble(b.get(j));

	            if(d1>d2) return 1;
	            else if(d1<d2) return -1;
	        }

	        return 0;
	}
}
