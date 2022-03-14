import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class Check_class {
	public static void main(String[] args) {
		new myframe1();
	}
}

class myframe1 extends JFrame implements ActionListener {
	JCheckBox cb = new JCheckBox();
	JButton b = new JButton();
	ImageIcon xIcon = new ImageIcon("mark.png");
	ImageIcon cIcon = new ImageIcon("checkmark.png");
	
	myframe1() {
		b.addActionListener(this);
		b.setText("Submit");
		cb.setText("I not robot");
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		cb.setFont(new Font("Consolas",Font.PLAIN,35));
		cb.setFocusable(false);
		
		cb.setIcon(xIcon);
		cb.setSelectedIcon(cIcon);
		this.add(b);
		this.add(cb);
		this.pack();
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==b) {
			System.out.println(cb.isSelected());
		}
		
	}

}