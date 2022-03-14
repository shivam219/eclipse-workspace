package modifier_use;

import java.util.Scanner;

class Parent {
	int salary =1000;
	void m1() {
		System.out.println("I m1");
	}
	public Parent() {
		 System.out.println("Ins paernt supper");
	 }
}

//super can be used to refer immediate parent class instance variable.
//super can be used to invoke immediate parent class method.
//super() can be used to invoke immediate parent class constructor.
public class super_s extends Parent{
	
	int s = 0;
	public super_s() {
		super();//call super or this but remember write in top
		this.s= super.salary;
		super.m1();//call parenet method
		System.out.println();
	}
	
}