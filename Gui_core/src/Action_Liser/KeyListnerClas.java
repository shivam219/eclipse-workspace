package Action_Liser;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class KeyListnerClas extends JFrame implements KeyListener {
	JTextArea typ,press,reles; JTextField jtf;
	public KeyListnerClas() {
		setBounds(100, 100, 500, 500);
		setResizable(false);
		setLayout(null);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jtf = new JTextField();jtf.setBounds(20, 200, 100, 50);add(jtf);
		typ = new JTextArea();typ.setBounds(150,50,100,50);add(typ);
		press = new JTextArea();press.setBounds(150,150,100,50);add(press);
		reles= new JTextArea();reles.setBounds(150,300,100,50);add(reles);
		jtf.addKeyListener(this);
	}

	public static void main(String[] args) {
		new KeyListnerClas();

	}public void keyTyped(KeyEvent e) {
		typ.setText("........");
	}public void keyPressed(KeyEvent e) {
		press.setText("presee");typ.setText("........");
	}public void keyReleased(KeyEvent e) {
		reles.setText("??");typ.setText("");
	
	}
}
