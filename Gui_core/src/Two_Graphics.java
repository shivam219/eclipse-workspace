import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Two_Graphics {
	public static void main(String[] args) {
		new graphic();

	}
}

class graphic extends JFrame {
	mypanel p = new mypanel();

	graphic() {

		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		this.add(p);
		this.pack();
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}

}

class mypanel extends JPanel{
	ImageIcon icon = new ImageIcon("smile.png");
	mypanel() {
		this.setPreferredSize(new Dimension(500, 500));
	}

	public void paint(Graphics g) {
		Graphics2D tgp = (Graphics2D) g;
		tgp.setStroke(new BasicStroke(5));
		tgp.setPaint(Color.BLUE);
//		tgp.drawLine(0, 0, 500, 500);
//		tgp.drawRect(0,0,100,300);
//		tgp.fill3DRect(0, 0, 200, 200, false);
//		tgp.drawOval(0,0,200,100); // cirle
//		tgp.fillOval(250,250,200,100);
//		tgp.drawArc(0, 0, 100, 100, 180, 180);

//		tgp.fillArc(0, 0, 200, 200, 0, 180);
//		tgp.setPaint(Color.darkGray);
//		tgp.fillArc(0, 0, 200, 200, 180, 180);

		int[] xPoint = { 150, 250, 350 };
		int[] yPoint = { 300, 150, 300 };
//		tgp.setFont(new Font(""));
		tgp.fillPolygon(xPoint, yPoint, 3);
//		tgp.drawImage(icon,0,0,null);
		
		tgp.drawString("shiva", 50, 50);

	}
}
