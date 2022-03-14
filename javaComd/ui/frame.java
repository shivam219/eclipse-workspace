import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class frame {
	public frame(){
	JFrame f = new JFrame();
	f.setVisible(true);
	f.setLayout(null);
	f.setBounds(100,100,500,400);
	f.setDefaultCloseOperation(3);
	
	ImageIcon icon	= new ImageIcon("chatLael.png");
	Font font = new Font("Arial", Font.PLAIN,20);
	JLabel label1 = new JLabel("hii",icon,JLabel.LEFT); //label.setText("change text");
	label1.setBounds(50,50,400,400);
	label1.setFont(font);
	
	JLabel label2 = new JLabel(icon);
	label2.setBounds(50,210,icon.getIconWidth(),icon.getIconHeight());
	
	JLabel jl3 = new JLabel("HII this shiva");
	jl3.setBounds(50,50,icon.getIconWidth()+100,icon.getIconHeight());
	jl3.setIcon(icon);
	jl3.setFont(font);
	
	//f.add(label1);
//	f.add(label2);
	f.add(jl3);
	
	}public static void main(String [] args){
		new frame();
	}
}