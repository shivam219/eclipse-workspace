package gui_core;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MenuBarclas extends JFrame {
	public MenuBarclas() {
		setBounds(100, 100, 500, 500);
		//setResizable(false);
		setLayout(null);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JMenuBar menubar = new JMenuBar();
		JMenu file = new JMenu("File");
		JMenuItem file1 = new JMenuItem("save");
		JMenuItem file2 = new JMenuItem("exit");
		JMenuItem file3 = new JMenuItem("close");
		file.add(file1);file.add(file2);file.add(file3);
		menubar.add(file);
		setJMenuBar(menubar);
		

	}

	public static void main(String[] args) {
		new MenuBarclas();
	}
}
