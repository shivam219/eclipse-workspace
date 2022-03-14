
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Button_core {
	public Button_core() {
		JFrame f = new JFrame();
		f.setBounds(300, 100, 500, 400);
		f.setVisible(true);
		f.setLayout(null);
		f.setDefaultCloseOperation(3);
		Font font = new Font("Arial", Font.BOLD, 15);
		JButton b = new JButton("click");
		b.setFont(font);
		f.add(b);
		//Cursor cur= new Cursor(Cursor.WAIT_CURSOR);
		//b.setCursor(cur);
		//b.setEnabled(false);
		ImageIcon icon = new  ImageIcon("chat.png");	
		b.setBounds(150,50,icon.getIconWidth(),icon.getIconHeight());
		b.setIcon(icon);
		ImageIcon icon2 = new  ImageIcon("send.png");	
		
		
	}

	public static void main(String[] args) {
		new  Button_core();
	}
}
