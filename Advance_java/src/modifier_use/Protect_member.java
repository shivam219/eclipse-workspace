
package modifier_use;

public class Protect_member extends BB {

	public static void main(String[] args) {

		AA ob = new AA();

//		B ob2 = new B();
//		AA ob3 = new B(); //only access 
		// ob3.m2()// parent class reference canot hold child memeber
//		AA ob4 ;ob4 = ob2; 
//		ob4.m2();

//		int var1 = 1;
//		int var2 = 3;
//		if ((var1 = 1) == var2) {
//		}
//		int sum = 0;
//		for (int i = 0, j = 0; i < 5 & j < 5; ++i, j = i + 1)
//			sum += i;
//		System.out.println(sum);
//		boolean a = true;
//		boolean b = true;
////		&& -- &&
//		if (a & b) {
//			System.out.println("s");
//		}
		int x = 2, y = 0;
		for (; y < 10; ++y) {
			if (y / x == 0) {
//				System.out.print(y / x);
				continue;
			} else if (y == 8) {
				break;
			} else {
				System.out.print(y + " ");
			}
		}
		final int a = 10 ,b =20;//yese
		System.out.println("s");
		int aa =10; 
		while(aa>a) {//final are choosen that jvm tells use
			
		}
		System.out.println("s");

	}
}

class AA {
	public void m1() {
		System.out.println("I in AA m1");
	}
}

abstract class BB {
	public void m1() {
		System.out.println("I in AA m1");
	}

	public void m2() {
		System.out.println("I in AA m1");
	}

}
