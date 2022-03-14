package CloseWindow_apn;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JWindow;

public class Windows_Class {
	JFrame f1;

	public Windows_Class() {
		f1 = new JFrame();
		f1.setBounds(70, 70, 500, 500);
		f1.setTitle("calling");
		f1.setVisible(true);
		f1.setLayout(new FlowLayout());
		f1.setDefaultCloseOperation(3);

		JPanel p = new JPanel();
		JButton b = new JButton("Click");
		p.add(p);
		f1.add(p);
		b.addActionListener(e->{
			JWindow w  = new JWindow();
			w.setSize(500,200);
			w.setLocationRelativeTo(null);
			w.setVisible(true);
			
			
		});

	}

	public static void main(String[] args) {
		new Windows_Class();
	}
}
