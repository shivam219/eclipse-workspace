package gui_core;

import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JProgressBar;

public class ProgessBar extends JFrame {
	public ProgessBar() {

		setBounds(100, 100, 500, 500);
		setDefaultCloseOperation(3);
		setVisible(true);
		setLayout(new FlowLayout());
		JProgressBar jpb = new JProgressBar(0, 100);
		jpb.setBounds(50, 50, 100, 30);
		add(jpb);
		jpb.setStringPainted(true); 
		int i =0 ;
		while(i<=100) {
			if(i>0 && i<50) {
				jpb.setString("processing");
			}
			else if(i>50 && i<80) {
				jpb.setString("processing");
			}
			else {
				jpb.setString("Done !!");
			}
			jpb.setValue(i);
			try {
				Thread.sleep(1000);
			}
			catch (Exception e) {
				
			}
			i=i+10;
		}
	}

	public static void main(String[] args) {
		new ProgessBar();
	}
}
