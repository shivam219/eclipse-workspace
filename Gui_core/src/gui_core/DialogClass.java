package gui_core;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class DialogClass extends JFrame {

	public DialogClass() {
		setBounds(100, 100, 400, 500);
		setDefaultCloseOperation(3);
		setVisible(true);
		setLayout(new FlowLayout());
		validate();

		JPanel pl = new JPanel();
		add(pl);
		// so null me add(panel) panel.add(butt); -- not take full space

		JButton b1 = new JButton("HIi");
		b1.addActionListener((e) -> {
			///////////////////////owner "Naem tile "
			JDialog d = new JDialog(this,"Joption");
			d.setSize(200,200);
			d.setVisible(true);
			d.add(new JLabel("This is JDialog"));
		});
		pl.add(b1);
		

	}

	public static void main(String[] args) {
		 new DialogClass();
	}
}
