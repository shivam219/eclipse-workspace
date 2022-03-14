package interview;

public class count_no {
	public static void main(String[] args) {

		int no = 123456;
		System.out.print( "totol no in  "+ no + " : " );
		int count = 0;
		while (no > 0) {
			no = no / 10;
			count++;
		}
		System.out.println( count);
		
	}
}
