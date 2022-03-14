package stack;

import java.util.*;

public class Stack_inter {
	public static void main(String[] args) {
			Stack <Integer> stk =new Stack<>();
//			boolean result=stk.empty()	;
//			System.out.println("Stack is empty"+result);
//			stk.push(20);
			stk.push(30);
			stk.push(40);
			stk.push(50);
//			System.out.println(stk);
//			System.out.println(stk.pop());
			int position = stk.search(30);
	        System.out.println("Position of Horse: " + position); 
	        System.out.println(stk.get(position));
			
			
			
			
	}
}
