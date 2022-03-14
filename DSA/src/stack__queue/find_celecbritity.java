package stack__queue;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class find_celecbritity {
	public static void main(String[] args)throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int [][] arr = new int[4][4];
		for(int j =0; j<n;j++) {
			String line = br.readLine();
			for(int k =0; k<n;k++) {
				arr[j][k]= line.charAt(k)-'0';
				
			}
		}
		findCelebrity(arr);
	}

	public  static void findCelebrity(int[][] arr) {
		Stack<Integer> st = new Stack<Integer>();
		for(int i = 0; i<arr.length;i++) {
		st.push(i);	
		}
		while(st.size()>=2) {
			int i = st.pop();
			int j = st.pop();
			if(arr[i][j]==1){
				//if i know j  -> i is not celebrity
				//if j know  i-> j is not celebrity
				st.push(j);
			}
			else {
				st.push(i);
			}
		}
		int pot = st.pop();
		for(int i =0; i<arr.length;i++) {
			if(i!=pot) {
				if(arr[i][pot]==0 ||arr[pot][i] ==1) {
					System.out.println("none");
					return ;
				}
			}
		}
		 System.out.println(pot);
	}
}
