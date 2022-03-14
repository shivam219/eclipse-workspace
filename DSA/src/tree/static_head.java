package tree;

public class static_head {
	int price1 = 10;
	static int price2 = 10;
	public int getPrice1() {
		return price1;
	}
	public void setPrice1(int price1) {
		this.price1 = price1;
	}
	public static int getPrice2() {
		return price2;
	}
	public static void setPrice2(int price2) {
		static_head.price2 = price2;
	}
	public static void main(String[] args) {
		static_head ob1 =  new static_head();
		static_head ob2 =  new static_head();
		ob1.price1=200;
//		ob1.price2=100;
		System.out.println(ob1.price1);
		System.out.println(ob2.price1);
		
	}
}
