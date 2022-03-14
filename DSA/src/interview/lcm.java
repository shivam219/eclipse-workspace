package interview;

public class lcm {
//least common multiplication 
	public static void main(String[] args) {
		System.out.println(findLCM(12, 15));
		System.out.println(lcm(12, 15));
		System.out.println(findHCF(12, 15));
	}

	public static long findLCM(int n1, int n2) {
	     long min = 0;
	     int small = (n1<n2) ? n1 : n2;
	     int larg = (n1>n2) ? n1 : n2;
	     min = small;
	     while(true) {
	        if(min % larg == 0)
	            return min;
	        min = min + small ;
	     }
	}
	public static long findHCF(int n1, int n2) {
		int hcf = 0 ; int i = 1;
		while(i<=n1 && i<=n2) {
			if(n1%i==0 && n2%i ==0) {
				hcf=i;
			}
			i++;
		}
		return hcf;
	}
	
//	lcm
	public static int lcm(int n1 ,int n2) {
		int small = 0;
		int min = n1<n2?n1:n2;
		int max = n1>n2?n1:n2;
		small = min;
		while(true) {
			if(small%max==0) {
				return small;
			}
			small  = small + min;
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
