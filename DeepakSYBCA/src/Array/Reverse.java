package Array;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a=new int[] {4,5,6,9,10,8};
		System.out.println("before revers");
		for(int i=0;i<a.length;i++) {
			System.out.print(" "+a[i]);
		}
		int n=a.length;
		int temp;
		for(int i=0;i<n/2;i++) {
			temp=a[i];
			a[i]=a[n-1-i];
			a[n-1-i]=temp;
		}
		
		System.out.println("\n Array after Reverse \n");
		for(int i=0;i<n;i++) {
			System.out.print(" "+a[i]);
		}
		
		
	}

}
