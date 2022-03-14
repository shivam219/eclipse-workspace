package gui_core;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class JLIst_classss extends JFrame {
	String[] item = {"item1","item2","item3","item4"};
	public JLIst_classss() {
		setBounds(100, 100, 500, 500);
//		setResizable(false);
		setLayout(null);
		setVisible(true);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		JList  list = new JList(item);
		list.setVisibleRowCount(5);
		JPanel panel =  new JPanel();
		panel.setVisible(true);
		panel.add(new JScrollPane(list));
		add(panel);
		revalidate();
		list.addMouseListener(new MouseAdapter() {
			public void moussClicked(MouseEvent e) {
				
			}
		});
	}

	public static void main(String[] args) {
 new JLIst_classss();
	}
}
