package gui_core;

import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Jfra {
	public Jfra() {
		JFrame f = new JFrame();
		f.setVisible(true);
		f.setLayout(null);
		f.setBounds(100, 100, 500, 400);
		f.setDefaultCloseOperation(3);
		JLabel label = new JLabel("hii");
		label.setBounds(50, 150, 100, 50);
		label.setText("change text");

		Font font = new Font("Arial", Font.PLAIN, 30);
		label.setFont(font);

	}

	public static void main(String[] args) {
		new Jfra();
	}
}

class jLab {
	public jLab() {
		JFrame f = new JFrame();
		f.setVisible(true);
		f.setLayout(null);
		f.setBounds(100, 100, 500, 400);
		f.setDefaultCloseOperation(3);
		ImageIcon icon = new ImageIcon("chat.png");
		JLabel jl = new JLabel();
		jl.setBounds(50,30,200,100);
		jl.setIcon(icon);
		
	}
	public static void main(String[] args) {
		new jLab();
	}
}
