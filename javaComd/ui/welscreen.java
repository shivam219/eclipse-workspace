

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JFrame;
class  welscreen extends JFrame{

	public welscreen () {
		
		diplayLauncher();
		
		setBounds(100, 100, 500, 500);
		setResizable(false);
		setLayout(null);
		setVisible(true);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		JLabel l = new JLabel("welcome to library");
		l.setHorizontalAlignment(SwingConstants.LEFT);
		add(l);
	}
	public void {
		JWindow w = ew JWindow(this);//pass this of frame naem 
		w.setSize(500,500);
		w.setLocationRelativeTo(null);
		
	}
	public static void main(String[] args) {
		new Welcome_screen_line_eclips();
	}