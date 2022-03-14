package graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Check_direct_graph {
//int arr[] = new int[4];
//Arrays.fill(arr, 30);
//System.out.println(arr);
//IntStream s = Arrays.stream(arr);	
//s.forEach(e->System.out.println(e));
// use  arr int of int

//	int arr[][] = new int[4][4];
//	for(int [] a : arr) {
//		for(int l : a) {
//			like this assignement is done
//		}
//	}
//		 ArrayList<ArrayList<Integer>> ar = new ArrayList<ArrayList<Integer>>();
//		 ArrayList<Integer> a1 = new ArrayList<Integer>(); a1.add(10);a1.add(20);
//		 ArrayList<Integer> a2 = new ArrayList<Integer>(); a2.add(30);a2.add(40);
//		 ar.add(a1);
//		 ar.add(a2);
//	System.out.println(ar.get(0));
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Check_direct_graph ob = new Check_direct_graph();
		System.out.println("Eneter vartest and edges");
		int v = sc.nextInt(), e = sc.nextInt();
		grap g = ob.create(v);
		System.out.println("Enter  scr adn des");
		for (int i = 1; i <= e; i++) {
			int src = sc.nextInt(), des = sc.nextInt();
			ob.addEdge(src, des, g);
		}
		for(LinkedList<Integer> l : g.ad) {
			System.out.println(l);
		}
		System.out.println(ob.dfsUtil(g)?"Cycle Exits" :" Cycle no exit");
	}
	
	public boolean dfsUtil(grap g) {
		boolean vis[] = new boolean [g.ad.length];
		for(int i  =0 ; i<vis.length; i++) {
			if(dsf(i, i, '#' ,g, new boolean[vis.length])) {
				vis[i] = true;
			}
			else {return false;}			
		}
	return true;}
	private boolean dsf(int src,int dest, char c, grap g, boolean vis[]) {
		if(c!='#'& src == dest )
		return true;
		for(int cur : g.ad[src]) {
			if(!vis[cur]) {
				vis[cur]= true;
				if(dsf(cur, dest, 'a', g, vis)) {
					return true;
				}
			}
		}
		return false;
	}

	public grap create(int v) {
		return new grap(v);
	}
	public void addEdge(int src, int dest, grap g) {
		g.ad[src].add(dest);
	}
}
class grap {
	LinkedList<Integer> ad[];
	public grap(int v) {
		ad = new LinkedList[v + 1];
		for (int i = 0; i < ad.length; i++) {
			ad[i] = new LinkedList<Integer>();
		}
	}
}
