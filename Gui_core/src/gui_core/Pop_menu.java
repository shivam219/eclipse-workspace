package gui_core;

import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;

public class Pop_menu extends JFrame {
	JPopupMenu pm;
	JMenuItem m1, m2, m3;

	public Pop_menu() {
//		setBounds(100, 100, 500, 500);
		setSize(500,500);
		setDefaultCloseOperation(3);
		setVisible(true);
		setLocationRelativeTo(null);
		setLayout(new FlowLayout());
		
		pm = new JPopupMenu();
		m1 = new JMenuItem("new ");
		m2 = new JMenuItem("open");
		m3 = new JMenuItem("close");
		pm.add(m1);
		pm.add(m2);
		pm.add(m3);
		add(pm);
		pm.show(this, 200, 200);
		addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				if(e.getButton()==MouseEvent.BUTTON3) {
					int x = e.getX();
					int y = e.getY();
					pm.show(Pop_menu.this,200,200);
				}
			}
		});

//      class.this	
//		this.validate();
//		setResizable(false);
	}

	public static void main(String[] args) {
		new Pop_menu();
	}
}
