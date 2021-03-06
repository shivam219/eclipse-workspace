package graph;

import java.util.*;

public class Graph {
//	private LinkedList<Integer> ad[] = new LinkedList[5];
	private LinkedList<Integer> ad[];

	public Graph(int v) {
		ad = new LinkedList[v + 1];
		for (int i = 1; i <= v ; i++) {
			ad[i] = new LinkedList<Integer>();
		}
	}

	public void addEdge(int source, int destination) {
		ad[source].add(destination);
		ad[destination].add(source);
	}

	public int bfs(int src, int dest) {// breath first search for check if available the
		boolean vis[] = new boolean[ad.length];
		int parent[] = new int[ad.length];
		Queue<Integer> q = new LinkedList<>();
		q.add(src);
		parent[src] = -1;
		vis[src] = true;
		while (!q.isEmpty()) {
			int cur = q.peek();
			if (cur == dest) {
				break;
			}
			q.poll();
			for (int neb : ad[cur]) {
				if (!vis[neb]) {
					vis[neb] = true;
					q.add(neb);
					parent[neb] = cur;
				}
			}
		}
		int dis = 0;
		if (q.isEmpty()) {
			System.out.println(" no elemet like this");
			return 0;
		} else {
			int cur = dest;
//			System.out.print(cur + " \n");
			while (parent[cur] != -1) {
				System.out.print(cur + " -> ");
				cur = parent[cur];
				dis++;
			}
		}
//		System.out.print(cur + " \n");
		return dis;
	}

	public boolean dfsUtil(int source, int dest, boolean vis[]) {// check if path is available using recursion
		if (source == dest)
			return true;
		for (int neb : ad[source]) {
			if (!vis[neb]) {
				vis[neb] = true;
				boolean isConnected = dfsUtil(neb, dest, vis);
				if (isConnected)
					return true;
			}
		}
		return false;
	}

	public boolean dfs(int source, int destination) {
		boolean vis[] = new boolean[ad.length];
		vis[source] = true;
		return dfsUtil(source, destination, vis);
	}

	public boolean dfsStack(int src, int dest) {// check if path is available
		boolean vis[] = new boolean[ad.length];
		vis[src] = true;
		Stack<Integer> stack = new Stack<>();
		stack.push(src);
		while (!stack.isEmpty()) {
			int cur = stack.pop();
			if (cur == dest)
				return true;
			for (int nei : ad[cur]) {
				if (!vis[nei]) {
					vis[nei] = true;
					stack.push(nei);
				}
			}
		}
		return false;
	}

	public int dfsStackDis(int source, int destination) {// check path is available then return pat
		boolean vis[] = new boolean[ad.length];
		vis[source] = true;
		Stack<Integer> st = new Stack<>();
		int par[] = new int[ad.length];
		par[source] = -1;
		st.push(source);
		while (!st.isEmpty()) {
			int cur = st.peek();
			if (cur == destination) {
				break;
			}
			st.pop();
			for (int neb : ad[cur]) {
				if (!vis[neb]) {
					vis[neb] = true;
					st.push(neb);
					par[neb] = cur;
				}
			}
		}
		int dis = 0;
		if (st.isEmpty()) {
			System.out.println("Element is not present");
		} else {
			int cur = destination;
			System.out.print(cur);
			while (par[cur] != -1) {
				System.out.print(" -> " + par[cur]);
				cur = par[cur];
				dis++;
			}
		}
		System.out.println("length is ");
		return dis;
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of vertices and edges");
		int v = sc.nextInt();
		int e = sc.nextInt();

		Graph graph = new Graph(v);
		System.out.println("Enter " + e + " edges");
		for (int i = 0; i < e; i++) {
			int source = sc.nextInt();

			int destination = sc.nextInt();

			graph.addEdge(source, destination);
		}

		System.out.println("Enter source and destination");

		int source = sc.nextInt();
		int destination = sc.nextInt();

		System.out.println(graph.dfsStackDis(source, destination));
		int distance = graph.bfs(source, destination);
//		System.out.println("min distance is " + distance);

//		System.out.println("possible " + graph.dfsStack(source, destination));
		// System.out.println("possible " + graph.dfs(source, destination) + " " +
		// source);

		sc.close();
	}
}