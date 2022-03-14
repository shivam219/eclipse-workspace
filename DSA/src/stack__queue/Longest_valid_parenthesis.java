package stack__queue;
import java.util.Scanner;
import java.util.Stack;
public class Longest_valid_parenthesis {
	public static void main(String[] args) {
		String s = "(()";
		System.out.println(Longvalid(s.toCharArray()));
	}

	public static int Longvalid(char[] s) {
		int n = s.length;
		Scanner sc = new  Scanner(System.in);
		int count = 0;
		Stack<Character> st = new Stack<Character>();
		for(int i =0; i<n;i++){
			char ch = s[i];
			if(ch =='(') {
				st.push(s[i]);count++;
			}
			if(ch==')') {
				st.pop();count--;
			}
		}
		return (s.length-count);
	}
}
