package Array;

public class Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] a=new int[] {5,6,8,18,98,36,87,45};
		int temp;
		System.out.println(" Befor sorted ");
		for(int i=0;i<a.length;i++) {
			System.out.print(" "+a[i]);
		}
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]<a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			
		}
		System.out.println(" ");
		System.out.println(" after sorted array  :");
		for(int i=0;i<a.length;i++) {
			
			System.out.print( " "+a[i]);
		}
		System.out.println(" \n second largest element is :"+a[1]);
	}

}
