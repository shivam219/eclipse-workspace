package gui_core;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class ActionLtion extends JFrame implements ActionListener {
	JLabel lbWord, lbchar;
	JTextArea txtNotepad;
	JButton btnClick;

	public ActionLtion() {
		lbWord = new JLabel();
		lbchar = new JLabel();
		txtNotepad = new JTextArea("hii i love java");
		btnClick = new JButton("click");

		lbWord.setBounds(50, 50, 100, 30);
		lbchar.setBounds(160, 50, 100, 30);
		txtNotepad.setBounds(20, 100, 300, 300);
		btnClick.setBounds(100, 400, 100, 30);

		btnClick.addActionListener(this);
		add(lbchar);
		add(lbWord);
		add(txtNotepad);
		add(btnClick);

		setBounds(100, 100, 500, 500);
		setResizable(false);
		// setSize(400,400);
		setLayout(null);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void actionPerformed(ActionEvent e) {

			String text = txtNotepad.getText();
			String words[] = text.split("\\s");// one by word
			lbWord.setText("Word : " + words.length);
			lbchar.setText("Character : " + text.length());
	
		setBackground(Color.red);
		
	}

	public static void main(String[] args) {
		new ActionLtion();
	}
}

class checkBoxExample {
	checkBoxExample() {
		JFrame f = new JFrame("Check box doem");
		JLabel lbinfo = new JLabel();
		lbinfo.setSize(400, 400);
		JCheckBox cCpp = new JCheckBox("cpp");
		cCpp.setBounds(100, 100, 50, 50);
		JCheckBox cJava = new JCheckBox("java");
		cJava.setBounds(180, 100, 50, 50);
		f.add(lbinfo);
		f.add(cCpp);
		f.add(cJava);
		cCpp.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				lbinfo.setText("cpp checkbox : " + (e.getStateChange() == 1 ? "check" : "cpp is check "));

			}
		});
		cCpp.addItemListener (new ItemListener(){
			public void itemStateChanged(ItemEvent e) {
				lbinfo.setText("cpp checkbox : " +(e.getStateChange()==1 ? "check" :"cpp is check ") );
					
			}
			
		});
		f.setSize(400, 400);
		f.setLayout(null);
		f.setVisible(true);
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);

	}

}
