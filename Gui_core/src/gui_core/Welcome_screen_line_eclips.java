package gui_core;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JWindow;
import javax.swing.SwingConstants;
import javax.swing.Timer;

public class Welcome_screen_line_eclips extends JFrame {
	
	public Welcome_screen_line_eclips() {
		display();
		setBounds(100, 100, 500, 500);
		setResizable(false);
		setLayout(null);
//		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JLabel l = new JLabel("welcome to library");
		l.setHorizontalAlignment(SwingConstants.CENTER);
		add(l);
	}
	public void display() {
		JWindow w= new  JWindow(this);		
		w.setSize(600,400);
		w.setLocationRelativeTo(null);
		w.setVisible(true);
		
		JPanel panel = new JPanel();
		w.add(panel);
		String imgpath ="ss";
		JLabel label = new JLabel(new ImageIcon(imgpath));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(label);
		panel.setBorder(BorderFactory.createLineBorder(Color.red, 2));
		
		JProgressBar progress  = new JProgressBar(0,100);
		w.add(BorderLayout.PAGE_END,progress);
		progress.setForeground(Color.red);
//		progrss.setStringPainted(true);
		w.revalidate();
		panel.setBorder(BorderFactory.createLineBorder(Color.red));
		
		w.revalidate();
		timer = new Timer(100, (e)->{
			int x = progress.getValue();
			if(x ==10) {
				this.setVisible(true);
				w.dispose();//;dispocse
				timer.stop();
			}
			else progress.setValue(x+4);
		});
		
	}
	Timer timer ;
	public static void main(String[] args) {
		new Welcome_screen_line_eclips();
	}
}

