package graph;

public class Search_inmax {

	public static void main(String[] args) {
        int maze[][] = { { 1, 0, 0, 0 },
                         { 1, 1, 0, 1 },
                         { 1, 0, 0, 0 },
                         { 1, 1, 1, 1 } };
        int count = lenthWay(maze ,0, 0);
        System.out.println(" Max count" + count);
 	}
static int N =11;
	public  static int lenthWay(int[][] arr, int i, int j) { 
		if(i==N && j==N) {
			return 1 ;
		}
		
		if(arr[i][j+1] !=0) {
			return 1 + lenthWay(arr, i, j +1);
		}
			
		if(arr[i+1][j] !=0) {
			return 1 + lenthWay(arr, i+ 1, j);
		}
		
		
		return  1 - lenthWay(arr , i, j) ;
	}
}
