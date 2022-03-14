package gui_core;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MenuBar {
	public static void main(String[] args) {
		new menu();
	}
}

class menu extends JFrame implements ActionListener {
	JMenuBar mb = new JMenuBar(); // top
	JMenu fm1 = new JMenu("File"); // in list
	JMenu fm2 = new JMenu("Edit");// on under list in single
	JMenu fm3 = new JMenu("Help");

	JMenuItem li = new JMenuItem("load");
	JMenuItem si = new JMenuItem("save");
	JMenuItem ei = new JMenuItem("exit");
	
	ImageIcon loadi= new ImageIcon("chili1.png");
	ImageIcon exiti= new ImageIcon("chili2.png");
	ImageIcon savei= new ImageIcon("chili3.png");
	

	menu() {
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		this.setSize(500, 500);
		this.setLayout(new FlowLayout());
		// addint menu item to parent menu
		fm1.add(li);
		fm1.add(si);
		fm1.add(ei);
		// adding action lister to  menu items
		li.addActionListener(this);
		si.addActionListener(this);
		ei.addActionListener(this);
		
		// setting icon to menu items
		li.setIcon(loadi);
		si.setIcon(savei);
		ei.setIcon(exiti);
		
		// addint click listener
		li.setMnemonic(KeyEvent.VK_L);// l for load
		si.setMnemonic(KeyEvent.VK_S);// s for save
		ei.setMnemonic(KeyEvent.VK_E);// e for exits
//		mb.setBounds(0 ,0,200,50);
		mb.add(fm1);
		mb.add(fm2);
		mb.add(fm3);
		
		fm1.setMnemonic(KeyEvent.VK_F);
		fm2.setMnemonic(KeyEvent.VK_E);// alt tap needed to add
		fm3.setMnemonic(KeyEvent.VK_H);
		
		this.setJMenuBar(mb);
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==li) {
			System.out.println("Item load");
		}
		if(e.getSource()==si)  {// check weather  button is press
			System.out.println("Save Items");
		}
		if(e.getSource()==ei) {
			System.out.println("Exits");
		}
	}	
}