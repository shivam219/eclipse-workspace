package interface_f;

public interface Actor {
	void act();

	void speak();

	default void comedy() {
		System.out.println("I can comedy");
	}

	default void make() {
		System.out.println("hii");
	}
	}
