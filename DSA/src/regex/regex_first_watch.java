package regex;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class regex_first_watch {
/*  
 * [a-zA-Z0-9]-alphanumeric
 * [^a-zA-Z0-9]-except alphanumeric
 * \\s - space
 * \\S -  space
 * \\w - alphanumeric
 * \\W - except alphanumeric
 * \\d - digit 0-9
 * \\d - except digit 0-9
 * \\. - any symbol 
 * a - exactly one a count 
 * a+ at least one a in string 
 * a* zero or all include other string
 * a? exactly one also include other string
 */
	public static void main(String[] args) {
		Pattern p = Pattern.compile("[\\W]{5}");
		Matcher  m = p.matcher("akm22 )(*&^%$#@");
		while(m.find()) {
//			System.out.println(m.start() + "  " + (m.end()-1) + "  " +m.group());
		}
		Pattern p1 = Pattern.compile("aa");
		Matcher  m2 = p1.matcher("aabbaaabea");
//			  					  0123456789
		while(m2.find()) {
			System.out.println(m2.start() + "  " + (m2.end()-1) + "  " +m2.group());
		}	
	}
}