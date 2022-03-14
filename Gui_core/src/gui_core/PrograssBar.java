package gui_core;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JProgressBar;

public class PrograssBar {

	public static void main(String[] args) {
		new prog();
	}
}

class prog extends JFrame {
	JProgressBar bar = new JProgressBar(0,500);// set minimum , set maximum

	prog() {
		bar.setValue(0);// set default value 
		bar.setBounds(0, 20, 420, 100);
		bar.setBackground(Color.BLACK);
		bar.setForeground(Color.green);
		bar.setStringPainted(true);// add percentag on progress
		bar.setFont(new Font("MV Boli",Font.BOLD,25));
		
		this.add(bar);
		
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		this.setSize(420, 420);
		this.setLayout(null);// set null so create on bouns. flow layout use pack() funtion set
		this.setVisible(true);
		fill();

	}

	public void fill() {
		int c = 0;
		
		while(c <= 100) {
			try {
				Thread.sleep(100);
				
			} catch (Exception e) {
					e.printStackTrace();			}
			bar.setValue(c);
			c += 1;
		}
		bar.setString("Done :)");
	}

}
