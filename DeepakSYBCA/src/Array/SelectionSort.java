package Array;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {38,58,18,65,4,42,84};
		int min,temp=0;
		for(int i=0;i<a.length;i++) {
			min=i;
			for(int j=i+1;j<a.length;j++) {
				if(a[j]<a[min]) {
					min=j;
				}
			}
			temp=a[i];
			a[i]=a[min];
			a[min]=temp;
			System.out.print(a[i]+" ");
			
		}
	
	}

}
