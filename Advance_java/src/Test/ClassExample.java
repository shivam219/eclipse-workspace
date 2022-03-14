package Test;

class Person {
	
	String name;
	
	int age;
	
	public Person(String name, int age){
		
		this.name = name;
		this.age = age;
//		 it is constructor  we are initializing 
	}
}
 
 
public class ClassExample {
//	 it constructor of class has same name as main classs
	public ClassExample() {
		
		System.out.println("Class Demo Example");
	}
	
	public static void main (String[] args) {
		
		Person p1 = new Person("Peter", 40);
		Person p2 = new Person("John", 25);
		
		//getClass()
		compareClassObjects(p1,p2);
		
		//getName()
		printClassName(p1);
		
		//forName() and newInstance()
                Class c;
		try {
			c = Class.forName("com.sneppets.javalang.ClassExample");
			ClassExample ce = (ClassExample) c.newInstance();
		} catch (ClassNotFoundException | InstantiationException | 
				IllegalAccessException e) {
			e.printStackTrace();
		}       
        
	}
 
 
	private static void compareClassObjects(Object obj1, Object obj2) {
		
		if(obj1.getClass() == obj2.getClass()) {
			System.out.println("obj1 and obj2 are instances of the same class");
		} else {
			System.out.println("obj1 and obj2 are instances of different classes");
		}
 		
	}
 
	
	private static void printClassName(Object obj) {
		System.out.println("The class of " + obj +
                " is " + obj.getClass().getName());
		
	}
 
}

