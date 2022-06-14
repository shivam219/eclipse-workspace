package file_hand;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class JavaNIO {
	public static void main(String[] args) throws IOException {
//		Files.list(Paths.get("C:\\Users\\Shivam\\Documents")).forEach(System.out::println);
		Path current = Paths.get("C:\\Users\\Shivam\\Documents");
//		Files.list(current).forEach(System.out::println);
//		Files.walk(current, 2).forEach(System.out::println);//give access denied
//		filtering files

//		Files.walk(Paths.get("."), 1).filter(e -> String.valueOf(e).contains(".java")).forEach(System.out::println);
		/* print using method refference */
		Files.walk(Paths.get(".")).filter(JavaNIO::isjava).forEach(System.out::println);
		BiPredicate<Path, BasicFileAttributes> attr = (p, u) -> {
			return String.valueOf(p).contains(".txt");
//			return u.isRegularFile();
		};
		/*not working properly*/
//		Files.find(Paths.get("."), 0, attr).forEach(System.out::println);
	
	}

	static public boolean isjava(Path p) {
		Predicate<? super Path> g = new Predicate<Path>() {
			@Override
			public boolean test(Path t) {
				return String.valueOf(t).contains(".txt");
			}
		};
		return g.test(p);
	}
}
class ReadingDataFromFIleNio{
	public static void main(String[] args) throws IOException {
		Path p = Paths.get("./note.txt");
		List<String> lines = Files.readAllLines(p);
		System.out.println(lines);
		lines.forEach(System.out::println);
		
		Files.lines(p).map(e->e.toLowerCase()).filter(e->e.contains("a")).forEach(System.out::println);
	}
}
class WriteDatafromFileNio{
	public static void main(String[] args) throws IOException {
		System.out.println("Writing data to file");
		Path p = Paths.get("./note.txt");
		List<String> li = List.of("cat", "dog","mili");
		Files.write(p,li);
		Files.lines(p).forEach(System.out::println);
	}
}


