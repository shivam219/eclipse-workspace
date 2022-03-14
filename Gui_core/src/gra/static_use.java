package gra;
import java.io.IOException;
public class static_use {

//	static { 
//		System.out.println("hellow world");
//	}
	public static void main(String[] args){
		static_use ob = new static_use();
//		Class.forName("gra.use");
//		try {
			ob.isfileLode(0,20);			
//		} catch (Exception e) { System.out.println("cath");
//		}
		System.out.println("sdf");
	}
	public  void isfileLode(int a , int b)  {
		try {
			if(a==0 || b== 0) {
				throw new  IOException("file no ofune");
			}
			
		} catch (Exception e) {
		System.out.println("plase soecif file");
		}
	}
}
