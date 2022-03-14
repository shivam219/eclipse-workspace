import java.io.*;// here execpiton file 
import java.util.*;
class filee{
	public static void main(String[] args) throws Exception{
		//File f = new File("abc.txt");/// file not found exception should be thrown or cuaght
		//System.out.println(f.exists());
		//f.createNewFile();
		//System.out.println(f.exists());
		//File f1 = new File( "E:\\javaComd\\fileOI\\fold", "abc.txt");/// file not found exception should be thrown or cuaght
	//	"E:\javaComd\fileOI\fold"
		//"E:\javaComd\fileOI\abc.txt"
		//f1.createNewFile(); //throws finel not fount e
		
		File f3 = new File("E:\\"); // return E:
		//System.out.println(f3.length());//8192 which length i dont know 
		//System.out.println(f3.list());
		String str [] = f3.list();
		Arrays.stream(str).forEach(e->System.out.print(e));
		HashMap<Character ,Integer> mp = new HashMap<>();//file
		HashMap<Character ,Integer> mp2 = new HashMap<>();//firectory
		int cntFile= 0, cntDir= 0;
		for(int i = 0; i<str.length; i++){
			File f2 = new File(f3,str[i]);
			char ch = str[i].charAt(0);
			if(f2.isFile()){
			cntFile++;
			if(mp.containsKey(ch)){//check key is present
				 mp.put(ch, mp.get(ch) + 1);
			}
			else{mp.put(ch,1);}
			}
			if(f2.isDirectory()){
			cntDir++;
			if(mp2.containsKey(ch)){//check key is present
				 mp2.put(ch, mp2.get(ch) + 1);
			}
			else{mp2.put(ch,1);}
			}	
		}
		System.out.println("total Containts " + str.length);
		System.out.println("total  files  " + cntFile);
		for(Map.Entry entry : mp.entrySet()){
		System.out.println(entry.getKey() + " " + entry.getValue());
		}
		System.out.println("total  Folder " + cntDir);
		for(Map.Entry entry : mp2.entrySet()){
		System.out.println(entry.getKey() + " "+ entry.getValue());
		}
	}
}