package interview;

public class reverse_number {
	public static void main(String[] args) {

		int num = 152;
		int rev = 0;
		while(num!=0) {
			rev =rev*10 + num%10;
		num= num /10;
			
		}
		System.out.println(rev);
		
		
		StringBuffer ss = new StringBuffer(String.valueOf(rev));
		StringBuffer rev2=ss.reverse();
		
;
		
	}
}
