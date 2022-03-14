package gui_core;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Button_class extends JFrame implements ActionListener {
	JButton b;
	ImageIcon icon = new ImageIcon("left.png");
	JLabel l;

	Button_class() {

		ImageIcon icon2 = new ImageIcon("man.png");
		l = new JLabel();
		l.setIcon(icon2);
		l.setBounds(150, 250, 150, 250);
		l.setVisible(false);

		b = new JButton();
		b.setBounds(100, 100, 100, 50);
		b.addActionListener(this);// in this class , b.addACLi(f);
		b.setText("Press");
		b.setFocusable(false);
		b.setIcon(icon);
		b.setHorizontalTextPosition(b.RIGHT);
		b.setVerticalTextPosition(b.CENTER);
		b.setFont(new Font("Comic Sans", Font.BOLD, 25));
		b.setIconTextGap(-10);
		b.setBackground(Color.LIGHT_GRAY);
		b.setForeground(Color.LIGHT_GRAY);
		b.setBorder(BorderFactory.createEtchedBorder());
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);

		this.setSize(600, 600);
		this.setVisible(true);
		this.setLayout(null);
		this.add(b);
		this.add(l);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == b) {
//			System.out.println("Button Press !!!");
			b.setEnabled(false);
			l.setVisible(true);

		}
	}
	public static void main(String[] args) {
		new Button_class();
	}
}
