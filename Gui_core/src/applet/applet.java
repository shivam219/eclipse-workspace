package applet;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JTextField;
public class applet extends JApplet  implements ActionListener{

	JTextField t1 ;
	JButton b1;
	public void init() {
		t1 = new JTextField();
		b1= new JButton("Click");
		t1.setBounds(20,20,100,30);
		b1.setBounds(20,60,50,30);
		add(b1);
		add(t1);
		b1.addActionListener(this);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		t1.setText("button click");		
	}}
/*
<applet code = "applet.class" width="300" height="300"></applet>

*/