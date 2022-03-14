package convert;

public class String_to_Strin {

	public static void main(String[] args) {
		int  A=  100;
		int arr [] =  String.valueOf(A).chars().map(c->c-'0').toArray();
	}
}
