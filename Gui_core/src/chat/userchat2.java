package chat;
//package Beforecaht;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.Border;
public class userchat2  implements ActionListener {
//    private static final long serialVersionUID = 1L;
    Socket socket;
    BufferedReader in;
    PrintWriter out;
    
	JTextArea txt;
	String name ;
	JTextField jtf = new JTextField(); JButton b = new JButton();

	public userchat2(String name) {
		this.name=name;
		createGUI(name);
	try {
		System.out.println("starting");
		socket = new Socket("localhost", 6666);
		in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
	 	out = new PrintWriter(socket.getOutputStream());// write printWriter send socket
	 	System.out.println(name+"  Online");
		}  catch (Exception e) {}
	   startReading();
	}
	JFrame f ;
	public void createGUI(String name){
		f =  new JFrame();
		f.setBounds(870, 70, 500, 500);
		f.setTitle(name);
		f.setVisible(true);
		f.setLayout(null);
//		f.setDefaultCloseOperation(3);
		f.setDefaultCloseOperation(f.DISPOSE_ON_CLOSE);
		ImageIcon ic = new ImageIcon("Appicon.png");
		f.setIconImage(ic.getImage());

		Font font = new Font("Arial", Font.BOLD, 17);
		ImageIcon icon = new ImageIcon("send.png");
		b.setIcon(icon);
		b.setBackground(Color.WHITE);
		b.setBounds(425, 400, 50, 40);

		jtf.setFont(new Font("Arial", Font.BOLD, 14));
		jtf.setBounds(50, 400, 350, 30);
		jtf.addActionListener(this);
		Cursor cur = new Cursor(Cursor.HAND_CURSOR);
		b.setCursor(cur);
		b.addActionListener(this);

		txt = new JTextArea();
		txt.setBounds(50, 50, 300, 300);
		txt.setLineWrap(true);txt.setEditable(false);
		txt.setSelectedTextColor(Color.red);
		txt.setFont(new Font("Arial", Font.BOLD, 14));
		Border border = BorderFactory.createLineBorder(Color.BLUE, 3);
        txt.setBorder(border);
		
		txt.setAlignmentY(JTextArea.BOTTOM_ALIGNMENT);
		txt.setAlignmentX(JTextArea.LEFT_ALIGNMENT);
		JScrollPane jscoll = new JScrollPane(txt,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		jscoll.setBounds(50, 50, 350, 350); f.add(jscoll);//don't need to apply txt only apply  JScrollPane
		
		f.add(jtf);
		f.add(b);
		f.setResizable(false);
	}
    public void startReading() { // Getting character from bufferReader from Client
        Runnable r1 = () -> { // thread -- Reading data from bufferReader from Client
            System.out.println("Reader started...");
            try {
                while (flag) { // infinite time read == while(true)
                    String msg;  msg = in.readLine();//throw exception
                    String exit = msg.substring(msg.indexOf(':')+2, (msg.indexOf('t')==-1? msg.indexOf(':')+2:msg.indexOf('t')+1));                    
                       if (exit.equals("exit")) {
                           JOptionPane.showMessageDialog(f, msg.substring(0, msg.indexOf(':')));
                        jtf.setEnabled(false);b.setEnabled(false);flag=false;
                        socket.close();
                        break; } 
                      txt.append( msg + "\n");
                    if(!flag) { break;}
                }
            } catch (Exception e) {
               e.printStackTrace();
            }
            finally {System.out.println("Connection Close \nReader End");}
        };
        new Thread(r1).start(); //==Thread t1 = new Thread(r1); t1.start();
    }

	static boolean flag =true;
	public void actionPerformed(ActionEvent e) {	///me write message 
		if (!jtf.getText().equals("")) {
				txt.append("me"+" :" +jtf.getText() +"\n");//add to text Area
				out.println(name+" : "+ jtf.getText());out.flush();
				if(jtf.getText().equals("exit")) {flag= false;jtf.setEnabled(false);b.setEnabled(false);
				JOptionPane.showMessageDialog(f, "Your are exit", "Thank you", JOptionPane.PLAIN_MESSAGE);
				}
				jtf.setText("");
				jtf.requestFocus();
			}
	}
	public static void main(String[] args) {
//		new userchat2("Kunal");
		new userchat2(args[0]);
	}
}