package interview;

public class Even_Odd_count_from_Number {
	public static void main(String[] args) {

/*		int num[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int len = num.length;
		System.out.println(len);
		int t = 0;
		int even = 0;
		int odd = 0;

		while (len-- > 0) {
			// decrese value then execute
			t = num[len];
			if (t % 2 == 0)
				even++;

			else
				odd++;

		}
		System.out.println("Even count " + even);
		System.out.println("Odd count " + odd);
		*/
		
		int num = 123456789;
		int even = 0;
		int odd = 0 ;
		while(num>0) {
		int rem = num%10;
			if(rem%2==0)
				even++;
			else
				odd++;
			num=num/10;
		}
	}
}

