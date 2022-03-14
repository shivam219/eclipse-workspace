package exceptions;

class MyOwnExceptions extends Exception {
	public MyOwnExceptions(String msg) {
		super(msg);
	}
}

public class Cre_own_class {
	static void employess (int age)throws  MyOwnExceptions{
		if (age <0 )
			throw new MyOwnExceptions("Age can't be ");
		else 
			System.out.println("is valid");
	}
	public static void main(String[] args) {
		try {
			employess(-2);
			
		}
		catch ( MyOwnExceptions e) {
			e.printStackTrace();
		}
	}
}

//throw is cluse
//throws we dont not want to see  error is collected by gerbag collecto
// 