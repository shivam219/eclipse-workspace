package Action_Liser;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;

public class ItemLiser extends JFrame implements ItemListener {
	JComboBox jcb;
	JTextArea jta;

	public ItemLiser() {
		setBounds(100, 100, 500, 500);
		setResizable(false);
		setVisible(true);
		setLayout(null);
		setDefaultCloseOperation(3);
		String ar[] = { "ramr", "durga", "kumar", "ramesh" };
		jcb = new JComboBox<>(ar);
		jcb.setBounds(50, 300, 100, 50);
		add(jcb);
		jta = new JTextArea();
		jta.setBounds(100, 50, 300, 200);
		add(jta);
		jcb.addItemListener(this);

	}

	public void itemStateChanged(ItemEvent e) {
		jta.setText(jcb.getSelectedItem().toString());
//		jcb.addActionListener(e->{
//			jta.setText(jcb.getSelectedItem().toString());
//		});
//		
//		
	}

	public static void main(String[] args) {
		new ItemLiser();
	}
}

class listener_CheckBx extends JFrame implements ItemListener {
	JTextArea txt;
	JRadioButton male;
	JRadioButton female;

	public listener_CheckBx() {
		setBounds(100, 100, 500, 500);
		setResizable(false);
		setVisible(true);
		setLayout(null);
		setDefaultCloseOperation(3);
		male = new JRadioButton("Male");
		male.setBounds(100, 100, 100, 50);
		female = new JRadioButton("Female");
		female.setBounds(200, 100, 100, 50);
		ButtonGroup gender = new ButtonGroup();
		gender.add(male);
		gender.add(female);
		txt = new JTextArea();
		txt.setBounds(300, 100, 100, 100);
		male.addItemListener(this);
		female.addItemListener(this);

		add(male);
		add(female);
	}

	public void itemStateChanged(ItemEvent e) {
		if (e.getSource() == male) {
			txt.setText(male.getText());
		}
		if (e.getSource() == female) {
			txt.setText(female.getText());
		}
	}

	public static void main(String[] args) {
		new listener_CheckBx();
	}
}

class CheckBoxMenuItemClass extends JFrame implements ItemListener {
	JMenuBar menubar;JMenu menu;JCheckBoxMenuItem jcbmi;JTextArea jta;
	public CheckBoxMenuItemClass() {
		setBounds(100, 100, 500, 500);
		setResizable(false);
		setVisible(true);
		setLayout(null);
		setDefaultCloseOperation(3);
		menubar = new  JMenuBar();
		menu = new JMenu("file");
		jcbmi= new JCheckBoxMenuItem("print");
		menu.add(jcbmi);menubar.add(menu);
		jta = new JTextArea();jta.setBounds(200,200,100,100); add(jta);
		jcbmi.addItemListener(this);
	}

	public void itemStateChanged(ItemEvent e) {
		jta.setText(jcbmi.getText());
	}
	public static void main(String[] args) {
		new CheckBoxMenuItemClass();
	}

}