package bit_manipulation;

public class Trainling_zeors {
	public static void main(String[] args) {
		System.out.println(trailingZeros(2));
	}
	public static int trailingZeros(int n) {//1010
		int count=0;
		while(n!=0) {
			n |= (n-1);
			count++;
		}
		return count;
	}
}
