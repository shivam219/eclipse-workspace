package Fuction;

import java.util.function.Consumer;

class persion {
	private String name;
	public void setName(String name) {this.name=name;}
	public String getName() {return this.name;}
}

//--consumer - modifies data - no result
public class fucntion_consumer {
	public static void main(String[] args) {
		persion p  = new persion();
		Consumer<persion> setName = new Consumer<persion>() {
			public void accept(persion t) {
			
			}
		};
		Consumer<persion> p1 = t->t.setName("shivam");
		p1.accept(p);//call then p1 execute and pass shivam
		System.out.println(p.getName());
		
	}
}
