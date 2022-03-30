package date;

import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class get_weeek_name {
	public static void main(String[] args) throws ParseException {
//		Format f = new SimpleDateFormat("EEEE");
//		String str = f.format(new Date().parse("2002:11:01"));
////		System.out.println("Day Name: " + str);
//
//		System.out.println(new Date().toString());
//		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
		Date date = simpleDateFormat.parse("2002-07-18");
		SimpleDateFormat yy = new SimpleDateFormat("EEEE");
		System.out.println(yy.format(date));

	}
}
