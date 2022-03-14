package Array;

public class Arraysort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {8,6,7,1,2,45,68,25,72};
for(int i=0;i<a.length;i++) {
	for(int j=i+1;j<a.length;j++) {
		if(a[i]>a[j]) {
			int temp=a[i];
			a[i]=a[j];
			a[j]=temp;
		}
	}
	System.out.print(a[i]+" ");
}
	}

}
