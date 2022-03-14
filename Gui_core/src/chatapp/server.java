package chatapp;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class server extends JFrame implements ActionListener {
	JLabel jlbl;
	JTextArea jta;
	JTextField jtf;
	JButton btnSend;

	ServerSocket server;
	Socket socket;
	PrintWriter out;
	BufferedReader in;
	Thread t1;

	public server() {
		CreateConnection();
		this.setBounds(150, 180, 400, 450);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		jlbl = new JLabel("Server chat");
		jlbl.setBounds(150, 10, 100, 50);
		this.add(jlbl);

		jta = new JTextArea();
		jta.setAlignmentY(JTextArea.BOTTOM_ALIGNMENT);// Bottom appear
		jta.setAlignmentX(JTextArea.LEFT_ALIGNMENT);// left appear
		JScrollPane jscoll = new JScrollPane(jta, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
				JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		jscoll.setBounds(40, 50, 300, 280);
		this.add(jscoll);

		jtf = new JTextField();
		jtf.setBounds(40, 332, 220, 35);
		jtf.addActionListener(this);
		this.add(jtf);

		btnSend = new JButton("Send");
		btnSend.setBounds(262, 332, 75, 34);
		this.add(btnSend);
		btnSend.addActionListener(this);

		this.revalidate();
		this.setResizable(false);
		startCommunication();
	}

	public void CreateConnection() {
		try {
			server = new ServerSocket(6666);
			socket = server.accept();
			out = new PrintWriter(socket.getOutputStream());
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void startCommunication() {

		Runnable r1 = () -> {
			try {
				String txt;
				while ((txt = in.readLine()) != null) {
					txt = txt.trim();
					jta.append("Client : " + txt + "\n");
					if (txt.equals("exit")) {
						exitCloseResourceByClient();
						break;
					}
				}
			} catch (IOException e) {
				e.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			}
		};
		t1 = new Thread(r1);
		t1.start();

	}

	private void exitCloseResourceByServer() {
		jta.setEnabled(false);
		jtf.setEditable(false);
		btnSend.setEnabled(false);
		try {
			in.close();
			out.close();
			socket.close();
			server.close();
			JOptionPane.showMessageDialog(this, "Close");
			dispose();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void exitCloseResourceByClient() {
		try {
			jta.setEnabled(false);
			jtf.setEditable(false);
			btnSend.setEnabled(false);
			in.close();
			out.close();
			socket.close();
			server.close();
			JOptionPane.showMessageDialog(this, "Close");
			dispose();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == jtf || e.getSource() == btnSend) {
			if (!(jtf.getText().isBlank())) {
				jta.append("me     : " + jtf.getText().trim() + "\n");
				out.println(jtf.getText().trim());
				out.flush();
				if (jtf.getText().trim().equals("exit")) {
					exitCloseResourceByServer();
				}
				jtf.setText("");
				jtf.requestFocus();
			}
		}
		jtf.setText("");// if user just enter space ___ it not be delete in e.getdouce
	}

	public static void main(String[] args) {
		server ob = new server();
	}
}