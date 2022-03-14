package paint;

import java.awt.Color;
import java.awt.Event;
import java.awt.Graphics;

import javax.swing.JComponent;
import javax.swing.JFrame;

public class Jcomponect_clas extends JComponent {
	 @Override
	public void paint(Graphics g) {
		g.setColor(Color.red);
		g.fillRect(10, 10, 200, 100);
	}
	public Jcomponect_clas() {
		JFrame f = new JFrame();
		f.setVisible(true);f.setBounds(300, 10, 400, 400);
		f.setLayout(null);f.setDefaultCloseOperation(3);
		Jcomponect_clas ob = new Jcomponect_clas(); f.add(ob);
	}
	public static void main(String[] args) {
		new Jcomponect_clas();
	}
	
	 public void show() {
		
	}
	
}
