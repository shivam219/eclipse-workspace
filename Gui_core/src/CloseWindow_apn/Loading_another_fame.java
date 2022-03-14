package CloseWindow_apn;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Loading_another_fame {
	JFrame f1 ;
	public Loading_another_fame() {

		f1 = new JFrame();
		f1.setBounds(70, 70, 500, 500);
		f1.setTitle("calling");
		f1.setVisible(true);
		f1.setLayout(new FlowLayout());
		f1.setDefaultCloseOperation(3);
		JLabel l = new JLabel("Hi is ove java");
		l.setHorizontalAlignment(SwingConstants.CENTER);
	
	}
	public static void main(String[] args) {
		new Loading_another_fame();
	}
}