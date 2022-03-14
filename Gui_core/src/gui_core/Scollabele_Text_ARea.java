package gui_core;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

//flow the take only defualt space 
//border take only one elememt show based lastly added
public class Scollabele_Text_ARea extends JFrame{
	
	public Scollabele_Text_ARea() {

		setBounds(100, 100, 500, 500);
		setLayout(new FlowLayout());
		
		//horizontal , Vertical
		JTextArea txt = new JTextArea(10,15);
		txt.setAlignmentY(JTextArea.BOTTOM_ALIGNMENT);
		txt.setAlignmentX(JTextArea.LEFT_ALIGNMENT);
		JScrollPane jscoll = new JScrollPane(txt,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		add(jscoll);
		//thi shoulb add kast is best 
		setDefaultCloseOperation(3);
		setVisible(true);
		setResizable(false);
	}
	public static void main(String[] args) {
		new Scollabele_Text_ARea();
	}
}
