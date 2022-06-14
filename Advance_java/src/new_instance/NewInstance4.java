package new_instance;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class NewInstance4 {
	public static void ObjectCreatedMethod(String c) throws Exception {
		Object obj = Class.forName(c).newInstance();
		System.out.println("Object created for class is:" + obj.getClass().getName());
	}
	public static void main(String[] args) throws Exception{
//    	ObjectCreatedMethod("Student5"); 
		ObjectCreatedMethod("java.lang.String");
		ObjectCreatedMethod("java.lang.Object");

		Class<String> cc = (Class<String>) Class.forName("java.lang.String");
		String str =cc.newInstance();
		Annotation[] m = cc.getDeclaredAnnotations();
		int count =1;
		for(Annotation a: m) {
			count  = count +1;
			System.out.println(a);
		}
		str = "shiva";
		System.out.println(str);
	}
}
