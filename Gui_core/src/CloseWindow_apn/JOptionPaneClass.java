package CloseWindow_apn;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class JOptionPaneClass extends JFrame {
	public JOptionPaneClass() {
		setBounds(100, 100, 500, 500);
		setDefaultCloseOperation(3);
		setVisible(true);
		setResizable(false);
		setLayout(new FlowLayout());
		//is null the  single button takes whole space 
		JButton bPain = new JButton("Plain");
		add(bPain);
		bPain.addActionListener((e)-> {
			JOptionPane.showMessageDialog(this, "Fist Option Pan", "s", JOptionPane.PLAIN_MESSAGE);
		});
		
		JButton bErr = new JButton("Erroe Msg");
		add(bErr);
		bErr.addActionListener((e)-> {
			JOptionPane.showMessageDialog(this, "Fist Option Pan", "s", JOptionPane.ERROR_MESSAGE);
		});
		
		JButton bWarn = new JButton("Warning");
		add(bWarn);
		bWarn.addActionListener((e)-> {
			JOptionPane.showMessageDialog(this, "Fist Option Pan", "s", JOptionPane.WARNING_MESSAGE);
		});
		
		JButton bQue =  new JButton("Qeustion");
		add(bQue);
		bQue.addActionListener((e)-> {
			JOptionPane.showMessageDialog(this, "Fist Option Pan", "s", JOptionPane.QUESTION_MESSAGE);
		});
		
		JButton bInfo =  new JButton("Info");
		add(bInfo);
		bInfo.addActionListener((e)-> {
			JOptionPane.showMessageDialog(this, "Fist Option Pan", "s", JOptionPane.INFORMATION_MESSAGE);
		});
		
	}
	public static void main(String[] args) {
		new  JOptionPaneClass();}
}
