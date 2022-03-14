package o_o_p;

public class Covarint {
}
class Test{
	   int data =100;
	   Test demoMethod(){
	      return this;
	   }
	}
	class Sample extends Test{
	   int data = 1000;
	   Sample demoMethod(){
	      return this;
	   }
	   public static void main(String args[]){
	      Sample sam = new Sample();
	      System.out.println(sam.demoMethod().data);
	   }
	}