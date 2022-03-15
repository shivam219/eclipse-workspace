package enum_;
enum To {
	T {
		@Override
		boolean showpass(boolean t) {
			// TODO Auto-generated method stub
			return false;
		}
	};
	int i;
	void enterNo(int i) {
		this.i = i;
	}
	void showNo() {
		System.out.println(i);
	}
	
	abstract boolean showpass (boolean t);
	
}
public class Abstract_method  {
	public static void main(String[] args) {
		To ob1 = To.T;
		ob1.i = 20;
		ob1.showNo();
		To ob2  = To.T;
		ob2.showpass(true);
	}
	
}
