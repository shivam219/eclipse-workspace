package arraylist;
import java.util.*;
public class Arr_list_cre_siz {

	public static void main(String[] args) {
		
		ArrayList arr = new ArrayList();
		arr.add(50);
		arr.add(100);    /// this auto go in 2 index
	    arr.add(1, 500); ///this element go in 1 index 
		System.out.println(arr);
		
		ArrayList nu = new ArrayList();
		nu=(ArrayList) arr.clone();
	    arr.clear();
	    System.out.println(arr);
		System.out.println(nu);
	    System.out.println(nu.contains(50));// to check is have it value	
	}
}
