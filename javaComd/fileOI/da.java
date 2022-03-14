
import java.util.*;
import java.time.*;// data and time classes present
import java.io.*;

class da{
public static void main(String[] args) throws  Exception {// 216000
	//long l = System.currentTimeMillis()/1000/3600/24/365;
	//System.out.println(l);
	//LocalDateTime dt = LocalDateTime.now();
	LocalDate d = LocalDate.now();
	System.out.println(d);
	LocalTime t = LocalTime.now();
	Scanner sc = new Scanner(System.in);
	File f = new File("date.txt");
	BufferedWriter br  = new BufferedWriter(new FileWriter(f));
	String msg = "";
	while(msg=="no"){	
		msg = sc.nextLine();//console line till \n
		br.write(d+""+  t + " "+ msg);///char ch , ch [] , "str "
		br.newLine();
	}
	br.close();
	System.out.println("complete");
}}