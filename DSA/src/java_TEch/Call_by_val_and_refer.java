package java_TEch;

public class Call_by_val_and_refer {
	int d =10;
	public Call_by_val_and_refer(int a ) {
	this.d = 	a;
	}
	public static void main(String[] args) {
		Call_by_val_and_refer ob = new Call_by_val_and_refer(10);
		ob.change(10);
	}

	int data = 50;
	public void change(int i) {
		data = i + 10;

	}
}
