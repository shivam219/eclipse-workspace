import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Emogic_class {
	public static void main(String[] args) {
		new emogi();
	}
}

class emogi extends JFrame implements MouseListener {
	JLabel l = new JLabel();
	ImageIcon icon1 = new ImageIcon("smile.png");
	ImageIcon icon2 = new ImageIcon("selfish.png");

	emogi() {

		l.setBounds(50, 50, 400, 400);
//		l.setBackground(Color.red);
		l.setOpaque(true);
		l.addMouseListener(this);
		this.add(l);
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		this.setSize(500, 500);
		this.setLayout(null);// set bounds
		this.setVisible(true);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// invoked when the mouse button has bee
		// clicked (pressed and released) on a component
//		System.out.println("You clicked the mouse");

	}

	@Override
	public void mousePressed(MouseEvent e) {
		// Invoked when a mouse button has been pressed on a component

//		System.out.println("You clicked the mouse");

	}

	@Override
	public void mouseReleased(MouseEvent e) {
//		when a mouse buttun has been released on a componenct

//		System.out.println("You released mouse");
	}

	@Override
	public void mouseEntered(MouseEvent e) {
//		when the mouse enters a component
		l.setIcon(icon1);
	}

	@Override
	public void mouseExited(MouseEvent e) {
//	when the mouse exits a component
		l.setIcon(icon2);
	}
}