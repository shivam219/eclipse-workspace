package typecast;
//Widening Type Casting
//Implicit Type Casting.
public class TypeCast {

	public static void main(String[] args) {
		// create int type variable
		int num = 10;
		System.out.println("The integer value: " + num);

		// convert into double type
		double data = num;									/// double is higher data 
		System.out.println("The double value: " + data);    ///  Hence there is no loss in data.

	}
}
class Main {
	  public static void main(String[] args) {
	    // create double type variable
	    double num = 10.99;
	    System.out.println("The double value: " + num);

	    // convert into int type
	    int data = (int)num;							 //// double is lower data
	    System.out.println("The integer value: " + data);///Hence there is the loss of data
	  }
	}///Narrowing Type Casting
     ///Explicit Type Casting.
