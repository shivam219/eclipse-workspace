package tricks;


public class Cov_Int_bin {

	public static void main(String[] args) {
		
		int no=5, i = 0;
		System.out.println("Decimal :  "+no);
		
		int binary[] = new int[1000];

		while (no != 0) {
			binary[i] = no % 2; // 5 % 2==1
			no = no / 2; // 5 / 2==2
			i++;
		}
		System.out.print("Binary : ");
		for (int j = i - 1; j >= 0; j--) {
			System.out.print(binary[j] + " ");
		}
		// System.out.println(5%1);
		//
	}

}
