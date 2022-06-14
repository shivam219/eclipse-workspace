package Java_Feature;

import java.util.List;

public class var_try_reference {
	public static void main(String[] args) {
		List<String> str1 = List.of("Ranga","Ravi");
		var str2 = List.of("Ranga","Ravi");		
		List<List<String>> l = List.of(str1,str2);
		for(var a :l) {
			for(var b : a) {
				System.out.print(b +"  ");
			}
			System.out.println();
		}
//		var n = null;//cannot assign null to var
//		var is not a keyword
	}
}
