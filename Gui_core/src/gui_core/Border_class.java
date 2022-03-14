package gui_core;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Border_class {
// layout manager == define the natural layout 
// for components within a container

//	3 common managers
	/*
	 * BorderLayout - a BorderLayout place north, south, west,east ,center all extra
	 * space is placed in the center are
	 * --------this is BorderLayout -->Float layout
	 */
	public static void main(String[] args) {
		
		JFrame f = new JFrame();
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
		f.setSize(700, 700);
		f.setLayout(new BorderLayout(10,10));// width ,  
		f.setVisible(true);

		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
		JPanel p3 = new JPanel();
		JPanel p4 = new JPanel();
		JPanel p5 = new JPanel();

		p1.setBackground(Color.red);
		p2.setBackground(Color.green);
		p3.setBackground(Color.yellow);
		p4.setBackground(Color.ORANGE);
		p5.setBackground(Color.blue);

		p1.setPreferredSize(new Dimension(100, 100)); // with and height  is 
		p2.setPreferredSize(new Dimension(50, 100));
		p3.setPreferredSize(new Dimension(100, 100));
		p4.setPreferredSize(new Dimension(50, 100)); 
		p5.setPreferredSize(new Dimension(100, 100));
//		
//		-----sub panel
		JPanel p6 = new JPanel();
		JPanel p7 = new JPanel();
		JPanel p8 = new JPanel();
		JPanel p9 = new JPanel();
		JPanel p10 = new JPanel();

		p6.setBackground(Color.black);
		p7.setBackground(Color.darkGray);
		p8.setBackground(Color.gray);
		p9.setBackground(Color.lightGray);
		p10.setBackground(Color.GREEN);
		
		p5.setLayout(new BorderLayout(5,5));
		p6.setPreferredSize(new Dimension(50, 50));//with and height  is 
		p7.setPreferredSize(new Dimension(50, 50));
		p8.setPreferredSize(new Dimension(50, 50));
		p9.setPreferredSize(new Dimension(50, 50)); 
		p10.setPreferredSize(new Dimension(50, 50));
		
		p5.add(p6,BorderLayout.NORTH);
		p5.add(p7,BorderLayout.WEST);
		p5.add(p8,BorderLayout.EAST);
		p5.add(p9,BorderLayout.SOUTH);
		p5.add(p10,BorderLayout.CENTER);
//------------------end sub panel
		f.add(p1, BorderLayout.NORTH);
		f.add(p2, BorderLayout.WEST);
		f.add(p3, BorderLayout.EAST);
		f.add(p4, BorderLayout.SOUTH);
		f.add(p5, BorderLayout.CENTER);

	}
}
