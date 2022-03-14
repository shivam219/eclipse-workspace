
package swing_pa;

import java.io.*; /// for Buffer or Printwrite 
import java.net.*; // for Socket

import java.awt.*;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

// Sii
public class h extends JFrame {

	private static final long serialVersionUID = 1L;
	Socket socket;
	BufferedReader br;
	PrintWriter out;
	// Declaring conmponent
	private JLabel heading = new JLabel("Siri");
	private JTextArea messegeArea = new JTextArea();
	private JTextField messegeInput = new JTextField();
	private Font font = new Font("Roboto", Font.PLAIN, 20);

	h() {

		try {
			System.out.println("Sending Request to Alexa");
			socket = new Socket("192.168.0.106", 7777); // ip tell computer location ==
			// port no tell computer Server
			// // address

			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			// // get byte data convet- character
			out = new PrintWriter(socket.getOutputStream());// goted data to print

			createGui(); // Create Gui

			handleEvents(); // Handle Event
			startReading(); // function calling
			// startWriting(); // function calling +dont' need gui handle writing
		} catch (Exception e) {
			// e.printStackTrace();
			System.out.println("Connection Close");
		}
	}

	private void createGui() {
		this.setTitle("Messenger");
		this.setMinimumSize(new Dimension(500, 400));
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// coponent text Coding
		heading.setFont(font);
		messegeArea.setFont(font);
		messegeInput.setFont(font);
		heading.setIcon(new ImageIcon("chat_app.png"));
		heading.setHorizontalTextPosition(SwingConstants.CENTER);
		heading.setVerticalTextPosition(SwingConstants.BOTTOM);
		heading.setHorizontalAlignment(SwingConstants.CENTER);
		heading.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));// top, left, bottom, right
		messegeInput.setHorizontalAlignment(SwingConstants.CENTER);
		// Border task
		this.setLayout(new BorderLayout());
		// Adding element
		messegeArea.setEditable(false);
		this.add(heading, BorderLayout.NORTH);
		JScrollPane jScrollPane = new JScrollPane(messegeArea);
		this.add(jScrollPane, BorderLayout.CENTER);
		this.add(messegeInput, BorderLayout.SOUTH);
		this.setVisible(true);
	}

	private void handleEvents() {
		messegeInput.addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {

			}

			@Override
			public void keyPressed(KeyEvent e) {

			}

			@Override
			public void keyReleased(KeyEvent e) {
				System.out.println("Key :" + e.getKeyCode());
				if (e.getKeyChar() == 10) {
					String textToSend = messegeInput.getText();
					messegeArea.append("Me :" + textToSend + "\n");// 1
					out.println(textToSend); // print Server window
					out.flush(); // print Server window
					messegeInput.setText("");
					messegeInput.requestFocus();
				}

			}

		});
	}

	public void startReading() { // Getting character from bufferReader from Server

		Runnable r1 = () -> { // thread -- Reading data from bufferReader from Server
			System.out.println("Alexa online");// Reader started...
			try {
				while (true) { // infinite time read == while(true)
					String msg;

					msg = br.readLine();// assigning msg to == string

					if (msg.equals("exit")) {

						// System.out.println("Server Close the chat");
						JOptionPane.showMessageDialog(this, "Alexa Close The Chat");
						messegeInput.setEnabled(false);
						socket.close();
						break;
					}
					// System.out.println("Server : " + msg); // printing msg in Client Side
					messegeArea.append("Alexa :" + msg + "\n");
				}

			} catch (Exception e) {

				System.out.println("Connection Close");// 1
				// e.printStackTrace(); //2
				// print error in terminal
			}
		};
		new Thread(r1).start();// starting Thread

	}

	public static void main(String[] args) {
		new h();
	}
}