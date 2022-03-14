package gui_core;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;

public class JFileChooser_Class {
	public static void main(String[] args) {
		new jfile();
		// a gui mechanism that lets's user choose a file
		// default opening and saving
	}
}

class jfile extends JFrame implements ActionListener {

	JButton b = new JButton("Select File");

	jfile() {
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout()); // use pack when working use flowlayout
		b.addActionListener(this);
		this.add(b);
		this.pack();// automatic align component
		this.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == b) {
			JFileChooser fc = new JFileChooser();
//			fc.showOpenDialog(null);//it return 0 when not selected
//			System.out.println(fc.showOpenDialog(null));
			fc.setCurrentDirectory(new File("C:\\Users\\Shivam\\Desktop"));
			int re =  fc.showOpenDialog(null);
			if(re == JFileChooser.APPROVE_OPTION) {
				File file = new File(fc.getSelectedFile().getAbsolutePath());
				System.out.println(file);//
			}
		}

	}
}