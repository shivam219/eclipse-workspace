package Array;

public class MaxMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int []a=new int[] {5,2,6,8,4,6,18,20};
		int max=a[0];
		int j=0;
		for(int i=1;i<a.length;i++) {
			
			System.out.print("  "+a[i]);
			if(a[i]>max) {
				max=a[i];
				j=i;
			}
		}
		System.out.println(" \n maximun array :"+max  +" index number " +j);
		
		
		int min=a[0];
		
		for(int i=1;i<a.length;i++) {
			if(a[i]<min) {
				min=a[i];
				j=i;
				
			}
		}
		
		
		System.out.println(" \nminimum of array :"+min +" index number " +j);
		

	}

}
