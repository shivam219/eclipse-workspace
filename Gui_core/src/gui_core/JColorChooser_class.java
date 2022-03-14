package gui_core;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class JColorChooser_class {
	public static void main(String[] args) {
		new jcolor();
	}
}

class jcolor extends JFrame implements ActionListener {

	JButton b = new JButton("pick color");
	JLabel l = new JLabel();

	jcolor() {

		l.setBackground(new Color(20, 30, 80));
		l.setForeground(Color.white);
		l.setOpaque(true);
		l.setText("this is some testing");
		l.setFont(new Font("MV Boli", Font.PLAIN, 20));
		;
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout()); // use pack when working use flowlayout
		b.addActionListener(this);

		this.add(l);
		this.add(b);
		this.pack();// automatic align component
		this.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == b) {
			JColorChooser cl = new JColorChooser();
			Color c = cl.showDialog(null, "Pick a acolor", Color.red);// defualt selected color
			l.setBackground(c);
		}
	}
}
