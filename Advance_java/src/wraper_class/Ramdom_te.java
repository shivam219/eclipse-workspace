package wraper_class;

public class Ramdom_te {
	
	public static void main(String[] args) throws Exception {
		System.out.println("ramdonm no : -");
		while(true)
		{
			double d = 5*Math.random();
			int i = (int)d;
			System.out.println(i);
			Thread.sleep(1000);
			if(i==0)
				System.exit(0);
			
		}
	}
}
