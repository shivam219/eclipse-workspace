package over;

class Calculator {					//super  base parent
	public int add(int i, int j) {
		return i + j;
	}
	public int sub(int i, int j) {
		return i - j;
	}
}
class Caladv  extends Calculator{ 	//sub derived chld
//	 super(sub);
	public int sub(int i, int j) {
		return i - j;
	}
}
class Caladver  extends Calculator{ 	//sub derived chld
	 
	public int sub(int i, int j) {
		return i - j;
	}
}

public class Inher {
	public static void main(String[] args) {
		Caladv cal = new Caladv();
		int result1 = cal.add(10, 20);
		int result2 = cal.sub(10, 20);
		System.out.println(result1);
		System.out.println(result2);
		
	}

}
