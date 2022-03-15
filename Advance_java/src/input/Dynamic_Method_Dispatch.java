package input;

class O {
	
	public void show() {
		System.out.println("I O");
	}
}

class OO extends O {
	public void show() {
		System.out.println("I OO");
	}

	public void config() {
		System.out.println("I OO");
	}
}

class OOO extends O {
	public void show() {
		System.out.println("I OOO");
	}
}

public class Dynamic_Method_Dispatch {

	public static void main(String[] args) {
	/* O is reference OO object; we encounter
		compile time 
		*/
		O ob = new OO();
		ob.show();
		
		
	}
}
