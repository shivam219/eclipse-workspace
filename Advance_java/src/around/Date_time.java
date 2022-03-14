package around;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Date_time {
	public static void main(String[] args) {
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date date = new Date();
		System.out.println(date);
		System.out.println(java.time.LocalTime.now());  
		// print today by manipulating 
		
		
		
		
		java.util.Date dates=new java.util.Date();  
		System.out.println(dates);  
		/// in these way we can print day in book format
		
//		String mydate = (String) formatter.format(date);
//		System.out.println(mydate);
//		copy a string types
		Date today = new Date(2002,11,9);
		System.out.println(today);

		long millis=System.currentTimeMillis();  
		java.sql.Date date1=new java.sql.Date(millis);  
		System.out.println(date1);
	}
}