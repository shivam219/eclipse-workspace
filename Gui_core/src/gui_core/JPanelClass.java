package gui_core;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class JPanelClass extends JFrame {
	public JPanelClass() {
		setBounds(100, 100, 500, 500);
		setDefaultCloseOperation(3);
		setVisible(true);
		setResizable(false);
		setLayout(null);
		setBackground(Color.gray);
		JPanel p1 = new JPanel();p1.setBounds(0, 0, 300,300);p1.setBackground(Color.green);add(p1);
		p1.setLayout(null);
		JPanel p2 = new JPanel();p2.setBounds(0, 0, 200, 100);p2.setBackground(Color.blue);add(p2);
		p2.setLayout(null);
		JButton b1 =new JButton("Click me");b1.setBounds(20, 20, 50, 50);
		b1.setBounds(50, 25	, 100, 50);p2.add(b1);p1.add(p2);		
		//choosen
	}

	public static void main(String[] args) {
new JPanelClass();
	}
}
