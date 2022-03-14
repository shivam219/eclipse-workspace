package convert;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Covert_Integer_arrayTO_List {
	public static void main(String[] args) {
		int ar[] = {-1,-2,-2,-4,-5,-6,-9,-9,-10};
		List<Integer> a = Arrays.stream(ar).boxed().collect(Collectors.toList());

	}
}
