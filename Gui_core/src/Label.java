import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class Label {
	JLabel l = new JLabel();
	JFrame f = new JFrame();
	Border border = BorderFactory.createLineBorder(Color.green,3);
	ImageIcon icon = new ImageIcon("/image/map.png");
	Label() {
		l.setText("Music player");
		l.setIcon(new ImageIcon(getClass().getResource("/image/imag.jpg")));
		l.setHorizontalTextPosition(l.CENTER); // text set left, center , right
		l.setVerticalTextPosition(l.TOP);// text set top, cent ,bottom
		l.setFont(new Font("MV Boli", Font.PLAIN, 20));
		l.setForeground(new Color(244, 0, 0));// set text color
		l.setIconTextGap(-0);
		l.setBackground(Color.black);// static reference need to use set opec
		l.setOpaque(true);
		l.setBorder(border);
		l.setHorizontalAlignment(l.CENTER);
		l.setVerticalAlignment(l.TOP);
		// frame
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
		f.setSize(400, 400);
		f.setVisible(true);
		f.add(l);
		f.setIconImage(icon.getImage());
//		f.setLayout(null);// if set we need set bound
//		l.setBounds(10,0,250,300);// x , y , width- object , height -object
		f.pack();
		

	}

	public static void main(String[] args) {
		new Label();

	}
}
