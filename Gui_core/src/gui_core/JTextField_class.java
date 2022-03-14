package gui_core;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class JTextField_class {

	// JTextField
	public static void main(String[] args) {
		new myframe();
	}
}

class myframe extends JFrame implements ActionListener {
	JTextField tf = new JTextField();
	JButton b = new JButton("Sumbit");
	
	
	myframe() {
		b.setFocusable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		b.addActionListener(this);// passing in this frame
		tf.setPreferredSize(new Dimension(250,40));
		tf.setFont(new Font("Consolas",Font.PLAIN,20) );
		tf.setForeground(Color.GREEN);
		tf.setBackground(Color.black);
		tf.setCaretColor(Color.white);
		
		
		this.add(b);
		this.add(tf);
		this.pack();// by default alignment
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() ==b) {
			System.out.println("Welcome"+ tf.getText());
//			JOptionPane.showMessageDialog(null, tf.getText());
			JOptionPane.showConfirmDialog(null, tf.getText());
			tf.setText("");
			tf.getCursor();
//			tf.setEditable(false);
//			b.setEnabled(false);
			
		}
	}

}
