package swing_pa;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Checkbox extends JFrame implements ActionListener {
	JCheckBox cb1;
	JCheckBox cb2;
	JCheckBox cb3;
	JLabel jl;
	JButton jb;
	JTextField jf;

	public Checkbox() {
		jl = new JLabel("welcome to kfc");

		jl.setBounds(50, 30, 330, 30);
		cb1 = new JCheckBox("Checking");
		cb1.setBounds(100, 100, 150, 20);
		cb2 = new JCheckBox("bugger");
		cb2.setBounds(100, 150, 150, 20);
		cb3 = new JCheckBox("Checkie len");
		cb3.setBounds(100, 200, 150, 20);
		jf = new JTextField("press Enter");
		jf.setBounds(250, 250, 50, 30);

		jb = new JButton("order");
		jb.setBounds(100, 250, 80, 30);

		jb.addActionListener(this);

		jf.addActionListener(this);

		add(jf);

		add(jl);
		add(cb1);
		add(cb2);
		add(cb3);
		add(jb);
		setSize(new Dimension(500, 400));
		setLayout(null);
		setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		
		int amount = 0;
		String msg = "";
		if (cb1.isSelected()) {
			amount = +100;
			msg = "chicken leg :200 \n";

		}
		if (cb2.isSelected()) {
			amount = +100;
			msg  = "Chinken Burger : 100 \n";

		}
		if (cb3.isSelected()) {
			amount = +100;
			msg = "chicken";

		}
		msg += " -----------------------\n";

		JOptionPane.showMessageDialog(this, msg + " total amounit" + amount);
//		JOptionPane.getDesktopPaneForComponent(this,msg+"total"+amount);
		jf.addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void keyReleased(KeyEvent e) {
				if (e.getKeyChar() == 10) {
					System.out.println("hii there you have press enter");
				}

			}

			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub

			}
		});

	}

	public static void main(String[] args) {
		new Checkbox();

	}

}
