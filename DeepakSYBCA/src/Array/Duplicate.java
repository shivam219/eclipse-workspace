package Array;

public class Duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int []a=new int [] {8,6,7,4,6,8,5,9};
		
		for(int i=0;i<a.length;i++) {
			System.out.print(" "+a[i]);
		}
		System.out.println(" ");
		for(int i=0;i<a.length;i++) {
			
			for(int j=i+1;j<a.length;j++) {
				if((a[i]==a[j]) && (i!=j)) {
					System.out.print(a[j]+" ");
				}
			}
		}
		
		
		
	}

}
