package string;

public class Print_all_subsequence_string {
	static void powerSet(String str ,int i , String cstr) {
		if(str.length()==i) {
			System.out.println(cstr);
			return ;
		}
		powerSet(str,i+1,cstr+str.charAt(i));
		powerSet(str,i+1,cstr);
	}
	public static void main(String[] args) {
		String str = "abc";
		
//		System.out.println("abcd");
		powerSet(str,0,"");
	}
}
