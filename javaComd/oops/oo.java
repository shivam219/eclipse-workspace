class oo{
	public static void main(String[] args) {
	System.out.println("hellow");
	
	doStuff();
	}
	public static void doStuff(){
		System.out.println("ss");
		doStuffMore();
	}
	public static void doStuffMore()  throws InterruptedException{
		//Thread.sleep(1000);
	}
}