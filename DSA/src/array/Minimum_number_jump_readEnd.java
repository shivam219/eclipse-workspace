package array;

public class Minimum_number_jump_readEnd {

//	public int jump(int[] A) {
//		if (A.length <= 1)
//			return 0;
//		int maxReach = A[0];
//		int step = A[0];
//		int jump = 1;
//		for (int i = 1; i < A.length; i++) {
//			if (i == A.length - 1)
//				return jump;
//			if (i + A[i] > maxReach)
//				maxReach = i + A[i];
//			step--;
//			if (step == 0) {
//				jump++;
//				step = maxReach - i;
//			}
//		}
//		return jump;
//	}
	/// some bug is there but is easy to just take 10 min 
	public static void main(String[] args) {
		String point = "";
		int[] arr = { 6,2,1,2,1,1,2,1};
		int n = arr.length;
		int i = 0, count = 0, max = Integer.MAX_VALUE;
		int j = 0, k = 0, min = 0, curmax = 0, cur = 0;
		boolean flag = false;
		point +=  arr[0] ;
			while (i < n) {
				j = arr[i];
				if(j >= n) {point += " -> "+arr[n-1];count++; break; }
				else if (j > 1) {
					int m = i + j;// i = 3 k = 3 to 3+3 =6
					for (k = i; k <= m; k++) {
						if (arr[k] + k+1 >= n) { count++; count++; 
							point += " -> "+ arr[k];
							point +=  " -> " + arr[n - 1];
							flag = true;
							break; }
						cur = arr[k]+ k;
						min = n - cur;
						if (max > min){ // 259545 > 8{
							curmax = k;
							max = min;}
						if (k == i + j) {
							i = curmax;
							count++;
							point += " -> " + arr[curmax];
						}
					}
				} else {
					count++;
					point += " -> " + 1;
					i++;
				}
				if (flag)
					break;
			
		}
		System.out.println(count);
		System.out.println(point);
	}

//		-----------approch1 ---------
//		int[] arr = { 1, 5, 3, 6, 3, 2, 3, 2, 1, 6, 3 };
//		System.out.println("Totol value in array "+ arr.length);
//		int n = arr.length;
//		int count = 0; 
//		int cur = 0; boolean con = false,jump = false ;
//		int  b1  = 0, b2 = 0, last = 0;
//		
//		for (int i = 0; i < arr.length; i++) { jump = false;
//			cur = arr[i];//0 cur- 0
//			last  = 0;
////					 		0  1  2  3  4   5  6  7  8  9  10
////	         				1, 5, 6, 7, 3 , 9, 3, 2, 1, 6, 3
//			if (cur > 1) {//2 			5+1 = 6 in 
//				for (int c = i+1; c <= cur +1; c++) { 
//							//1 - 5	  2 - 6 //
//					while (arr[c-1] < arr[c]) { 
//						b1 = arr[c-1];b2 = arr[c]; 
//						
//						last = arr[c];	//2
//						if((arr[i + last])>=n) {
//							System.out.println("Reach to end"); con = true;  break;
//						}
//					}
//					if (last == 0) {
//						i = arr[cur + i-1];
//					}  if(last> 0){
//						i = arr[last+i-1];
//					}
//					
//
//				}
//			}
//			if(con) {count ++ ;break;}
//			if(jump) {count ++ ;break;}
//
//			count++;
//		}
//		
//		System.out.println("minimum jump "+count);
//	}
//----------------------- approach 1----------------
}
