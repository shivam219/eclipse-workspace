package exce;
//checked -- before complile time 
// except runtime and eroro
//uncheck -- at run time 
public class Check_unCheck {
	public static void main(String[] args) {
		m1();
		try {
			m2();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void m2() throws Exception{
		throw new ArithmeticException("s");		
	}

	public static void m1() {
		try {			
			Thread.sleep(1000);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}

class marry {
	public static void main(String[] args) throws InterruptedException {
		throw new InterruptedException();//
	}
}
