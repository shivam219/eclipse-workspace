package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

public class RadioButton_demo implements ItemListener ,ActionListener{
	
	public void actionPerformed(ActionEvent e) {
		
	}
	public void itemStateChanged(ItemEvent t) { //item listener for check box
		System.out.println("hii");
		if (t.getSource() == rdbMale) {
			System.out.println("hii");
			if (t.getStateChange() == 1) {
				msg.setText("cpp");
			}
		}
		if (t.getSource() == rdbfeMale) {
			if (t.getStateChange() == 1) {
				msg.setText("java");
			}
		}
	}

	JFrame f;
	JLabel msg;
	JRadioButton rdbMale, rdbfeMale;

	public RadioButton_demo() {

		f = new JFrame("Check box Exam");
		f.setBounds(300, 300, 500, 500);
		f.setVisible(true);
		f.setLayout(null);
		f.setDefaultCloseOperation(3);
		rdbMale = new JRadioButton("CPP");
		rdbMale.setBounds(100, 100, 50, 20);
		f.add(rdbMale);

		rdbfeMale = new JRadioButton("java");
		rdbfeMale.setBounds(200, 100, 50, 20);
		f.add(rdbfeMale);

		msg = new JLabel("hii");
		f.add(msg);
		msg.setBounds(100, 10, 50, 30);
		
		rdbMale.addActionListener(this);
		rdbfeMale.addActionListener(this);
//		rdbMale.addItemListener(this);
//		rdbfeMale.addItemListener(this);
	}

	public static void main(String[] args) {
//		new checkBox();
	}
}
