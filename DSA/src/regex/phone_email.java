package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class phone_email {
	public static void main(String[] args) {
		Pattern p = Pattern.compile("a");
		Matcher m = p.matcher("abvdsfa");
		// phone 
		/*10
		 * [7-9][0-9]{9}
		 * 11
		 * 0?[7-9][0-9]{9}
		 *12 no--either 
		 *-- 0 time all international 
		 * (0|91)?[7-9][0-9]{9}
		 */
		/*email
		 *shivam123@gmail.com
		 *--1st character -> alphanumeric
		 *[a-zA-Z0-9][a-zA-Z0-9._]*@[a-zA-Z0-9]+([.][a-zA-Z0-9]+)
		 *file 
		 *[a-zA-Z0-9][a-zA-Z0-9_$.]*[.](java|class)
		 * 
		 */
	}
}