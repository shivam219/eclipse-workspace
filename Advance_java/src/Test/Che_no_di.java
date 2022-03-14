package Test;

public class Che_no_di {
	public static void main(String[] args) {
		
//	checking two no divisible
		int x=11;
		if (x%5==0 & x%10==0) {
			System.out.println("both is divisible by 5 and 10");
			
		}if (x%5==0 | x%10==0) {
			System.out.println("any is divisible by 5 and 10");
			
		}
	}
}
