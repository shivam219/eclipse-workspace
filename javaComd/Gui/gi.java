import java.awt.*;
import javax.swing.*;
class gi{

	public gi(){
		JFrame f =new JFrame ("Shviam");
		TextArea t = new TextArea("hello this is text ");
		t.setBounds(30,10, 20, 150);
		f.add(t);
		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
	}
	public static void main(String []args){
		new gi();
	}
}

 