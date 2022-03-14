import java.io.*;
class print{
	public static void main(String[] args) {
	
	//PrintWriter pw = new PrintWriter("abc.txt");
	//pw.println("xt");
	//Thread.sleep(1000);//1 second
	//System.out.println("hellow");
	try {
		System.out.println("hellow");
		Thread.sleep(1000);
	}
	catch(InterruptedException e) {
		e.printStackTrace();
	}
}}