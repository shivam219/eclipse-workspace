package interview;

import java.util.Random;

public class Random_NO_Sting {
	public static void main(String[] args) {
		Random rand = new  Random();
		int ran = rand.nextInt();
		System.out.println(ran);
		// approch math
		System.out.println(Math.random());
		
		// working with apache
//		 String s = RandomStringUtils.randomNumeric(10);
//		 System.out.println(s);
	}
}
