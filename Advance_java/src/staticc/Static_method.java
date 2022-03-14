package staticc;

class Abs{
	 static int i=10;
	public static void show()
	{
		System.out.println(" without static");
	}
}
public class Static_method {
	public static void main(String[] args) {
		Abs.show();
		
	}
}
