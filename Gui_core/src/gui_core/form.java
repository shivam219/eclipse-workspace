package gui_core;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class form {

	public form() {

		JTextArea txt;
		JFrame f = new JFrame();
		f.setBounds(70, 70, 500, 500);
		f.setTitle("Regitstration Form");
		f.setVisible(true);
		f.setLayout(null);
//		f.setResizable(false);
		f.setDefaultCloseOperation(3);
		ImageIcon ic = new ImageIcon("form.png");
		f.setIconImage(ic.getImage());
		Font font = new Font("Arial", Font.BOLD, 17);
		
		JLabel form= new  JLabel("Registration Form");form.setBounds(50,10,130,30);f.add(form);
		JLabel name = new  JLabel("Name's ");name.setBounds(50,50,100,30);f.add(name);
		JTextField inName = new JTextField();inName.setBounds(200,50,100,30);f.add(inName);
		
		JLabel phone = new  JLabel("Phone  ");phone.setBounds(50,100,100,30);f.add(phone);
		JTextField inPhone = new JTextField();inPhone.setBounds(200,100,100,30);f.add(inPhone);
		
		JLabel gender = new  JLabel("Gender ");gender.setBounds(50,150,100,30);f.add(gender);
		JRadioButton male = new JRadioButton("male");male.setBounds(140, 150, 60, 30);f.add(male);
		JRadioButton female = new JRadioButton("female");female.setBounds(200, 150, 75, 30);f.add(female);
		ButtonGroup buG= new ButtonGroup();buG.add(male);buG.add(female);
		JLabel dob = new  JLabel("Date DOB");dob.setBounds(50,200,100,30);f.add(dob);
		JTextField day = new JTextField();day.setBounds(120, 200, 40, 30);f.add(day);
		JTextField month = new JTextField();month.setBounds(200, 200, 40, 30);f.add(month);
		JTextField year= new JTextField();year.setBounds(220, 200, 40, 30);f.add(year);
 
		txt = new JTextArea("hellow world");txt.setBounds(100, 270, 100, 100);f.add(txt);
		
		
		JButton b = new JButton();
		ImageIcon icon = new ImageIcon("submit.png");
		b.setIcon(icon);b.setBackground(Color.WHITE);
		b.setBounds(425,400,50,40);
		f.add(b);
		
	}public static void main(String[] args) {
		new form();
	}
}
