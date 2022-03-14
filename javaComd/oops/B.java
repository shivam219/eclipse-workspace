

class B {
	
	void m1(int i ){
		System.out.println(i + " primit ");
	}
	void m1(byte i ){
		System.out.println(i + " byte  ");
	}
	
	 
	void m1( float  i ){
		System.out.println(i + " Float ") ;
	}
	
	void  m1( double i ){
		System.out.println(i + " primit "); 
	}
	void m1( Object i ){
		System.out.println(i + " Obejct ");
	}
	
	void m1( String i ){
		System.out.println(i + "String "); 
	}
	void m1( StringBuffer i ){
		System.out.println(i + "  String  Buffere "); 
	}
	void m1( StringBuilder i ){
		System.out.println(i + "  String Builder"); 
	}
	public static void main(String[] args) {
		B ob = new B();
		//ob.m1(null);
		ob.m1(20);
		ob.m1(20.52f);
		ob.m1(20.949446f);
	}
	
}