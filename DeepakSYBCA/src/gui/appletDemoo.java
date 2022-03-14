package gui;
//package gui;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class appletDemoo extends  Applet{
	public void paint(Graphics g) {
		g.drawRect(200, 200, 200, 200);
		g.setColor(Color.RED);
		
		g.drawOval(50, 50, 100, 50);
	}
	/*
	 * <applet code="appletDemoo.class" width="400" height="400"> 
	 * </applet>
	 * 
	 */
}
