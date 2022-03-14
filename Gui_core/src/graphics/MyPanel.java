package graphics;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class MyPanel extends JPanel {
	public void paint(Graphics g) {
		super.paint(g);
		g.setColor(Color.white);g.setFont(new Font("Arial",Font.BOLD,24));
		g.drawString("shivam", 10, 100); 
		
//		g.drawLine(10, 200, 400, 400);
		
		g.drawRect(200,200,50,50);//it rect it not fill
//		g.fillRect(200,200,50,50); // fill and sefautl color
		
//		g.drawOval(300, 300,30, 30);
//		g.fillOval(300, 300,30, 30);
		
//		g.drawArc(300, 300,30, 30, 0 , 300);
//		g.fillArc(300, 300,30, 30, 0 , 300);
		int[] x = {100,200,300};//spefice horizotal space taken by three vertes
		int[] y = {300,450,200};//speficy vertical spcae takene by three vertecs
		int nPoint = 3;
//		g.drawPolygon(x,y,nPoint);
//		g.fillPolygon(x,y,nPoint);
//		g.drawPolyline(x, y, nPoint);//only bottom line willno display
		String url ="C:\\Users\\Shivam\\Desktop\\library\\gha.jpg";
		Image image = new ImageIcon(url).getImage(); //sendting source file and create object seting to image refence
		
		g.drawImage(image, 10, 50,  200,200, null);
		
		g.clearRect(0, 0, 400, 400);
	
		
		
		
		
		
		
		
	}
}
