package linkedlistoo;

import java.util.HashMap;

class Nodch {
	Nodch next;
	char data;
	Nodch(char data){
		this.data = data;
	}
}
public class find_first_non_repeating_character {
	
	public static void add(char data) {
		Nodch node=  new Nodch(data);
		node.next=head;
		head = node;
	}
	static Nodch head =null;
	public static void main(String[] args) {
		add('a');add('a');add('b');add('c');add('d');add('e');add('j');add('f');	
		char ch = f_no(head);
		System.out.println(ch);
		System.out.println(ch);
	}
	public static char f_no(Nodch head2) {
		Nodch  root = head2,r = null;
		int arr[] = new int[26];int i = 0;
		HashMap<Character , Integer> hs = new HashMap(); 
		while(root!=null) {
			if(hs.containsKey(root.data)){
				hs.put(root.data, hs.get(root.data)+1);
			}
			else {
				hs.put(root.data, 1);
			}
			arr[i] = root.data;
			i++;
			root=root.next;
		}
		root= head2;
		for(int j = 0; j<i;i++) {
			if(hs.containsKey(root.data) && hs.get(root.data)==1) {
				
				return root.data;
			}
			
		}
		return 's';}
}
















