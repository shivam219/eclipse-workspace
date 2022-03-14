import java.io.*;
import java.util.*;
class brw{
public static void main(String[] args) throws Exception{
	//File f = new File("ac.txt");
	FileWriter fr = new FileWriter("c.txt" , true);// if file not there create it 
	BufferedWriter br = new BufferedWriter(fr);
	br.write(1000);
	char ch[] = new char[]{'a','a','b'};
	String str = "hellow";
	br.write(ch);
	br.newLine();
	br.write(ch,0,1);
	br.newLine();
	br.write(str,2,3);
	br.close();PrintWriter pw = new PrintWriter("output.txt");
	
	
}}
class brr{
public static void main(String[] args) throws Exception{
	FileReader f = new FileReader("c.txt"); // throw file not found exception 
	BufferedReader br = new BufferedReader(f);//
	int ch = br.read();
	String str = br.readLine();
	br.reset();
	
}}