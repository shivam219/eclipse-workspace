package new_instance;

import java.lang.reflect.Method;

public class forname {
	public static void main(String[] args) throws Exception {
		@SuppressWarnings("unchecked")
		Class<String> c = (Class<String>) Class.forName("java.lang.String");
		Method[] m = c.getDeclaredMethods();
		int count = 0;
		for (Method m1 : m) {
			++count;
			System.out.println(m1.getName());

		}
		System.out.println(count);
		String s1 = "shiva";
		Class c2 = s1.getClass();
		
	}
}
