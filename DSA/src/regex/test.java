package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class test {
	public static void main(String[] args) {
		Pattern p = Pattern.compile("^(\\d{1,3})\\.(\\d{1,3})\\.(\\d{1,3})\\.(\\d{1,3})$");
		String str = "00.";
		Matcher m = p.matcher(str);

		while (m.find()) {
			System.out.println(m.group() + " " + m.start() + " " + m.end());
		}
		// ip4
//		/Is used to guarantee that the value entered in the field where this constraint is placed is
//		a valid IPV4 address of the form: 127.0.0.1 where four octets are separated by a dot and none of the octets exceeds 255
		//ip6
//		Is used to guarantee that the value entered in the field conforms with the text representation of IP addresses defined in RFC 2373. 
//		For example: 0:0:0:0:0:0:0:1 is the loop back IPV6 Address. (see RFC 2373 for more details).

	}
	/*a
	 * a 0 1 
	 * a 3 4 
	 * a 4 5
	 * a+
	 * a 0 1
	 * aa 3 5
	 *a*
	 *a 0 1
	 *1 1
	 *2 2
	 *aa 3 5
	 *5 5
//	 not maintaining sequence a?
//	a 0 1
//	 1 1
//	 2 2
//	a 3 4
//	a 4 5
//	 5 5
	 *
	 * [a?]a?
	 * [a?]
	 * check for one word
	 * 
	 */



}
