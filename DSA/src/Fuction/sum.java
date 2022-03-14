package Fuction;

import java.util.Arrays;

@FunctionalInterface
interface sum {
	int summ(int a, int b);
}

class summm <T>{
	public static <T> void main(String[] args) {
		sum oblamda = (c, d) -> {
			return c + d;
		};
		summm on =  new summm(); 
		
		on.show();
		sumgen ob  = new  sumgen(){
			public int sum(Object a, Object b) {
				System.out.println(a);
				return 0;
			}
		};	

	}
	T t = (T)new int[] {1,2,3,4};
	public void show() {
	System.out.println(t.getClass().getName());
	System.out.println(t);
	int[] i =(int[]) t;
	Arrays.stream(i).forEach(e->System.out.println(e));
	}
}
interface sumgen<T > {

	int sum(T a, T b);
}
