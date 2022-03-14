package searching;

public class Majority {

	static int majo(int arr[]) {
		int index = 0, count = 1; 
		for(int i =0; i<arr.length;i++) {
			if(arr[i]== arr[index])
				count++;
			else 
				count --;
			if(count == 0) {
				index = i;
				count = 1;
			}
				return index;
		}
		return -1;
	}
	public static void main(String[] args) {
		//majority element
		int ar[] = new int[] {1,2,3,1,1};
		int  j =0, count = 0;
		int m = majo(ar);
		if(m==-1) {
			System.out.println("no majority element");
			
		}
		else {
			System.out.println("majority element is :" + ar[m]);
			while(j<ar.length) {
				if(ar[j]== ar[m])
					count++;
				j++;
			}
			System.out.println("count = "+ count);
			
		}
			

	}

}
