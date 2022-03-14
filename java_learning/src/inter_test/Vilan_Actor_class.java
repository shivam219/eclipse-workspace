package inter_test;

public class Vilan_Actor_class implements Actor {

	@Override
	public void act() {
		System.out.println("I can Act");

	}

	@Override
	public void speak() {
		System.out.println("I can speak");
	}

	public void rude() {
		System.out.println("I am rude");
	}
}
