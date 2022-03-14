package interview;

import java.util.HashSet;

public class find_duplicate_No_Array {
	public static void main(String[] args) {

		String arr[] = { "java", "c", "python", "python", "java" };
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j])
					System.out.println("Found duplicate element " + arr[i]);
			}
		}
		
		// approch 2 hasset
		boolean flag = false;
		HashSet <String > langs = new HashSet<String>();
		for(String a : arr) {
			
			if(langs.add(a)==false) {
				System.out.println("Found duplicate");
				flag = true ;
			}
		}
		System.out.println(flag==false ? "Not duplicate": "Duplicate");
	}
}
