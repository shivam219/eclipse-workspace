package over;

public class Exten {
public void move() {
	System.out.println("animal can move");
	
}
}
 class Local extends Exten{
	public void move() {
		System.out.println("dogs can wlak and run");
		
	}}
  class Ask{
	public static void main(String[] args) {
		Exten ob1 = new Exten();//access main class
		Exten ob2 = new Local();
	
}

}	


