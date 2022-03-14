package gui_core;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;

public class JInterFrameClass extends JFrame{
	public JInterFrameClass() {
		setBounds(100, 100, 400, 500);
		setDefaultCloseOperation(3);
		setVisible(true);
		setLayout(null);
//		setLayout(new FlowLayout());
		
		JInternalFrame iframe = new JInternalFrame("Internal fram",true,true,true,true);
		initFrame(iframe);
		add(iframe); 
	}
	private void initFrame(JInternalFrame i) {
		i.setLocation(50,50);
		i.setVisible(true);
		i.setSize(300,200);
		i.setLayout(new FlowLayout());
		i.setDefaultCloseOperation(JInternalFrame.DISPOSE_ON_CLOSE);
		i.add(new JButton("Click me"));
	}
	public static void main(String[] args) {
		new JInterFrameClass();
	}
}
