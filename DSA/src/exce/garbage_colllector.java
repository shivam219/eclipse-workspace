package exce;

/*after  finalize method call jvm call System.gc() method that cleanup anonymous object those  dosen't have referenced
 * then garbage collects all objec  whiare create 
*/
public class garbage_colllector {
    int j=12;  
    void add()  
    {  
        j=j+12;  
        System.out.println("J="+j);  
    }  
    public void finalize()  
    {  
        System.out.println("Object is garbage collected");  
    }  
    public static void main(String[] args) {  
        new garbage_colllector().add();  
        System.gc();  
        new garbage_colllector().add();  
    }  
}  
      

class bbb {
 float a = 10;
	
}