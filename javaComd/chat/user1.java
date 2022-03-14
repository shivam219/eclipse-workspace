import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
	//f.setSize(new Dimension(500,500));
class user1 implements ActionListener { 
	JTextArea txt;
	JTextField jtf = new JTextField();
	JButton b = new JButton();
	public user1() {
	JFrame f = new JFrame();
	f.setBounds(70, 70, 500, 500);
	f.setTitle("Rahul Chatting");
	f.setVisible(true);
	f.setLayout(null);
	f.setDefaultCloseOperation(3);
	ImageIcon ic = new ImageIcon("Appicon.png");
	f.setIconImage(ic.getImage());

	Font font = new Font("Arial", Font.BOLD, 17);
	ImageIcon icon = new ImageIcon("send.png");
	b.setIcon(icon);b.setBackground(Color.WHITE);
	b.setBounds(425,400,50,40);
	
	jtf.setFont(new Font( "Arial",Font.BOLD,14));
	jtf.setBounds(50,400,350,30);
	jtf.addActionListener(this);
	Cursor cur= new Cursor(Cursor.HAND_CURSOR);
	b.setCursor(cur);
	
	txt = new  JTextArea();txt.setBounds(50, 50, 300, 300);
	txt.setLineWrap(true);txt.setSelectedTextColor(Color.red);
	txt.setFont(new Font("Arial",Font.BOLD,14));
	
	f.add(txt);
	f.add(jtf);
	f.add(b);
	f.setResizable(false);

	
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() ==jtf || e.getSource() == b){
			if(!jtf.getText().equals("")) {
		txt.setText(jtf.getText());jtf.setText("");jtf.getFocusAccelerator();
		}}
		
	}
	public static void main(String [] args){
		new user1();
	}
}