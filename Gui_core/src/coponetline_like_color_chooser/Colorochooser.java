package coponetline_like_color_chooser;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;

public class Colorochooser {
	public Colorochooser() {

		JFrame f = new JFrame("Color chooser");
		f.setSize(400, 5000);
		f.setDefaultCloseOperation(3);;	
		f.setVisible(true);
		f.setLayout(null);
		
		Container c = f.getContentPane();
		c.setLayout(new GridLayout());
		JButton b1=  new JButton("Choose Color");
		b1.addActionListener((e)->
		{
			Color color =JColorChooser.showDialog(null, "selcet a Color",Color.red);
			c.setBackground(color);
		});
		
	}
	

	public static void main(String[] args) {
		 new Colorochooser();
	}
}
