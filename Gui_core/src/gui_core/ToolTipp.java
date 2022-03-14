package gui_core;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class ToolTipp extends JFrame {
	public ToolTipp() {
		setBounds(100, 100, 500, 500);
		setDefaultCloseOperation(3);
		setVisible(true);
		setLayout(null);
		JLabel l = new JLabel("password");
		l.setBounds(50, 100, 80, 30);
		add(l);
		String str = "<html>" 
				+ "<div bgcolor='#800080' color='#ffffffff';>Enter your name<br/>"
				+ "Paswwrod should atlest 8 long"
				+ "</div></html>";

		JTextField jtf = new JPasswordField();
		jtf.setBounds(150, 100, 100, 30);
		add(jtf);
		jtf.setToolTipText("Enter you rnae");;
	}

	public static void main(String[] args) {
			new ToolTipp();
	}
}
