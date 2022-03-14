package string;

public class Count_And_Say_2 {
	static String countAntSay(int A) {
		if (A == 1)
			return "1";
		if (A == 2)
			return "11";
		String s = "1211";
		String temp = "";
		int count = 1;
		for (int i = 4; i <= A; i++) {
			char[] arr = s.toCharArray();
			temp = "";
			for (int j = 0; j < arr.length; j++) {
				
				if(j == arr.length-1) {
					temp += ""+count+""+arr[j];
					break;
				}
				else if (arr[j] == arr[j + 1]) {
//					count++; 
//					temp += "" + count + "" + arr[j];
//					count = 1;  j = j+1;
					while(arr[j]==arr[j+1]) {
					count++; 
					temp += "" + count + "" + arr[j];
					count = 1;  j = j+1; break;}
				}
				else if(arr[j]!= arr[j+1]) {
					temp+= ""+count+""+arr[j];
				}
			}
			s= temp;

		}

		return s;
	}

	public static void main(String[] args) {
		String no = countAntSay(6);
		System.out.println(no);


	}
}
