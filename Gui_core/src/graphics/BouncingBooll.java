package graphics;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class BouncingBooll extends JPanel  {
	int x =10, y =0,ballWidth =50,ballHeight =50;
	int max_x,max_y;
	public BouncingBooll(int w, int h) {
	this.max_x=w - ballWidth;
	this.max_y =y - ballHeight;
	}
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		g.setColor(Color.red);
		g.fillOval(0, 0,50, 50);
		g.fillOval(max_x, max_y, ballWidth, ballHeight);
		
	}

}
