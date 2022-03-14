0.package com.shviam;
public class ko{
	public static void main(String[] args)  {
		System.out.println(args);
		A ob = new A();
		System.out.println(ob);
	}
	public String toString(){
		System.out.println("shiva");
		return "";
	}
}
class A{
	public A(){
		System.out.println("A called from Ko");
	}
}
	
	class B{
	
	}