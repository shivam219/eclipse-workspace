package CloseWindow_apn;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Called_Jframe_from_another implements ActionListener {
	JFrame f1, f2;
	JLabel label;
	JTextField txt;

	public Called_Jframe_from_another() {
		f1 = new JFrame();
		f1.setBounds(70, 70, 500, 500);
		f1.setTitle("calling");
		f1.setVisible(true);
		f1.setLayout(new FlowLayout());
		f1.setDefaultCloseOperation(3);

		JButton b1 = new JButton("Click");
		label = new JLabel("Message will appear here");
		JPanel panel = new JPanel();
//		panel.setBounds(0, 0, 0, 0);
		panel.add(b1);
		panel.add(label);

		f1.add(panel);
		b1.addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		f1.dispose();
		f2 = new JFrame("Enter Your name ");
		f2.setSize(400, 200);
		f2.setTitle("calling");
		f2.setVisible(true);
		// is write exit on close then all program is close
		f2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		f2.setLocationRelativeTo(f1);
		f2.setLayout(new FlowLayout());

		txt = new JTextField();
		txt.setColumns(20);// set 20 character
		JButton b2 = new JButton("Click");

		JPanel panel2 = new JPanel();
		panel2.add(txt);
		panel2.add(b2);
		f2.add(panel2);

		b2.addActionListener(l -> {
			f1.setVisible(true);
			label.setText(txt.getText());
			f2.dispose();// interla f2 sevivisble false
		});
	}

	public static void main(String[] args) {
		new Called_Jframe_from_another();
	}

}
