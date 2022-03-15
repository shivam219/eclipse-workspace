package therad;

public class r {
	public static void main(String[] args) {
		T11 ob = new T11() {
			public void m1() {
				
				
			}
		};
		T11 ob1 = () -> {
			System.out.println("m1 method overriding");
		};
		
		}
}

@FunctionalInterface
interface T11 {
	public void m1();
}