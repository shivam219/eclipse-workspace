package hackerrank;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;
//valid ip ipv4 ==  3 element in  4 decimal value seperated by 
//. and leading 0 invalid range- 0-9 
//valid ip ipv6 == 4 element 8 hexadecimal value seperated by 
//: and leading 0 invalid range = 0-9 or a-f A-F
class Ip_find {

	public static void main(String[] args) {
		System.out.println("find valid ip address");
		Scanner in = new Scanner(System.in);
		String  ip = "(\\d{1,2}||(0|1)\\d{2}||2[0-4]\\d||25[0-5])";
		String pattern = ip + "\\." + ip + "\\." + ip + "\\." + ip;
		while(in.hasNext()) {
			String findip = in.nextLine();
		if (Pattern.matches(pattern, findip)) {
			System.out.println("valid ip address");
		}
		else 
			System.out.println("invalid ip address");
		}
		in.close();

	}
}

class MyRegex {

	String ip0to255 = "(\\d{1,2}||(0|1)\\d{2}||2[0-4]\\d||25[0-5])";

	public String pattern = ip0to255 + "\\." + ip0to255 + "\\." + ip0to255 + "\\." + ip0to255;
}