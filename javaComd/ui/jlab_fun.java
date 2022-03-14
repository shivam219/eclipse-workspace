import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class jlab_fun {
	jlab_fun(){
	JFrame f = new JFrame();
	f.setVisible(true);
	f.setLayout(null);
	f.setBounds(100,100,500,400);
	f.setDefaultCloseOperation(3);
	
	ImageIcon icon	= new ImageIcon("chat.png");
	Font font = new Font("Arial", Font.PLAIN,20);
	JTextField jtf = new JTextField();
	jtf.setText("wingtext");
	jtf.setBounds(50,30,100,40);
	jtf.setFont(font);	
	jtf.setForeground(Color.RED);
	jtf.setBackground(Color.BLACK);
	
	f.add(jtf);
	}public static void main(String [] args){
		new frame();
	}

}