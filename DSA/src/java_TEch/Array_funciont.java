package java_TEch;

public class Array_funciont {
	public static void main(String[] args) {
//		int arr[][] = new  int[4][4];
//		try {
//			arr[0][1]=10;			
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		System.out.println(arr[0][1]);
		
		int arr[][] =new int[3][];
		arr[0] = new int[1];
		arr[1] = new int[2];
		arr[2] = new int[3];		
		for(int i = 0; i<3; ++i) 
			for(int j =0; j<i+1; ++j) {
				arr[i][j] = j+1;
		}
		int sum =0 ;
		for(int i = 0; i<3; ++i) 
			for(int j =0; j<i+1; ++j) {
			 sum+=	arr[i][j];
		}
		System.out.println(sum);
		System.out.println(arr[0].length);
		
}
}
