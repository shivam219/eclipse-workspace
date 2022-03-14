package Date;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DAte_vas {
	public static void main(String[] args) {
	    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
	    Date date = new Date(); 
	    System.out.println(date);
//	    System.out.println(date.toString().format(null, args));
	    
//	    System.out.println(formatter.format(date));  
	    
	    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
	    LocalDateTime now = LocalDateTime.now();  
	    System.out.println(dtf.format(now).toString()); 
	    String str = dtf.format(now).toString();
//	    String str = String.valueOf(java.time.Year.now());
	    System.out.println(str);
	}
}
