import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class JPane_class {
	public static void main(String[] args) {
		
		JLabel l = new JLabel();
		l.setText("worker");
		l.setVerticalTextPosition(l.TOP);
		l.setHorizontalTextPosition(l.CENTER);
		ImageIcon icon = new ImageIcon("worker.png");
		l.setIcon(icon);
		
		l.setVerticalAlignment(l.TOP);
		l.setHorizontalAlignment(l.CENTER);
		l.setBounds(0,0,75,75);
		
		JPanel rp = new JPanel();
		rp.setBackground(Color.red);
		rp.setBounds(0,0,100,100);
		rp.setLayout(null);
		
		
		JPanel bp = new JPanel();
		bp.setBackground(Color.blue);
		bp.setBounds(100,0,100,100); // x y width height
		rp.setLayout(null);
		
		
		JPanel gp = new JPanel();
		gp.setBackground(Color.green);
		gp.setBounds(0,100,200,100);// x y width height
		gp.setLayout(new BorderLayout());
		rp.setLayout(null);
	
		
		JFrame f = new JFrame();
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
		f.setSize(400, 400);
		f.setVisible(true);
		f.setLayout(null);
		rp.add(l);
		f.add(rp);
		f.add(bp);
		f.add(gp);

	}
}
