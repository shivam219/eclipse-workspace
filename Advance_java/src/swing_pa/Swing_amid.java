package swing_pa;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Swing_amid {

	public static void main(String[] args) {

		JFrame f = new JFrame("This is framework");
		JButton b = new JButton("click");
		JTextField tf = new JTextField();
		f.setSize(new Dimension(500, 400));
		f.setVisible(true);
		f.setLayout(null);
//		        	 X    Y   W    H
		f.add(tf);
		tf.setBounds(50, 50, 150, 30);
		b.setBounds(50, 100, 100, 40);
		f.add(b);
		b.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				tf.setText("Welcome to swing");

			}
		});
	}
}
