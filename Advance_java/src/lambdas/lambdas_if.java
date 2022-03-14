package lambdas;
interface if_or {
	int aa(int a);
}
public class lambdas_if {
	public static void main(String[] args) {
		if_or check = (a) -> {
			int i = 0;
			if (i == 0) {
				System.out.println("Lambdas expression in java");
			}
			return a;
		};
		System.out.println(check.aa(5));
	}
}
