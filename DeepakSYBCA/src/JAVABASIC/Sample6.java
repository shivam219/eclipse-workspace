package JAVABASIC;

public class Sample6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Thread t=new Thread("thread 1");
		t.start();
		System.out.println("my thread name is \t"+t.getName());
	}

}
