interface sum {
	int summ(int a, int b);
}
 interface sumgen<T> {
	T  sum(T a, T b);
}
 interface sumgenN<T extends Number> {
	T  sum(T a, T b);
}
class lam_full {
	public static <T> void main(String[] args) {
		sumgen ob  = new  sumgen(){
			public T sum(Object t1 , Object t2){
				System.out.println(t1);return (T) new String("kooio");
			}
		};
		sumgenN ob2  = new  sumgenN(){
			public T sum(Object t1 , Object t2){
				System.out.println(t1);return (T) new String("kooio");
			}
		};
		ob.sum(new String("rama") , new String("ss"));
	}	
}

