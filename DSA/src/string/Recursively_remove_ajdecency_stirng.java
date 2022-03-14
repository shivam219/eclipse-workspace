package string;

//static String remove_ajancent(char[] arr) {
//	int i = 0;
//	String res = "";
//	int n = arr.length -1;
//	while (i < n) {
//		if (arr[i] != arr[i + 1]) {
//			res += arr[i];
//			i++;
//		} else {
//			while (arr[i + 1] == arr[i]) {
//				i++;
//				if(i==n)break;
//			}
//			i++;
//		}
//		
//	}
//	return res;
//}
public class Recursively_remove_ajdecency_stirng {
	static String re = "";

	static String remove_ajancent(char[] arr, int i, int n) {

		if (i >= n)
			return re;
		else if (arr[i] != arr[i + 1]) {
			re += arr[i];
			i++;
		} else {
			while (arr[i] == arr[i + 1]) {
				i++;
				if (i == n)
					break;
			}
			i++;
		}

		return remove_ajancent(arr, i, n);
	}

	public static void main(String[] args) {
		String str = "acaabb";
		char[] arr = str.toCharArray();
		String carr = remove_ajancent(arr, 0, arr.length-1);
		System.out.println(carr);
	}

}
