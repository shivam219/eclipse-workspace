package gui_core;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;

public class Tropdown_List {
	public static void main(String[] args) {
		new trop();
	}
}

class trop extends JFrame implements ActionListener {
	String[] animals = { "dog", "cat", "bird" };
	JComboBox cb = new JComboBox(animals);// it need object only not primitive
	
	trop() {
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		System.out.println(cb.getItemCount());
		cb.insertItemAt("shivam", 0);
		cb.setSelectedIndex(0);
		cb.setEditable(true);
		cb.addActionListener(this);
		cb.setRequestFocusEnabled(true);
		cb.removeAllItems();
//		cb.addItem("deepal");
//		cb.insertItemAt("deepak", 0);
		this.add(cb);
		this.pack();
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == cb) {
			System.out.println(cb.getSelectedItem());
			
		}
	}
}
