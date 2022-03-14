package exce;

public class getINt {
	public static void main(String[] args) {
		getp ob =null;
		ob = get.getInstac();
		get ob1 = (get) ob;
		System.out.println(ob1.a);
		System.out.println(ob);
	}
}
class getp {
	int a = 20;
}
class get  extends getp{
	int a = 10;
	private get() {
	}
	static get getInstac() {	
		return new get();
	}
}