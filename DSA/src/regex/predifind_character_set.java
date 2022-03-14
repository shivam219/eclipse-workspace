package regex;

import java.util.regex.*;

// regex : - is way find pattern inn String and any sequence
public class predifind_character_set {
	public static void main(String[] args) {
		Pattern p = Pattern.compile("ra");
		Matcher m = p.matcher("ram raja");
		while (m.find()) {
			System.out.println(m.start() + " " + m.end() + " " + m.group());
//			System.out.println(m.find(0));
		}
		/*
		 * 
		 * 1.4 v pattern and mather in util.regex 
		 * import method matcher class 
		 * find() --return boolean 
		 * m.start -- return int index of starting 
		 * m.end ---- return int
		 * index of end m.group----return group 
		 * object 2 character class 
		 * -->[abc] -> either 'a' or 'b' or 'c'; []
		 * -->[^abc]->except a , b,c
		 * -->[a-z] -> any lower case alphabet symbol
		 * -->[A-Z]->  upper case
		 * -->[a-zA-Z]-> both
		 * -->[0-9]---->any digit fro 0 to 
		 * -->[a-zA-Z0-9]--any aplhanumerical character
		 * -->[a-zA-Z0-9] --any alphanumeric character
		 * ---------------------------------------------
		 * ==>predifine set charaacter 
		 *\\s - space character find and break
		 *\\S - except  space character 
		 *\\d - any digit  0  to 9
		 *\\D - any except 0 to 9
		 *\\w - any word [a-zA-Z0-9]
		 *\\W - except word character like *!#
		 *\\. - any character  like ("[.]")
		 *-----------------------------------------------
		 *Quantifiers - we can use to specify no of occurrence of matches
		 *e.g + ,* ,?
		 *(\\a) -- exclude a and break
		 *(\\a+)-- atleast one a should in string and more is possible - like a , aa ,aaa
		 *(\\a*)-- any occurrence even zero 
		 *(\\a?) -- 
		 *
		 * a 		a+			a*			a?
		 * 0__a	 	0___a		0___a		0__a
		 * 3__a		3___aa		1___		1__0
		 * 						2___		2__0
		 * 						3___aa		3__a
		 * 											
		 * 
		 */
		
		Pattern p1 = Pattern.compile("[.]");
		String[] s = p1.split("rama.jay.shancke");
		for(String s1 : s)
			System.out.println(s1);
		
		
	}
}