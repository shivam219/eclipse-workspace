package input;

import java.util.Scanner;

public class Statics {
	int emId;
	String name;
	String company;
	public Statics(int i, String string, String string2) {
		this.emId = i;
		this.name = string;
		this.company = string2;
	}
	public void show() {
		System.out.println("You Id :- " + emId);
		System.out.println("Your name" + name);
		System.out.println("your company" + company);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter id");
		int getId = sc.nextInt();
		System.out.println("Enter name");
		String getName = sc.next();
		System.out.println("Enter company name");
		String getCompy = sc.next();
		Statics ob = new Statics(getId, getName, getCompy);
		ob.show();
	}
}
