package gui_core;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class TabeedPane extends JFrame {
	public TabeedPane() {
		setBounds(100, 100, 500, 500);
		setLayout(null);

		JTabbedPane tp = new JTabbedPane();
		tp.setBounds(50, 50, 250, 200);;
		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
		JPanel p3 = new JPanel();
		JPanel p4 = new JPanel();
		p1.add(new JLabel("java"));tp.add(p1,"java");
		p2.add(new JLabel("cpp"));tp.add(p2,"cpp");
		p3.add(new JLabel("cppp"));tp.add(p3,"cppp");
		p4.add(new JLabel("mcp"));tp.add(p4,"cmp");
		
//		
		add(tp);
		this.validate();
		setVisible(true);
//		setResizable(false);
		setDefaultCloseOperation(3);
	}
	public static void main(String[] args) {
		new TabeedPane();
	}
}
