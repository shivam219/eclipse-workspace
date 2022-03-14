package Action_Liser;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;

public class fousListener extends JFrame implements FocusListener ,CaretListener{
	JTextArea txt;
	JTextField jtf;

	public fousListener() {
		setBounds(100, 100, 500, 500);
		setResizable(false);
		setLayout(null);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		txt = new JTextArea();
		txt.setBounds(100, 100, 100, 100);
		add(txt);
		jtf = new JTextField();
		jtf.setBounds(100, 300, 100, 100);
		add(jtf);
		jtf.addFocusListener(this);

	}

	public static void main(String[] args) {
		new fousListener();
		
	}

	public void focusGained(FocusEvent e) {
	txt.setText(txt.getName()+"fousr ga");
	}

	public void focusLost(FocusEvent e) {
		txt.setText(txt.getName()+"fous  lost");
		
	} 
	public void caretUpdate(CaretEvent e) {
	txt.setText(txt.getText()+"caret update");	
	}
}
