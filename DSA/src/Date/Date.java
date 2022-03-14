package Date;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
public class Date {
	public static void main(String[] args)throws Exception {
		// long l = System.currentTimeMillis()/1000/3600/24/365;
		// System.out.println(l);
		// LocalDateTime dt = LocalDateTime.now();
//        System.out.println("Before Formatting: " + d2);  
//        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");  
//        String formatDateTime = d2.format(format);  
//        System.out.println("After Formatting: " + formatDateTime);  
		
		Scanner sc = new Scanner(System.in); 
	    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
	    LocalDateTime now = LocalDateTime.now();  
	    System.out.println(dtf.format(now));  
	    
		File f = new File("date.txt");f.createNewFile();
		BufferedWriter br = new BufferedWriter(new FileWriter(f));
		String msg = "";
		while (!msg.equals("no")) {
			now= LocalDateTime.now();
			msg = sc.nextLine();// console line till \n
			if(!msg.equals("")) {
			br.write(dtf.format(now) + ": "+ "rama : "  + msg);/// char ch , ch [] , "str "
			br.newLine();
		}}
		br.close();
		System.out.println("complete");
		
	}
}
