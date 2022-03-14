package swing_pa;
// Two to create swing - create object 

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//  by extening 
import javax.swing.JButton;
import javax.swing.JFrame;
// import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class Calucate extends JFrame implements ActionListener {
	JTextField jt1, jt2, jt3;
	JButton jb1, jb2;

	public Calucate() {
		JFrame frame = new JFrame();
		jt1 = new JTextField();
		jt1.setBounds(50, 50, 100, 30);
		jt2 = new JTextField();
		jt2.setBounds(50, 100, 100, 30);
		jt3 = new JTextField();
		jt3.setBounds(50, 150, 100, 30);
		jb1 = new JButton("Add");
		jb1.setBounds(50, 200, 80, 20);
		jb2 = new JButton("Sub");
		jb2.setBounds(120, 200, 80, 20);

		jb1.addActionListener((ActionListener) this);// is interface represtend current class
		jb2.addActionListener((ActionListener) this);// is interface represtend current class

		frame.add(jt1);
		frame.add(jt2);
		frame.add(jt3);
		frame.add(jb1);
		frame.add(jb2);
		frame.setSize(400, 300);
		frame.setLayout(null);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}

	public void actionPerformed(ActionEvent e) {

		String s1 = jt1.getText();
		String s2 = jt2.getText();

		int a = Integer.parseInt(s1);
		int b = Integer.parseInt(s2);

		int c = 0;// complu to intialize
		if (e.getSource() == jb1) {
			c = a + b;
		} else if (e.getSource() == jb2) {
			c = a - b;
		}

		String result = String.valueOf(c);
		jt3.setText(result);

	}

	public static void main(String[] args) {
		new Calucate();
	}

}
