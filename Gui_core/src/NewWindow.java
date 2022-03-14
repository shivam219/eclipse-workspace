import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class NewWindow {
	
	JFrame f = new JFrame();
	JLabel l = new JLabel();
	
	
	NewWindow(){
		
		l.setBounds(0,0,100,50);
		
		
		l.setFont(new Font(null , Font.PLAIN,25));
		f.add(l);
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
		f.setSize(400,400);
		f.setVisible(true);
	}
	
}
