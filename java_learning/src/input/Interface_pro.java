package input;

interface Demo {

	 int  i = 8;

	void abc();

	static void show() {
		System.out.println("hii");
	}
}

class DemoImp implements Demo {
	public void abc() {
	
		
	}

}

public class Interface_pro {
	public static void main(String[] args) {
		Demo.show();

	}
}
