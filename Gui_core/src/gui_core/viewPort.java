package gui_core;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Point;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JViewport;

public class viewPort extends JFrame{
	JLabel l ;	JScrollPane scroll ;JViewport viewport ;JButton up,down,left,right;JPanel pal;
	public viewPort() {
		setBounds(330,10,500,500);
		setDefaultCloseOperation(3);
		l= new JLabel( new ImageIcon("C:\\Users\\Shivam\\Desktop\\library\\gha.jpg"));
		scroll= new JScrollPane(l);
		scroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_NEVER);		
		setVisible(true);
		setLayout(new FlowLayout());
		
		scroll.setViewportBorder(BorderFactory.createLineBorder(Color.red));	
		viewport =  scroll.getViewport();
		pal = new JPanel(new FlowLayout());
		up=  new JButton("up");
		down=  new JButton("down");
		left=  new JButton("left");
		right=  new JButton("right"); 
		pal.add(up);pal.add(down);pal.add(left);pal.add(right);
		this.add(pal);
		add(scroll);
		up.addActionListener((e)->{
			Point origin = viewport.getViewPosition();
			Point neworigin = new Point(origin.x,origin.y-100);
			viewport.setViewPosition(neworigin);
		});
		down.addActionListener((e)->{
			Point origin = viewport.getViewPosition();
			Point neworigin = new Point(origin.x,origin.y+100);
			viewport.setViewPosition(neworigin);
		});
		left.addActionListener((e)->{
			Point origin = viewport.getViewPosition();
			Point neworigin = new Point(origin.x-100,origin.y);
			viewport.setViewPosition(neworigin);
		});
		right.addActionListener((e)->{
			Point origin = viewport.getViewPosition();
			Point neworigin = new Point(origin.x+100,origin.y);
			viewport.setViewPosition(neworigin);
		});
		
	}
	public static void main(String[] args) {
		new viewPort();
	}
}
