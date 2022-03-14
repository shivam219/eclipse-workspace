package map;
import java.util.*;
public class Map_test {
	public static void main(String[] args) {
	Map <Integer,String> map =new HashMap<>();
	map.put(20, "Gautam");
	map.put(23, "devi");
	map.put(24, "tain");
	System.out.println(map);
	///access single value by key 
	System.out.println(map.get(20));
	
	String check="Gautam";
	String neww=map.get(20);
//	boolean t_f = check==neww;
//	System.out.println(t_f);
	System.out.println(check.equals(neww));
	
	}
}
