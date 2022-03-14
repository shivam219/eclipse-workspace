
package chat;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;
import javax.swing.*;

public class Server implements ActionListener {
	ServerSocket server; // it only for Server
	Socket socket;
	BufferedReader in;
	PrintWriter out;

	JTextArea txt;
	String name;
	JTextField jtf = new JTextField();
	JButton btnSend = new JButton();

	File file;
	BufferedWriter br;

	public Server(String name) {
		this.name = name;
		createGUI();
		try {
			System.out.println("staring");
			server = new ServerSocket(6666);
			socket = server.accept();// this accept data of this server
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = new PrintWriter(socket.getOutputStream());// goted data to print
			System.out.println(name + "Online");
		} catch (Exception e) {
		}
		startReading();
	}

	JFrame f;

	public void createGUI() {
		f = new JFrame();
		f.setBounds(50, 70, 500, 500);
		f.setTitle(name);
		f.setVisible(true);
		f.setLayout(null);
		f.setDefaultCloseOperation(f.DISPOSE_ON_CLOSE);// so don't close menu all other layout
		ImageIcon ic = new ImageIcon("Appicon.png");
		f.setIconImage(ic.getImage());

		Font font = new Font("Arial", Font.BOLD, 17);
		ImageIcon icon = new ImageIcon("send.png");
		btnSend.setIcon(icon);
		btnSend.setBackground(Color.WHITE);
		btnSend.setBounds(425, 400, 50, 40);

		jtf.setFont(new Font("Arial", Font.BOLD, 14));
		jtf.setBounds(50, 400, 350, 30);
		jtf.addActionListener(this);

		Cursor cur = new Cursor(Cursor.HAND_CURSOR);
		btnSend.setCursor(cur);
		btnSend.addActionListener(this);

		txt = new JTextArea();
		txt.setBounds(50, 50, 300, 300);
		txt.setLineWrap(true);
		txt.setEditable(false);
		txt.setSelectedTextColor(Color.red);
		txt.setFont(new Font("Arial", Font.BOLD, 14));

		txt.setAlignmentY(JTextArea.BOTTOM_ALIGNMENT);
		txt.setAlignmentX(JTextArea.LEFT_ALIGNMENT);
		JScrollPane jscoll = new JScrollPane(txt, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		jscoll.setBounds(50, 50, 350, 350);
		f.add(jscoll);// dont need to apply txt hen jscoll pan

		f.add(jtf);
		f.add(btnSend);
		f.setResizable(false);

		try {
			file = new File("chatHisory.txt");
			file.createNewFile();
			br = new BufferedWriter(new FileWriter(file));
		} catch (Exception e) {

		}
	}

	public void startReading() { // Getting character from bufferReader from Client
		Runnable r1 = () -> { // thread -- Reading data from bufferReader from Client
			System.out.println("Reader started...");
			try {
				while (flag) {
					String msg = in.readLine();// throw exception
					String exit = msg.substring(msg.indexOf(':') + 2, (msg.indexOf('t') == -1 ? msg.indexOf(':') + 2 : msg.indexOf('t') + 1));
					if (exit.equals("exit")) {
						JOptionPane.showMessageDialog(f, msg.substring(0, msg.indexOf(':')) +" exit");
						jtf.setText("");
						jtf.setEnabled(false);
						btnSend.setEnabled(false);
						flag = false;
						socket.close();
						break;
					}
					txt.append(msg + "\n");// set to sever window jtf
				}
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				System.out.println("Connection Close \nReader End");
			}
		};
		new Thread(r1).start();// starting Thread
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == jtf || e.getSource() == btnSend) {// Enter ->  and button -> btnSend
			if (!jtf.getText().equals("")) {
				txt.append("me : " + jtf.getText() + "\n");// add to text Area
				out.println(name + " : " + jtf.getText());
				out.flush();
				if (jtf.getText().equals("exit")) {
					flag = false;
					jtf.setEnabled(false);
					btnSend.setEnabled(false);
					JOptionPane.showMessageDialog(f, "Your are exit", "Thank you", JOptionPane.PLAIN_MESSAGE);
				}
				jtf.setText("");
				jtf.requestFocus();
			}
		}
	}

	static boolean flag = true;
}