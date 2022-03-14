package gui_core;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class KeyListener_Rocket {
	public static void main(String[] args) {
		new rocket();
	}
}

class rocket extends JFrame implements KeyListener {
	JLabel l = new JLabel();
	ImageIcon icon = new ImageIcon("rocket.png");

	rocket() {

		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		this.setSize(500, 500);
		this.setLayout(null);// add bounds

		l.setBounds(0, 0, 40, 50);
		l.setBackground(Color.WHITE);
		l.setOpaque(true);
		l.setIcon(icon);
		this.add(l);
//		this.setBackground(Color.BLACK);
		this.getContentPane().setBackground(Color.black);
//		add black color to panel
		this.addKeyListener(this); // this frame
		this.setVisible(true);
	}

	@Override
	public void keyTyped(KeyEvent e) {
//		key typed - invoked when a key is typed. uses keychar, char output
		switch (e.getKeyCode()) {
		case 37:
			l.setLocation(l.getX() - 10, l.getY());

		case 38:
			l.setLocation(l.getX(), l.getY() - 10);

		case 39:
			l.setLocation(l.getX() + 10, l.getY());

		case 40:
			l.setLocation(l.getX(), l.getY() + 10);
			break;

		}

	}

	@Override
	public void keyPressed(KeyEvent e) {
//		keypressed - invoked when a physical key is pressed down. uses key c
		// use keycode give asci code of keyborad button

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// called whenever a button is released
		System.out.println("You realase key char " + e.getKeyChar());
		System.out.println("You realase key char " + e.getKeyCode());
	}

}
