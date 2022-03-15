package Test;

public class Double_class {

	public static void main(String[] args) {

		int no = 5, i = 0;
		System.out.println("Decimal NO : " + no);
		int[] binary = new int[100];
//				5-2
		while (no != 0) {
			binary[i] = no % 2;// get reminder 1
			no = no / 2;// get division 2
			i++;// check how many time condition iterate.
		}

		System.out.print("Binary :");
		for (int j=i-1; j>= 0;j--) {
			System.out.print(binary[j]+" ");
		}
	}

}
