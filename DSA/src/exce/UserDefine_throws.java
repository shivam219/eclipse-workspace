package exce;

public class UserDefine_throws {
	public static void main(String[] args) throws InterruptedException {
		try {
			throw new me();
		} catch (ArithmeticException | me e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//fully check and partially check // not wirte throw
		
	}
}

class me  extends Exception{
	public me() throws  ArithmeticException{
	System.out.println("s");	
	}
	public static void main(String[] args) throws Exception {
		me ob = new me();
	}
}

class b {
	public static void main(String[] args) {
		me ob = new me();
//		throw new Exception("shivam");
		throw new ArithmeticException("shivam");
	}
}



