class rec {
	public static void m1(int i){
		
		m2(i);
		m1(i);
	}
	public static void m2(int i){
		
		m1(i);
		m2(i);
	}
	
	
	
	public  static void main(String[] args) {
		m1(10);
	System.out.println("hellow");
	}
}