package enum_;
enum Color {
	// both instance on class
	INSTANCE,APPLE;
	int i;
}
public class test {
	enum color{
		INSTANCE;
	}
	public static void main(String[] args) {
		Color c1  = Color.INSTANCE;
		Color c2  = Color.APPLE;
		c1.i=10;
		System.out.println(c2.i + " "+ c1.i);
	}
	
	
	
}
