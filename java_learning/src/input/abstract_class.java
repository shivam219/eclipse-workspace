package input;

import java.util.Scanner;

abstract class human {
	public abstract void eat();

	public abstract String eat(String  s)	;

	public void runn() {

	}

}

class man extends human {
//	public man(int i) {
//	}
//	@Override
	public void eat() {

		System.out.println("hii their namaset");
	}

	public String eat(String  s) {
		
		System.out.println("This funtionalaity In name");
		Scanner sc = new  Scanner(s);
		s = sc.next();
				return s;
		
	}
}


public class abstract_class {
	public static void main(String[] args) {
		human ob = new man();
		String a=ob.eat("shivam");
		System.out.println(a);
		
	}
}
