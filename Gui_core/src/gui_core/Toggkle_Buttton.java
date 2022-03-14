package gui_core;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JToggleButton;

public class Toggkle_Buttton extends JFrame {
	private Color cc;
	public Toggkle_Buttton() {
		setBounds(100, 100, 400, 500);
		setDefaultCloseOperation(3);
		setVisible(true);
		cc = this.getBackground();
		setLayout(new FlowLayout());
		JToggleButton tb = new JToggleButton("Off");
		tb.setBounds(100, 100, 70, 30);
		add(tb);
		Container c = this.getContentPane();
		
		tb.addActionListener((e)->{
			tb.setText("ON");
			System.out.println("Enable");
			if(tb.isSelected()) {
				c.setBackground(Color.red);
//				tb.setBackground(Color.red);
			}
			else {
				tb.setText("OFF");
				System.out.println("Disable");
				c.setBackground(cc);
			}
		});
		
		
	}
	 public static void main(String[] args) {
		 new Toggkle_Buttton();
		 int $ = 0;
		 System.out.println($);
	}
}
