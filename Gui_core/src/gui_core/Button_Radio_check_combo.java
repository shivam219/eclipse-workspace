package gui_core;

import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;

public class Button_Radio_check_combo {
	public Button_Radio_check_combo() {
		JFrame f = new JFrame();
		f.setBounds(300, 100, 500, 400);
		f.setVisible(true);
		f.setLayout(null);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setResizable(false);
		Font font = new Font("Arial", Font.BOLD, 15);
		JButton b = new JButton("click");
		b.setFont(font);
		f.add(b);
		Cursor cur = new Cursor(Cursor.HAND_CURSOR);
		b.setCursor(cur);
		b.setEnabled(true);
		ImageIcon icon = new ImageIcon("chat.png");
		b.setBounds(200, 50, icon.getIconWidth(), icon.getIconHeight());
		b.setIcon(icon);
		f.setMaximumSize(new Dimension(500, 500));
	}

	public static void main(String[] args) {
		new Button_Radio_check_combo();
	}
}

class Radio extends JFrame {
	public Radio() {
		setBounds(100, 100, 500, 500);
		setResizable(false);
		setLayout(null);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JRadioButton jrb1 = new JRadioButton("Male");
		jrb1.setBounds(50, 100, 100, 30);
		add(jrb1);
		JRadioButton jrb2 = new JRadioButton("FeMale");
		jrb2.setBounds(150, 100, 100, 30);
		add(jrb2);
		jrb2.setSelected(true);
		jrb2.setFont(new Font("Arial", Font.PLAIN, 12));
		// jrb1.setBackground(Color.red);
		jrb1.setForeground(Color.red);
		ButtonGroup gender = new ButtonGroup();
		gender.add(jrb2);
		gender.add(jrb1);
	}

	public static void main(String[] args) {
		new Radio();
	}
}

class CheckBoxClas extends JFrame implements ActionListener {
	Container c;
	JLabel jl;
	JCheckBox jck1 = new JCheckBox("school");
	JCheckBox jck2 = new JCheckBox("Intermidiate");
	JCheckBox jck3 = new JCheckBox("Graduaition");
	JCheckBox jck4 = new JCheckBox("Post-gradute");

	public CheckBoxClas() {
		setBounds(100, 100, 500, 500);
		setResizable(false);
		setLayout(null);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		c = this.getContentPane();
		JButton b1 = new JButton("Click me");
		b1.setBounds(100, 200, 100, 50);
		jck1.setBounds(30, 100, 100, 50);
		jck2.setBounds(200, 100, 100, 50);
		jck3.setBounds(300, 100, 100, 50);
		jck4.setBounds(400, 100, 100, 50);
		jl = new JLabel();
		jl.setBounds(30, 300, 400, 50);
		add(jck1);
		add(jck2);
		add(jck3);
		add(jck4);
		add(jl);
		add(b1);
		b1.addActionListener(this);
		jck1.setSelected(true);
		jck1.setFont(new Font("Arial", Font.PLAIN, 12));
		b1.addActionListener(e -> System.out.println("Handled by Lambda listener"));
		b1.addActionListener(e -> {
		    System.out.println("Handled Lambda listener");
		    System.out.println("Have fun!");
		});
	}

	public void actionPerformed(ActionEvent e) {
		String str = (jck1.isSelected() ? "" + jck1.getText() : " ") + (jck2.isSelected() ? "" + jck2.getText() : " ")
				+ (jck3.isSelected() ? "" + jck3.getText() : " ") + (jck4.isSelected() ? "" + jck4.getText() : "");
		jl.setText(str);
		
	}

	public static void main(String[] args) {
		new CheckBoxClas();
	}

}

class ComboBoxX extends JFrame implements ActionListener {
	Container c ;JTextArea jta ;	JComboBox jc;
	public ComboBoxX() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		String ar[] = { "rama", "Shvia", "Ramesh", "Choudha" };
		jc = new JComboBox(ar);//create top and add later 
		jc.setBounds(50, 400, 100, 30);
		
		add(jc);jc.setSelectedIndex(1);jc.setEditable(true);
		jta = new  JTextArea();jta.setBounds(100, 50, 300, 200);
		jta.setLineWrap(true);jta.setSelectedTextColor(Color.red);
		jta.setFont(new Font("Arial",Font.BOLD,14));

		JButton b = new  JButton("add data");b.setBounds(200,400,90,30);
		add(b);add(jta);
		b.addActionListener(this);
		setBounds(100, 100, 500, 500);
		setResizable(false);
		setLayout(null);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e) {
		String s = (String)jc.getSelectedItem();
		jta.setText(s);
	jc.removeItem("rama");
	jc.remove(0);
		
		}
	public static void main(String[] args) {
		new ComboBoxX();
	}
}