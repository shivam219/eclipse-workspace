package M_f;

//package M_f;

public class finbonacci_seriese {
	public static void main(String[] args) {
		int t1 = 0, t2 = 1, n= 0;
		int term = 10;
		for(int i = 1 ; i<=term; i++){
			System.out.print(t1 +  "   ");
			n = t1 + t2;
			t1 = t2;
			t2 = n;
		}

	}
}
