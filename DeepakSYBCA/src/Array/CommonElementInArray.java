package Array;

import java.util.ArrayList;

public class CommonElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a1[] = { 2, 4, 8 };
		int a2[] = { 2, 3, 4, 8, 10, 16 };
		int a3[] = { 2, 8, 14, 40 };
		int x = 0, y = 0, z = 0;
		ArrayList<Integer> al = new ArrayList<Integer>();
		while (x < a1.length && y < a2.length && z < a3.length) {
			if (a1[x] == a2[y] && a2[y] == a3[z]) {

				al.add(a1[x]);
				x++;
				y++;
				z++;
			}

			else if (a1[x] < a2[y]) {
				x++;
			} else if (a2[y] < a3[z]) {
				y++;
			} else {
				z++;
			}

		}

		for (int no : al) {
			System.out.print(no+  " ");
		}
		 
		for(int i=1,j=1,k=3; i>2 || j>2 ||k >3;i++,j++,k-- ) {}
	}

}
