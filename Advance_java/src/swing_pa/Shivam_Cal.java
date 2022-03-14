package swing_pa;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

//import java.awt.HeadlessException;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Shivam_Cal extends JFrame implements ActionListener {
	JTextField jt1, jt2, jt3;
	JButton jb1, jb2;

	public Shivam_Cal() {

		JFrame f = new JFrame();
		jt1 = new JTextField();
		jt1.setBounds(50, 50, 100, 30);
		jt2 = new JTextField();
		jt2.setBounds(50, 100, 100, 30);
		jt3 = new JTextField();
		jt3.setBounds(50, 150, 100, 30);

		jb1 = new JButton();
		jb1.setBounds(50, 200, 80, 20);
		jb2 = new JButton();
		jb2.setBounds(50, 200, 80, 20);

		jb1.addActionListener((ActionListener) this);
		jb2.addActionListener((ActionListener) this);

		f.add(jt1);
		f.add(jt2);
		f.add(jt3);
		f.add(jb1);
		f.add(jb2);

		f.setSize(new Dimension(500, 400));
		f.setLayout(null);
		f.setVisible(true);
		f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}

//	public void actionPerformed(ActioEvent e) {
//		String s1 = new jt1.getText();
//		String s2 = new jt2.getText();
//	}

	public static void main(String[] args) {
		new Shivam_Cal();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}