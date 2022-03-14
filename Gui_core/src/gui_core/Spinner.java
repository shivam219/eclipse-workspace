package gui_core;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.SpinnerListModel;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Spinner extends JFrame  implements ChangeListener{
	JSpinner s1, s2, s3;
	SpinnerModel mod1, mod2, mod3;
	JLabel l;

	public Spinner() {
		setBounds(100, 100, 500, 500);
		setDefaultCloseOperation(3);
		setVisible(true);
		setLocationRelativeTo(null);
		setLayout(null);

		String[] arr = { "Jan", "feb", "March" };

		String str = String.valueOf(java.time.Year.now());
		int y = Integer.parseInt(str);
		mod1 = new SpinnerNumberModel(1, 1, 31, 1);
		mod2 = new SpinnerNumberModel(y, y - 100, y, 1);
		mod3 = new SpinnerListModel(arr);

		s1 = new JSpinner(mod1);
		s1.setBounds(100, 20, 100, 50);
		s1.addChangeListener(this);
		s2 = new JSpinner(mod2);
		s2.setBounds(100, 100, 100, 50);
		s3 = new JSpinner(mod3);
		s2.addChangeListener(this);
		s1.addChangeListener(this);
		s3.setBounds(100, 200, 100, 50);
		add(s1);
		add(s2);
		add(s3);
		l = new JLabel();
		l.setBounds(100, 300, 150, 30);
		setDob();
		add(l);

	}

	public void setDob() {  
		
		int date = (Integer) s1.getValue();
		int year = (Integer) s2.getValue();
		String month = (String) s3.getValue();
		l.setText("DOB is" + date + " " + year + " " + month);
	}

	public static void main(String[] args) {
		new Spinner();
	}
 
	public void stateChanged(ChangeEvent e) {
		setDob();
	}
}
