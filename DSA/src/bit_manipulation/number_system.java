package bit_manipulation;

public class number_system {
	public static void main(String[] args) {

		int ii = 10;
		/// autoboxing -- wrapper class
		Integer i = ii;
		System.out.println(i);

		// undoxing

		Integer j = new Integer(100);
		int jj = j.intValue();
		System.out.println(jj);
		
		char  a = '&';
		int aa = a;
		System.out.println(aa);
		
		

//		java is pure object oriented mean we can achieve 100% oops concept is java it means but we have 
//		primitive data type for this have some wrapper class 
//		Character, Boolean, Byte , Short,  Integer , Double , Float , Long
		
		/*ASCII - american standard code for information interchange
		 * it is most polular standard to represent character in computer
		 * it use 7 bits to code each character besides code for character 
		 * in this standard code are defined to convey information such as
		 * end of line, end of page to the computer 
		 *
		 * ISCII - Indian sript code for information interchange -
		 * it is standardized by bureau of Indian standard it is an 
		 * 8 bit code which encodes both english and Indian scripts alphabet
		 * 
		 * Unicode :- it has been standardized specifically to acconmmodate a large numebr of 
		 * special symbol such as greek character, mathematical symbol and non- English character 
		 * it uses 16 bit to represent each character   
		 * 
		 * utf - unicode transformation formate :- suitable for tezxt that we
		 * mostly lain alpphasbet letters  for example english spansh french and most wbe
		 * technology such as html css javascript, ost linux's files are in utf- 8
		 * by default utf ( encoding system is backwards compatible with ascii 
		 * 
		 * utf 16 :- for asian language containing lots fo chinese and japanese chatachter, utp -16 creates smallter file size
		 */
	}
	
}
