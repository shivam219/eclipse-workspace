package chat;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;
import javax.swing.*;
public class Client implements ActionListener {
	Socket socket;
	BufferedReader in; 
	PrintWriter out;
	String name;
	JTextArea txt;
	JTextField jtf = new JTextField();
	JButton btnSend = new JButton();

	public Client(String name) {
		this.name=name;
		createGUI(); 
		try {
			System.out.println("starting");
			socket = new Socket("localhost", 6666);
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = new PrintWriter(socket.getOutputStream());// write printWriter send socket
			System.out.println(name + "  Online");
		} catch (Exception e) {
		}
		startReading();
	}

	JFrame f;

	public void createGUI() {
		f = new JFrame();
		f.setBounds(870, 70, 500, 500);
		f.setTitle(name);
		f.setVisible(true);
		f.setLayout(null);
		f.setDefaultCloseOperation(f.DISPOSE_ON_CLOSE);
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
		JScrollPane jscoll = new JScrollPane(txt, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
		JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		jscoll.setBounds(50, 50, 350, 350);
		f.add(jscoll);// don't need to apply txt only apply JScrollPane

		f.add(jtf);
		f.add(btnSend);
		f.setResizable(false);
	}

	public void startReading() { // Getting character from bufferReader from Client
		Runnable r1 = () -> {    // thread -- Reading data from bufferReader from Client
			System.out.println("Reader started...");
			try {
				while (flag) { 
					String msg = in.readLine();// throw exception deep : exit
					String exit = msg.substring(msg.indexOf(':') + 2, (msg.indexOf('t') == -1 ? msg.indexOf(':') + 2 : msg.indexOf('t') + 1));
					if (exit.equals("exit")) {
						JOptionPane.showMessageDialog(f, msg.substring(0, msg.indexOf(':'))+" exit" );
						jtf.setText("");
						jtf.setEnabled(false);
						btnSend.setEnabled(false);
						flag = false;
						socket.close();
						break;
					}
					txt.append(msg + "\n");
					if (!flag) {
						break;
					}
				}
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				System.out.println("Connection Close \nReader End");
			}
		};
		new Thread(r1).start(); // ==Thread t1 = new Thread(r1); t1.start();
	}

	static boolean flag = true;

	public void actionPerformed(ActionEvent e) { /// me write message
		if (!jtf.getText().equals("")) {
			txt.append("me" + " :" + jtf.getText() + "\n");// add to text Area
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