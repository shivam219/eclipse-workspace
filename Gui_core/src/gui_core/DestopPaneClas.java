package gui_core;

import java.awt.BorderLayout;

import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;

public class DestopPaneClas extends JFrame {
	JDesktopPane dp;

	public DestopPaneClas() {
		setBounds(100, 100, 400, 500);
		setDefaultCloseOperation(3);
		setVisible(true);
//		setLayout(null);

		dp = new JDesktopPane();
		add(dp, BorderLayout.CENTER);
		display(dp);
	}

	private void display(JDesktopPane dp2) {
		int numFrames = 3, x = 30, y = 30;
		for (int i = 0; i < numFrames; i++) {
			JInternalFrame ss= new JInternalFrame("Shivam's ",true,true,true,true);
			ss.setBounds(x,y,250,100);
			ss.setDefaultCloseOperation(JInternalFrame.DISPOSE_ON_CLOSE);
			ss.add(new JLabel("I love java"));
			ss.setVisible(true);
			dp.add(ss);
			y+=100;
		}
	}

	public static void main(String[] args) {
		new DestopPaneClas();
	}
}
