package abstra_calss;

abstract class parent {
	private void hii() {
		// TODO Auto-generated method stub

	}
	abstract void no();
}

public abstract class Abstrat_class extends parent {
	int x = 100;

	abstract void hii();

//	abstract method ==  abstract class
//	abstract method compulsory to use
//	asbstract class === cannot create object
//	child class can resposible for body
	public void hiii() {
		
		System.out.println("hiii no avstract");
	}
	
	public static void main(String[] args) {
		 Abstrat_class st = null;
		 st.hiii();
	}
}

/*
 * Data abstraction is the process of hiding certain details and showing only
 * essential information to the user. Abstraction can be achieved with either
 * abstract classes or interfaces
 */