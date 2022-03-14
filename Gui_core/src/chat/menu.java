package chat;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class menu implements ActionListener{
	JLabel imgLab,statusUser1, statusUser2,user1, user2;
	JTextField inUser1 ,inUser2;JButton start ,reset,close;
	public menu() {
		JFrame f = new JFrame();
		f.setBounds(508, 400, 380, 450);
		f.setTitle("Chat Application");
		ImageIcon ic = new ImageIcon("Appicon.png");
		f.setIconImage(ic.getImage());
		f.setVisible(true);
		f.setLayout(null);
		f.setDefaultCloseOperation(3);
		ImageIcon icon = new ImageIcon("chatLael.png");
		Font font = new Font("Arial", Font.PLAIN, 20);
		Font userFont = new Font("Arial", Font.BOLD,15 );
		
		Color userColor = Color.GREEN;
		imgLab = new JLabel("Chatting Application");
		imgLab.setBounds(50, 50, icon.getIconWidth() + 200, icon.getIconHeight());
		imgLab.setIcon(icon);
		imgLab.setFont(font);
		f.add(imgLab);
		
		statusUser1= new JLabel("Offline");statusUser1.setBounds(280, 190, 70, 30);f.add(statusUser1);
		statusUser1.setForeground(Color.red);
		user1= new JLabel("User 1");user1.setBounds(50, 190, 70, 30);
		user1.setFont(userFont); user1.setForeground(userColor); f.add(user1);
		inUser1 = new JTextField();inUser1.setBounds(150, 190, 100, 30);
		f.add(inUser1);
		f.validate();
		inUser1.addActionListener((e)->{
				if(!inUser1.getText().equals("")) {
				inUser1.setBackground(Color.LIGHT_GRAY);
				inUser1.setEditable(false);user1.setText(inUser1.getText());
				}});
		
		
		
		statusUser2= new JLabel("Offline");statusUser2.setBounds(280, 240, 70, 30);f.add(statusUser2);
		statusUser2.setForeground(Color.red);
		user2= new JLabel("User 2");user2.setBounds(50, 240, 110, 30);
		inUser2 = new JTextField();inUser2.setBounds(150, 240, 100, 30);
		user2.setFont(userFont); user2.setForeground(userColor); f.add(user2);	
		f.add(inUser2);
		inUser2.addActionListener((e)->{
			if(!inUser2.getText().equals("")) {
			inUser2.setBackground(Color.LIGHT_GRAY);
			inUser2.setEditable(false);user2.setText(inUser2.getText());
			}});
		
		reset= new JButton("Reset");reset.setBackground(Color.pink);reset.setBounds(50, 300, 70, 40);f.add(reset);
		reset.addActionListener((e)->{
		inUser1.setEditable(true);	inUser1.setText("");inUser1.setBackground(Color.white);
		inUser2.setEditable(true);	inUser2.setText("");inUser2.setBackground(Color.white);
		});
		start = new JButton("Start");start.setBackground(Color.white);start.setBounds(150, 300, 70, 40);f.add(start);
		start.addActionListener((e)->{
			if(!inUser1.getText().equals("") && !inUser2.getText().equals("")) {user_1= inUser1.getText();user_2=inUser2.getText();
				inUser1.setBackground(Color.LIGHT_GRAY);inUser1.setEditable(false);user1.setText(inUser1.getText());
				statusUser1.setForeground(Color.GREEN);statusUser1.setText("Online");
				inUser2.setBackground(Color.LIGHT_GRAY);inUser2.setEditable(false);user2.setText(inUser2.getText());
				statusUser2.setForeground(Color.GREEN);statusUser2.setText("Online");
				reset.setEnabled(false);start.setEnabled(false);
				
				Runnable r1 = ()->{
					userchat1.main(new String[]{user1.getText()});
				};
				Runnable r2 = ()->{			
				userchat2.main(new String[]{user2.getText()});
				};
				Thread t1= new Thread(r1);
				t1.start();	
				Thread t2 = new Thread(r2);
				t2.start();
			}
		});
		close = new JButton("Close");close.setBackground(Color.red);close.setBounds(240, 300, 70, 40);f.add(close);
		close.addActionListener((e)->{
			int in = JOptionPane.showConfirmDialog(f, "Do you want close", "Close", JOptionPane.YES_NO_OPTION,
					JOptionPane.WARNING_MESSAGE);
			if (in == JOptionPane.YES_OPTION) {
			System.out.println("Chat app close");
			System.exit(0);
		}});
		Cursor cur = new Cursor(Cursor.HAND_CURSOR);start.setCursor(cur);reset.setCursor(cur);
	}
static String user_1,user_2;
	public static void main(String[] args) {
		new menu();

	}
	public void actionPerformed(ActionEvent e) {
		String [] str = new String[4];
		
	}}