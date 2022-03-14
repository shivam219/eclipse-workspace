package gui_core;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class Radio_button {
	public static void main(String[] args) {
		new myframe3();
	}
}

// make single selection we need put all into button group
class myframe3 extends JFrame implements ActionListener {
	JRadioButton rb1 = new JRadioButton("Samosa");
	JRadioButton rb2 = new JRadioButton("Puri and Red curry");
	JRadioButton rb3 = new JRadioButton("Italy");

	ButtonGroup bg = new ButtonGroup();
	
	ImageIcon icon1 = new ImageIcon("chili1.png");
	ImageIcon icon2 = new ImageIcon("chili2.png");
	ImageIcon icon3 = new ImageIcon("chili3.png");

	myframe3() {
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());

		// adding action listener
		rb1.addActionListener(this);
		rb2.addActionListener(this);
		rb3.addActionListener(this);
		
		/* adding button to group*/
		bg.add(rb1);
		bg.add(rb2);
		bg.add(rb3);
		
		// adidng icon to radio button
		rb1.setIcon(icon1);
		rb2.setIcon(icon2);
		rb3.setIcon(icon3);
	
		this.add(rb1);
		this.add(rb2);
		this.add(rb3);
		this.pack();
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == rb1) {
			System.out.println("Select samosa");
		}
		
		if (e.getSource() == rb2) {
			System.out.println("Select purry");
		}
		
		if (e.getSource() == rb3) {
			System.out.println("Select italy");
		}
		
		
		

	}
}