import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Grid_layout {
	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
		f.setSize(400, 400);
//		f.setLayout(new GridLayout());
//		set by row and column            
		f.setLayout(new GridLayout(3, 3, 10, 10));// row , col, width ,height

		f.setVisible(true);

		f.add(new JButton("1"));
		f.add(new JButton("2"));
		f.add(new JButton("3"));
		f.add(new JButton("4"));
		f.add(new JButton("5"));
		f.add(new JButton("6"));
		f.add(new JButton("7"));
		f.add(new JButton("8"));
		f.add(new JButton("9"));

	}
}
