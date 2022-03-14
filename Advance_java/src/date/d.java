package date;

import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class d {
	public static void main(String[] args) {
		SimpleDateFormat input = new SimpleDateFormat("yyyy-MM-dd hh:mm");
		DateTimeFormatter in = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm");
		
		DateTimeFormatter ou = DateTimeFormatter.ofPattern("hh:mm aa");
		SimpleDateFormat output = new SimpleDateFormat("");
	}
}
