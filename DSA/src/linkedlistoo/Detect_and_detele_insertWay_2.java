package linkedlistoo;

import java.util.*;
public class Detect_and_detele_insertWay_2 {
	static Node head; // head of list
	static class Node {
		int data;Node next;
		Node(int d) {
			data = d;
			next = null;}}
	static public void push(int data) {
		Node node = new Node(data);
		node.next = head;
		head = node;}
	static boolean detectLoop(Node h) {
		HashSet<Node> s = new HashSet<Node>();
		while (h != null) {
			if (s.contains(h))
				return true;
			s.add(h);
			h = h.next;
		}return false;}
	static boolean detectFirstElementLoop(Node h) {
		HashSet<Node> s = new HashSet<Node>();
		while (h != null) {
			if (s.contains(h)) {
				System.out.println(h.data);return true;
			}
			s.add(h);
			h = h.next;
		}return false;}
	static boolean deleteLoop(Node h) {
		HashSet<Node> s = new HashSet<Node>();
		while (h != null) {
			if (s.contains(h)) {
				h.next = null;}
			s.add(h);
			h = h.next;}
		return false;}
	public static void main(String[] args) {
		Detect_and_detele_insertWay_2 l = new Detect_and_detele_insertWay_2();
		l.push(20);
		l.push(4);
		l.push(15);
		l.push(10);
		l.head.next.next.next.next = l.head;

		if (detectLoop(head))
			System.out.println("Loop found");
		else
			System.out.println("No Loop");
		detectFirstElementLoop(head);

		
		if (deleteLoop(head))
			System.out.println("Loop Deleteed");
		else
			System.out.println("No Loop");
	}
}