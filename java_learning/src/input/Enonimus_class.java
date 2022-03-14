package input;

class o_i {
	public void show() {
		System.out.println("In A show");

	}
}

public class Enonimus_class {
	public static void main(String[] args) {
		o_i ob = new o_i() 
			
				{
			
			public void show()
			{
				System.out.println(" in New");
			}
				};   

	}
}
