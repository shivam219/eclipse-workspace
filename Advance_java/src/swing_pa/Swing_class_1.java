
//public class Swing_class_1 {
//	public String name;
//
//	Swing_class_1(String name) {
//		this.name = name;
//		System.out.println("this name " + name);
//	};
//
//	public static void main(String[] args) {
//		Swing_class_1 on = new Swing_class_1("shiva");
//
//	}
//}
package swing_pa;

import java.awt.Dimension;
import java.awt.event.*;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Swing_class_1 {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Button Action");
//		JButton b = new JButton("add");
//		b.setBounds(130, 100, 70, 30);
//		frame.add(b);
//		JComboBox c = new JComboBox();
//		c.setBounds(150, 100, 50, 30);
//		frame.add(c);

		JTextArea ta = new JTextArea();
		ta.setBounds(100, 140, 150, 40);
		JTextField tx = new JTextField();
		tx.setBounds(50, 50, 250, 30);
		JButton b1 = new JButton("Login");
		JButton b2 = new JButton(new ImageIcon("C:\\Users\\Shivam\\Desktop\\email_send_96px.png"));
		JButton b3 = new JButton("find ip addresss");
		b1.setBounds(50, 100, 70, 30);
		b2.setBounds(300, 100, 100, 70);
		b3.setBounds(400, 100, 150, 100);
//		b1.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				ta.setText("welcome");
//			}
//		});
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String host = tx.getText();
					String ip = java.net.InetAddress.getByName(host).getHostAddress();
					ta.setText("ip of " + host + " is " + ip);
				} catch (Exception e2) {
					System.out.println("error");
					e2.printStackTrace();
				}
			}
		});

		frame.add(ta);
		frame.add(b1);
		frame.add(b2);
		frame.add(b3);
		frame.add(tx);
		frame.setMinimumSize(new Dimension(600, 400));// width height

		frame.setLayout(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}