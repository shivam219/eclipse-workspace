package graph;
import java.util.LinkedList;
import java.util.Scanner;
//Arrays.fill(al, new LinkedList<Integer>());//fill all values in linkedList
public class MyGraph {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int v = 4;GP graph = new GP(v);System.out.println("Enter verteces and Edges" ); v = sc.nextInt();int e = sc.nextInt();
		for(int i = 1; i<=e; i++) {graph.addEdge(sc.nextInt(), sc.nextInt());}		
		System.out.println(graph);
	}
}
class GP{
	private LinkedList<Integer> al[];
	public GP(int v) {al = new LinkedList[v + 1];for (int i = 0; i < v + 1; i++) {al[i] = new LinkedList<Integer>();}}
	public void addEdge(int source, int destination) {al[source].add(destination);al[destination].add(source);}
	public String toString() {for(LinkedList<Integer> a : al) {System.out.println(a);}return "";}
	
}