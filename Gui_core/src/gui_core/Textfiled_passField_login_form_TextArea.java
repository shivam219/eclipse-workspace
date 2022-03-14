package gui_core;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Textfiled_passField_login_form_TextArea implements ActionListener{ 
	JFrame f = new JFrame();
	JTextField jtf = new JTextField();
	public Textfiled_passField_login_form_TextArea() {
		f.setTitle("Shivam change");
		jtf.setBackground(Color.BLACK);
		jtf.setForeground(Color.white);
		jtf.setEditable(false);
		jtf.setText("linuex terinaly");
		jtf.setSelectedTextColor(Color.GREEN);
		jtf.setBounds(100, 100, 100, 50);
		jtf.addActionListener(this);
		f.setBounds(300, 100, 500, 400);
		f.setVisible(true);
		f.setLayout(null);
		f.setDefaultCloseOperation(3);
		f.add(jtf);
	}

    public void actionPerformed(ActionEvent e) {
    	jtf.setText( jtf.getText().toUpperCase());
	}
	public static void main(String[] args) {
		new Textfiled_passField_login_form_TextArea();
	}

}

class TextPass {
	public TextPass() {
		JFrame f = new JFrame();
		f.setBounds(300, 100, 500, 400);
		f.setVisible(true);
		f.setLayout(null);
		f.setDefaultCloseOperation(3);
		Container c = f.getContentPane();
		JPasswordField pass = new JPasswordField();
		pass.setText("1224521452");
		pass.setEchoChar('a');
		pass.setBounds(50, 100, 105, 30);
		pass.setFont(new Font("Arial", Font.PLAIN, 15));
		c.add(pass);
		pass.setEchoChar((char) 0);

	}

	public static void main(String[] args) {
		new TextPass();
	}
}

class login extends JFrame implements ActionListener {
	Container c;

	public login() {
		c = this.getContentPane();
		setBounds(100, 100, 500, 400);
		setResizable(false);setTitle("ss");
		setVisible(true);
		setLayout(null);
		setDefaultCloseOperation(3);
		JLabel user = new JLabel("User_name");user.setBounds(100, 100, WIDTH, HEIGHT);
		JLabel pass = new JLabel("Pass_word");
		JButton b1 = new JButton("Login");
		
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println(user.getText()  + "\n " + pass.getText());
			}
		});
		add(b1);add(user);add(pass);
	}

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
	}
	public static void main(String[] args) {
		new login();
	}
}

class TextAreaaa extends JFrame implements ActionListener{
	Container c ;JTextArea jta ;
	public TextAreaaa() {
		c = this.getContentPane();
		setBounds(100, 100, 500, 500);
		setResizable(false);setTitle("ss");
		setVisible(true);
		setLayout(null);
		setDefaultCloseOperation(3);
		jta = new  JTextArea();jta.setBounds(100, 50, 300, 200);
		jta.setLineWrap(true);
		jta.setFont(new Font("Arial",Font.BOLD,14));
		JButton b = new  JButton("add data");b.setBounds(200,400,50,30);
		add(b);add(jta);
		b.addActionListener(this);//this class has implements actionPermed
		
	}
	public void actionPerformed(ActionEvent e) {
		String s = "three way to interface is implents two enner class three lamda";
		jta.setText(jta.getText() +  "\n"+ s);
		System.out.println("Button click");
	}
	public static void main(String[] args) {
		new TextAreaaa();
	}
}

