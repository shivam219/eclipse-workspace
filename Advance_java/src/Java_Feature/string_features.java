package Java_Feature;

public class string_features {
	public static void main(String[] args) {
		System.out.println("   ".isBlank());
		System.out.println(" LR ".strip().replace(" ", "@"));// remove from both end
		System.out.println(" LR ".stripLeading().replace(" ", "@"));// remove from first
		System.out.println(" LR ss ".stripTrailing().replace(" ", "@"));// remove from end
		System.out.println(" LR   shviam".stripIndent().replace(" ", "#"));// same to strip()
		"Apple\nMango\nbanana\norange".lines().forEach(System.out::println);// lines() return stream of String
		System.out.println("UPPER".transform((e1) -> e1.substring(2)));
		System.out.println("My name is %s\n my id is%d ".formatted("Rama", 100));
		/*
		 * // java 15 text block preview in 13 ,14 String text =
		 * """ line 1 line 2 line 3""";
		 * Not working
		 */
	}
}
