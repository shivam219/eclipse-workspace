package contructor;
public class  test {
	int a=500; //before value
	test(){
	int aa=100;	//after value
	a=aa;
	}
	public static void main (String[] args) {
	
		test t1= new test();
	
		System.out.println(t1.a);	
		
	}
	
	
	
}