package loops;

public class Transfer_statement {
	public int add() { //add(parameter )
		int aa = 10;
		int bb = 20;
		int zz = aa + bb;
		return aa+bb;
//		return zz;

	}

	public static void main(String[] args) {
//		 break
//
//		int[] a = { 10, 20, 30, 40 };
//
//		for (int x : a) {
//
//			if (x == 40)
//
//			{
//				break; // break till 40
//				continue // pause not print value
//			}
//
//			System.out.println(x);
//		}

		Transfer_statement ob = new Transfer_statement();
		int ad = ob.add();//ob.add(agrument)
		System.out.println(ad);
		
	}
}
