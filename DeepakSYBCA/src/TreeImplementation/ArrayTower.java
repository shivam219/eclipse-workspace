package TreeImplementation;
import java.util.*;
import java.util.Arrays;

public class ArrayTower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		Integer a[]= {22,11,9,7,16};
		int k=3;
		int l=2;
		kthSmallest(a,k);
		kthLargest(a,l);
		
	}
	
	
	public static void kthSmallest(Integer a[],int k) {
		//Arrays.sort(a);
		for(int i=0;i<a.length;i++) {
			int temp=a[i];
			for(int j=i+1;j<a.length;j++) {
				if(a[i]<a[j]) {
					 temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println(a[k-1]);
	}
	public static void kthLargest(Integer a[],int l) {
		//Arrays.sort(a);
		for(int i=0;i<a.length;i++) {
			int temp=a[i];
			for(int j=i+1;j<a.length;j++) {
				if(a[i]<a[j]) {
					 temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for(int i=0;i<a.length/2;i++) {
			int temp=a[i];
			temp=a[a.length-1-i];
			a[a.length-1-i]=temp;
			
		}
		System.out.println(a[l-1]);
	}
}
