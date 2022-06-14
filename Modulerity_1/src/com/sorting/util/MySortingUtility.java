package com.sorting.util;

import java.util.List;

import com.sorting.alorithm.BubbleSort;

public class MySortingUtility {
	public List<String> sort(List<String> name) {
		BubbleSort ob = new BubbleSort();
		System.out.println(name);

		return ob.sort(name);

	}
}
