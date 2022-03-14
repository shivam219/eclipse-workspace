package stack__queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
//100% working
public class imp_st_use_Queue {
	public static void main(String[] args) {
		Queue<Integer>qu = new LinkedList<Integer>();
		qu.add(1);qu.add(2);qu.add(4);qu.add(5);
		System.out.println("Enter data ");
		Scanner sc = new Scanner(System.in);
		int x= sc.nextInt();
		qu.add(x);
		System.out.println("pop data ");
 
		qu.remove( x);
		qu.stream().forEach(e->System.out.println(e));
		
	}
}
