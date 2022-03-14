package interview;

public class Sum_Number_In_Array {

	public static void main(String[] args) {
		
//		int a [] = {1,2,3,4,5,6,7,7,8};
//		int sum = 0 ;
//	
//		for(int i = 0; i<a.length-1 ;i++) {
//			sum = sum + a[i];
//		}
//		System.out.println(sum);
		
		int a [] = {1,2,3,4,5,6,7,7,8};
		int sum = 0 ;
		
		for(int i :a) {
			sum  = sum +i;
			System.out.print(i + " :- ");
			System.out.println(i%2==0?"Even" :"Odd");
		}
		System.out.println("sum "+sum);
	}
}
