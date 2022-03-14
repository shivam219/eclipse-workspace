package chat;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;
import javax.swing.*;

public class menu2 implements ActionListener {
//	                   online               online       default  user name     
	JLabel imgLab, jlOnlineStServer, jlOnlineStClient, lblServer, lblClient;
	JTextField jtfServer, jtfClient;
	JButton start, reset, close;

	public menu2() {
		JFrame f = new JFrame();
		f.setBounds(508, 400, 380, 450);
		f.setTitle("Chat 	");
		ImageIcon ic = new ImageIcon("Appicon.png");
		f.setIconImage(ic.getImage());
		f.setVisible(true);
		f.setLayout(null);
		f.setDefaultCloseOperation(3);
		ImageIcon icon = new ImageIcon("chatLabel.png");
		Font userFont = new Font("Arial", Font.BOLD, 15);

		Color userColor = Color.GREEN;
		imgLab = new JLabel("Chatting Application");
		imgLab.setBounds(50, 50, icon.getIconWidth() + 200, icon.getIconHeight());
		imgLab.setIcon(icon);
		imgLab.setFont(new Font("Arial", Font.PLAIN, 20));
		f.add(imgLab);

		jlOnlineStServer = new JLabel("Offline");
		jlOnlineStServer.setBounds(280, 190, 70, 30);
		f.add(jlOnlineStServer);
		jlOnlineStServer.setForeground(Color.red);
		lblServer = new JLabel("User 1");
		lblServer.setBounds(50, 190, 70, 30);
		lblServer.setFont(userFont);
		lblServer.setForeground(userColor);
		f.add(lblServer);
		jtfServer = new JTextField();
		jtfServer.setBounds(150, 190, 100, 30);
		f.add(jtfServer);
		jtfServer.addActionListener((e) -> {
			if (!jtfServer.getText().equals("")) {
				jtfServer.setBackground(Color.LIGHT_GRAY);
				jtfServer.setEditable(false);
				lblServer.setText(jtfServer.getText());
			}
		});

		jlOnlineStClient = new JLabel("Offline");
		jlOnlineStClient.setBounds(280, 240, 70, 30);
		f.add(jlOnlineStClient);
		jlOnlineStClient.setForeground(Color.red);
		lblClient = new JLabel("User 2");
		lblClient.setBounds(50, 240, 110, 30);
		jtfClient = new JTextField();
		jtfClient.setBounds(150, 240, 100, 30);
		lblClient.setFont(userFont);
		lblClient.setForeground(userColor);
		f.add(lblClient);
		f.add(jtfClient);
		jtfClient.addActionListener((e) -> {
			if (!jtfClient.getText().equals("")) {
				jtfClient.setBackground(Color.LIGHT_GRAY);
				jtfClient.setEditable(false);
				lblClient.setText(jtfClient.getText());
			}
		});

		reset = new JButton("Reset");
		reset.setBackground(Color.pink);
		reset.setBounds(50, 300, 70, 40);
		f.add(reset);
		reset.addActionListener((e) -> {
			jtfServer.setEditable(true);
			jtfServer.setText("");
			jtfServer.setBackground(Color.white);
			jtfClient.setEditable(true);
			jtfClient.setText("");
			jtfClient.setBackground(Color.white);
		});
		start = new JButton("Start");
		start.setBackground(Color.white);
		start.setBounds(150, 300, 70, 40);
		f.add(start);
		start.addActionListener((e) -> {
			if (!jtfServer.getText().equals("") && !jtfClient.getText().equals("")) {
				jtfServer.setBackground(Color.LIGHT_GRAY);
				jtfServer.setEditable(false);
				lblServer.setText(jtfServer.getText());
				jlOnlineStServer.setForeground(Color.GREEN);
				jlOnlineStServer.setText("Online");
				jtfClient.setBackground(Color.LIGHT_GRAY);
				jtfClient.setEditable(false);
				lblClient.setText(jtfClient.getText());
				jlOnlineStClient.setForeground(Color.GREEN);
				jlOnlineStClient.setText("Online");
				reset.setEnabled(false);
				start.setEnabled(false);
				startChatting();
			}
		});
		close = new JButton("Close");
		close.setBackground(Color.red);
		close.setBounds(240, 300, 70, 40);
		f.add(close);
		close.addActionListener((e) -> {
			int in = JOptionPane.showConfirmDialog(f, "Do you want close", "Close", JOptionPane.YES_NO_OPTION,
					JOptionPane.WARNING_MESSAGE);
			if (in == JOptionPane.YES_OPTION) {
				System.out.println("Chat app close");
				System.exit(0);
			}
		});
		Cursor cur = new Cursor(Cursor.HAND_CURSOR);
		start.setCursor(cur);reset.setCursor(cur);close.setCursor(cur);
	}
	public void startChatting() {
		Runnable r1 = () -> {
		new Server(lblServer.getText());
		};
		Runnable r2 = () -> {
		 new Client(lblClient.getText());
		};
		Thread t1 = new Thread(r1);
		t1.start();
		Thread t2 = new Thread(r2);
		t2.start();
	}
	public static void main(String[] args) {new menu();}
	public void actionPerformed(ActionEvent e) {}
}