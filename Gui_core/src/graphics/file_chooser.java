package graphics;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class file_chooser implements ActionListener{
	JFileChooser filechooserr;
	public file_chooser() {
		JFrame frame = new JFrame("file chooser");
		frame.setSize(500,500);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(3);
		filechooserr = new JFileChooser();
		JPanel panel = new JPanel();
		frame.add(panel);
		JButton open = new JButton("Open");
		JButton save = new JButton("save");
		panel.add(open);panel.add(save);
		frame.setVisible(false);
		open.addActionListener(this);
		}
	public static void main(String[] args) {
		new file_chooser();
	}
	public void actionPerformed(ActionEvent e) { 
	 int select=filechooserr.showDialog(null, "open my file");//return in value is user open or cancel windo
	 if(select==JFileChooser.APPROVE_OPTION) {
       System.out.println("Select file" +filechooserr.getSelectedFile().getAbsolutePath());
	 }
	 else {
		 System.out.println("canel ");
	 }
	}
}