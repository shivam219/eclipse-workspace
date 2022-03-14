package sliding_window;

import java.util.HashMap;
import java.util.Map;

public class Pick_toyp2 {
	public static void main(String[] args) {

		String str[] = { "he", "he", "he", "he", "car", "car", "d", "d" };
//	0		 1		2	   3	 4	    5
		int j = 0, i = 0, max = 0, cur = 0, count = 0;
		String ch = "";
		int k = 2;
		Map<String, Integer> map = new HashMap<>();
		while (j < str.length) {
			ch = str[j];
			if (map.containsKey(ch)) { // j=4 c =3
				map.put(ch, map.get(ch) + 1);// addition of value 1
				count = map.size();
				if (count == k + 1) { // j=3 c =3
					map.remove(str[j]);
					j--;// 3
					cur = j - 1 + 1;
					if (max < cur)
						max = cur;
					i++;
				}
			} else {
				map.put(ch, 1);
				count = map.size();
				if (count == k + 1) { // j=3 c =3
					map.remove(str[j]);
					j--;// 3
					cur = j - 1 + 1;
					if (max < cur)
						max = cur;
					i++;
				}

			}
			j++;// j==4
		}
		System.out.println(max);

	}
}
