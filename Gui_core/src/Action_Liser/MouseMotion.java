package Action_Liser;

import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class MouseMotion extends JFrame implements MouseMotionListener {
	JTextArea grag,move ; JLabel jtf;
	 
	public MouseMotion() {
		setBounds(100, 100, 500, 500);
		setResizable(false);
		setLayout(null);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jtf = new JLabel("come on");jtf.setBounds(20, 200, 100, 50);add(jtf);
		grag = new JTextArea();grag.setBounds(150,50,100,50);add(grag);
		move = new JTextArea();move.setBounds(150,150,100,50);add(move);
		grag.setAutoscrolls(true);
		jtf.addMouseMotionListener(this);
		}

	public void mouseDragged(MouseEvent e) {
		grag.setText("mouse Drga");
	}

	public void mouseMoved(MouseEvent e) {
		move.setText("mouse move");
		
	}
	public static void main(String[] args) {
		new MouseMotion();
	}
	
}
