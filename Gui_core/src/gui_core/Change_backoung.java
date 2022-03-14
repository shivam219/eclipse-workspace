package gui_core;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Change_backoung extends JFrame implements ActionListener{
	public static Container c ;
	JButton b1 = new JButton("black!!");
	JButton b2 = new JButton("whilte !!");
	JButton b3 = new JButton("yellow!!");
	public Change_backoung() {
		c = this.getContentPane();
		setBounds(100,100,500,400);
		setResizable(false);
		setVisible(true);
		setLayout(null);
		setDefaultCloseOperation(3);
		
		b1.setBounds(100,100,100,50);
		b2.setBounds(100,200,100,50);
		b3.setBounds(100,300,100,50);
		b1.addActionListener(this);b2.addActionListener(this);b3.addActionListener(this);
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				c.setBackground(Color.BLUE);
			}
		});
		b1.addActionListener(e -> {
		    System.out.println("Handled Lambda listener");
		    System.out.println("Have fun!");
		});
		b1.addActionListener(e -> c.setBackground(Color.red));
		b2.addActionListener(new ActionClass());
		add(b1);add(b2);add(b3);
	}
	public static void main(String[] args) { new Change_backoung();}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b1) {c.setBackground(Color.black);}
		if(e.getSource()==b2) {c.setBackground(Color.white);}
		if(e.getSource()==b3) {c.setBackground(Color.red);}	
	}}
class ActionClass implements ActionListener{
	
	//automactically this action perfrom call by jvm b1.addActionListener(new AcionClass);
	public void actionPerformed(ActionEvent e) {
		Change_backoung.c.setBackground(Color.gray);
	}
	
}
