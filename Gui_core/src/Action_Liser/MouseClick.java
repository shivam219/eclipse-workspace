package Action_Liser;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MouseClick extends JFrame implements MouseListener {
	JTextArea typ,press,reles; JTextField jtf;
 
	public MouseClick() {
		setBounds(100, 100, 500, 500);
		setResizable(false);
		setLayout(null);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jtf = new JTextField();jtf.setBounds(20, 200, 100, 50);add(jtf);
		typ = new JTextArea();typ.setBounds(150,50,100,50);add(typ);
		press = new JTextArea();press.setBounds(150,150,100,50);add(press);
		reles= new JTextArea();reles.setBounds(150,300,100,50);add(reles);
	}

	public static void main(String[] args) {

	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
