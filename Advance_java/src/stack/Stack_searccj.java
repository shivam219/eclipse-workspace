package stack;

import java.util.Stack;

public class Stack_searccj {
	public static void main(String[] args) {
		Stack <String> ss=new Stack<>();
		ss.push("moth");
		ss.push("bee");
		ss.push("butterfly");
		ss.push("spider");
		ss.push("labybird");
		int check= ss.search("labybird");
		System.out.println(check);
		
		
		
	}
}
