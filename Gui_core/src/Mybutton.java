import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Mybutton {
	static JFrame f;
	static JButton b1, b2;

	public Mybutton() {
		f = new JFrame();
		f.setBounds(400, 300, 500, 500);
		f.setLayout(null);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		b1 = new JButton("Button 1");
		b1.setBounds(100, 100, 200, 150);
		f.add(b1);
//		b1.addActionListener(new myAction());
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
			}
		});
		
		b1.addActionListener(e->{
			
			
		});
		b2 = new JButton("Button 2");
		b2.setBounds(100, 300, 200, 150);
		f.add(b2);
	}

	public static void main(String[] args) {
		new Mybutton();
	}
}

class myAction implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == Mybutton.b1) {
			System.out.println("Button 1 clicked ");
		}
	}
}
