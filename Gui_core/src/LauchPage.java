import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class LauchPage implements ActionListener {

	JFrame f = new JFrame();
	JButton b = new JButton("New Widows");

	LauchPage() {

		b.setBounds(100, 160, 200, 200);
		b.setFocusable(true);// highletable is false
		b.addActionListener(this);// this windows click
		
		f.add(b);
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
		f.setSize(420, 420);
		f.setLayout(null);
		f.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == b) {// when button click
			f.disable(); //  deprecated
			
			NewWindow mw = new NewWindow();
			
		}
	}
	public static void main(String[] args) {
		new LauchPage();
	}

}
