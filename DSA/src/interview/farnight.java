package interview;

public class farnight {

	public static void main(String[] args) {
		celsiusToFahrenheit(20);
		fahrenheitToCelsius(68d);
		System.out.println(tofahrenheit(20d));
	}
	public static void fahrenheitToCelsius(double  d) {
		double n = (5.0/9.0) * (d-32);
		System.out.println(n);
	}
	public static double tofahrenheit(double celsius) {
		return (celsius * (9.0 / 5.0) + 32);
	}
	public static void celsiusToFahrenheit(int celsius) {
		double n = celsius * (9.0 / 5.0) + 32;
		System.out.println(n);
	}
}
