package over;

public class Interface  implements InterFace_2 {

	@Override
	public void eat() {
    System.out.println("Its regular to eat ");
		
	}

	@Override
	public void travel() {
	System.out.println("Its not reagular to eat ");
		
	}
	   public static void main(String args[]) {
	      Interface m = new Interface();
//	      m.eat();
	      m.travel();
	      here hii =new  here();
	      hii.eat();
	   }

}
class here implements InterFace_2{
	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("shivam");
	}

	@Override
	public void travel() {
		// TODO Auto-generated method stub
			System.out.println("shivam");
	}	
	public static void main(String[] args) {
		
	}
}
