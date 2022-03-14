package interview;

public class Sum_of_Number {
	public static void main(String[] args) {
		int num = 1234;
		int sum = 0;
		while(num>0) {
			sum =sum+num%10;
			num = num/10;
		}
	System.out.println(num);
	System.out.println(sum);
	}
	
}
