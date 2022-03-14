package interview;

public class String_manupilation {
	public static void main(String[] args) {

//		String s = "java programming   java     opps";
//		s=s.replaceAll("\\s"," ");
//		System.out.println(s);

//		String s ="fasf@#$%$#%sdfasdfasdf     5666565@566";
//		s=s.replaceAll("[a-zAa-Z0-9]", "");
//		System.out.println(s);

		String ss = "java programming is java opps";
		int t = ss.length();

		int tb = ss.replace("a", "").length();
//		int tbb = ss.replace(ss, ss) second selection
		System.out.println(t + " " + tb);

		System.out.println(t - tb);

		int count = 1;
		for (int i = 0; i <= ss.length() - 1; i++) {
			if ((ss.charAt(i) == ' ') && (ss.charAt(i + 1) != ' ')) {
				count++;
			}

		}

		String str = "Welcome  to java ";
		String[] word = str.split(" ");
		String rev = " ";

		for (String w : word) {
			 
		}
	}
}
