package string;

public class Check_if_two_strng_are_ishomorpic {
	static boolean isomophic(String str1, String str2) {
		int j = 0,n = str2.length();
		int arr1 [] = new int [n];
//		int arr2 [] = new int [n];
		String s1 = "";
		String s2 = "";
		while(j<n-1) {
			if(str1.charAt(j)==str1.charAt(j+1)) {
				s1+="0"; 
				if(j+2==n) arr1[j+1]=0;
				else if(str1.charAt(j+1) != str1.charAt(j+2)) {
					s1+="0"; j++;}
			}
			else if(str1.charAt(j)!=str1.charAt(j+1)) {
				s1+="1";  j++;}
			
		}j=0;
		while(j<n-1) {
			if(str2.charAt(j)==str2.charAt(j+1)) {
				s2+="0"; 
				if(j+2==n) arr1[j+1]=0;
				else if(str2.charAt(j+1) != str2.charAt(j+2)) {
					s2+="0"; j++;}
			}
			else if(str2.charAt(j)!=str2.charAt(j+1)) {
				s2+="1";  j++;}
			
		}
		
		return s1.equals(s2);
	}

	public static void main(String[] args) {
		String str1 = "cceee";
		String str2 = "cceee";
		System.out.println(isomophic(str1, str2));

	}
}
