package chatapp;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.SocketException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class client extends JFrame implements ActionListener {
	JLabel jlbl;
	JTextArea jta;
	JTextField jtf;
	JButton btnSend;

	Socket socket;
	PrintWriter out;
	BufferedReader in;
	Thread t2;

	public client() {
		joinConnection();
		this.setBounds(750, 180, 400, 450);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);

		jlbl = new JLabel("Client chat");
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

	public void joinConnection() {
		try {
			socket = new Socket("localhost", 6666);
			out = new PrintWriter(socket.getOutputStream());
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void startCommunication() {
		Runnable r2 = () -> {
			try {
				String txt;
				while ((txt = in.readLine()) != null) {
					txt = txt.trim();
					jta.append("Server : " + txt + "\n");
					if (txt.equals("exit")) {
						exitCloseResourceByServer();
						break;
					}
				}

			} catch (IOException e) {
				e.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			}

		};
		t2 = new Thread(r2);
		t2.start();
	}

	private void exitCloseResourceByClient() {
		jta.setEnabled(false);
		jtf.setEditable(false);
		btnSend.setEnabled(false);
		try {
			in.close();
			out.close();
			socket.close();
			JOptionPane.showMessageDialog(this, "Close");
			dispose();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void exitCloseResourceByServer() {
		try {
			jta.setEnabled(false);
			jtf.setEditable(false);
			btnSend.setEnabled(false);
			in.close();
			out.close();
			socket.close();
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
					exitCloseResourceByClient();
				}
				jtf.setText("");// if user just enter space ___ it not be delete in e.getdouce
				jtf.requestFocus();
			}
		}
		jtf.setText("");
	}

	public static void main(String[] args) throws IOException {
		client ob = new client();
	}
}