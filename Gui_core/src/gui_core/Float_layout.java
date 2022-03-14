package gui_core;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Float_layout {
	// layout manager == define the natural layout
	// for components within a container

//		3 common managers
	/*
	 * Flowlayout - places components in a row , sized at their preferred size
	 * 	if the horizontal space in container is too small
	 * the flowLayout class uses the next available row
	 * 
	 * 	 
	 * 
	 */
	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
		f.setSize(400, 400);
		f.setLayout(new FlowLayout(FlowLayout.CENTER,10,10));//  width , height
		JPanel p= new JPanel(); 
		p.setPreferredSize(new Dimension(100,250));
		p.setBackground(Color.lightGray);
		p.setOpaque(true);
		p.setLayout(new FlowLayout());
						
						
		
		p.add(new JButton("1"));
		p.add(new JButton("2"));
		p.add(new JButton("3"));
		p.add(new JButton("4"));
		p.add(new JButton("5"));
		p.add(new JButton("6"));
		p.add(new JButton("7"));
		p.add(new JButton("8"));
		p.add(new JButton("9"));
		f.add(p);
		f.setVisible(true);
	}
}
