package inter_test;

public  class Hero_Actor_class implements Actor		{

	@Override
	public void act() {
		// TODO Auto-generated method stub
		System.out.println("I can act");
	}
	
	@Override
	public void speak() {
		
		
		System.out.println(" I can speak");
	}
	public void comedy() {
		System.out.println("I can comedy");
	}
	// JAVA 	1.7  does not support defying in interface
	
	public static void main(String[] args) {
		Hero_Actor_class ss = new Hero_Actor_class();
		ss.make() ;
	}
	
	
}

