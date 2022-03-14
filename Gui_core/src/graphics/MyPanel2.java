package graphics;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JPanel;

public class MyPanel2 extends JPanel {
	int x =0 ,y= 0,width= 0,height =100;
	int stepsize =10;int  max_x,max_y;
	public MyPanel2(int w , int h ) {
	this.max_x = w;
	this.max_y = h;
	}
	
	public void paint(Graphics g) {
		super.paint(g);
		g.setColor(Color.white);
		
		g.drawRect(x, y, width, height);
		
		if(x+width>max_x ||x<50) {
			stepsize=-stepsize;
			
		}
		x = x+stepsize; //dynamicall changing change it affect graphics
		///one available write this code in while if block and checnk if it crose 500 the make 0 and 
		//call repaint
		
		
		
		try {Thread.sleep(1000) ;} catch (Exception e) {}
		
		
		repaint();//recursively call 
		
	}
}