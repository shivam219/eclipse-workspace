package string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class Given_sequence_of_string_print_alll_angram_together {
	
	
	
	// Function to group anagrams from a given list of words
	public static void groupAnagrams(String[] words) {
		// sort each word on the list
		List<String> list = Arrays.stream(words).map(s -> s.toCharArray()).map(chars -> {
			Arrays.sort(chars);
			return new String(chars);
		}).collect(Collectors.toList());
		// construct a map where the key is each sorted word,
		// and value is a list of indices where it is present
		Map<String, List<Integer>> map = new HashMap<>();
		for (int i = 0; i < list.size(); i++) {
			map.putIfAbsent(list.get(i), new ArrayList<>());
			map.get(list.get(i)).add(i);
		}
		// traverse the map and read indices for each sorted key.
		// The anagrams are present in the actual list at those indices
		for (Entry<String, List<Integer>> entry : map.entrySet()) {
			System.out.println(entry.getValue().stream().map(index -> words[index]).collect(Collectors.toList()));
		}
	}
	public static void main(String[] args) {
		String[] words = { "CARS",  "DUES", "NOSE",  "ARCS", "GRAB", "USED", "ONES",
				"BRAG", "SUED"};

		groupAnagrams(words);
	}
}
