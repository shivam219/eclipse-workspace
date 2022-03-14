package CloseWindow_apn;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class JoptionPane_Confim extends JFrame {
	public JoptionPane_Confim() {

		setBounds(100, 100, 500, 500);
		setDefaultCloseOperation(3);
		setVisible(true);
		setResizable(false);
		setLayout(new FlowLayout());
		// is null the single button takes whole space
		JButton bPain = new JButton("Plain");
		add(bPain);
		bPain.addActionListener((e) -> {
			int in = JOptionPane.showConfirmDialog(this, "Do you want close", "Close", JOptionPane.YES_NO_OPTION,
					JOptionPane.WARNING_MESSAGE);
			if (in == JOptionPane.YES_OPTION) {
				System.out.println("Yes is select");
			}
			else if (in == JOptionPane.NO_OPTION) {
				System.out.print("No is select ");
			}
			if (in == JOptionPane.CANCEL_OPTION) {
				System.out.print("Cancle is select ");
				System.exit(0);
				 
			}

		});

		JButton bErr = new JButton("Erroe Msg");
		add(bErr);
		bErr.addActionListener((e) -> {
			JOptionPane.showMessageDialog(this, "Fist Option Pan", "s", JOptionPane.ERROR_MESSAGE);
		});

	}

	public static void main(String[] args) {
		new JoptionPane_Confim();
	}
}
