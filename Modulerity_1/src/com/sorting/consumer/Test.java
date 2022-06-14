package com.sorting.consumer;

import java.util.List;
import java.util.logging.Logger;

import com.sorting.util.MySortingUtility;

public class Test {
	private static Logger logger = Logger.getAnonymousLogger(MySortingUtility.class.getName());

	/*
	 * program in not complete create module.info.java export com.sorting.alorithm;
	 * require com.sorting.alorithm; in different files learn transitive keyword
	 */
	public static void main(String[] args) {
		MySortingUtility util = new MySortingUtility();
		List<String> sorted = util.sort(List.of("rama", "krishna", "radhe", "rama"));
		logger.info(sorted.toString());
		
	}
}
