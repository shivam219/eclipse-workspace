package JAVABASIC;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		int temp=0;
		
		for(int no=1;no<=100;no++) {
		
			for(int j=2;j<=no-1;j++) {
				
				if(no%j==0) {
					temp=temp+1;
				}
				
			}
			
			if(temp==0) {
				System.out.println("its not prime num");
			}
			else {
				System.out.println("its prime no");
				
			}
			//System.out.println(no);
		}
	}

}
