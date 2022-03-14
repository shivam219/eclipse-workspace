package Action_Liser;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class A_layout_example extends JFrame implements ActionListener,MouseListener{
	Container c ;
	CardLayout cardchange = new CardLayout();JPanel info = new JPanel(cardchange);	
	 public A_layout_example() {
		setBounds(300,70,800,550);
		setVisible(true);
		setDefaultCloseOperation(3);
		setLayout(null);
	
		info.setBorder(BorderFactory.createLineBorder(Color.BLACK,3));info.setBounds(550, 50, 200, 200);add(info);
		JLabel changeBooklabel1 = new JLabel( new ImageIcon("C:\\Users\\Shivam\\Desktop\\library\\book.png"));info.add(changeBooklabel1);
		JLabel changeBooklabel2 = new JLabel( new ImageIcon("C:\\Users\\Shivam\\Desktop\\library\\book.png"));info.add(changeBooklabel2);
		JLabel changeBooklabel3 = new JLabel( new ImageIcon("C:\\Users\\Shivam\\Desktop\\library\\book.png"));info.add(changeBooklabel3);
		add(info);
		this.info.addMouseListener(this);
		revalidate();
	}
	
	public void actionPerformed(ActionEvent e) {
	}	
	public static void main(String[] args) {
		new A_layout_example();
	}
	public void mouseClicked(MouseEvent e) {
//		this.setVisible(false);
	}
	public void mousePressed(MouseEvent e) {}
	public void mouseReleased(MouseEvent e) {}
	public void mouseEntered(MouseEvent e) {
			if(e.getSource()==info) {
				cardchange.next(info);}
			if(e.getSource()==info) {
				cardchange.next(info);}}
	public void mouseExited(MouseEvent e) {}
}
//jta = new JTextArea();jta.setBounds(200, 160, 170, 170);jta.setBorder(BorderFactory.createLineBorder(Color.green,3));add(jta);

//pl.addMouseListener( new MouseAdapter() {
//public void mouseClicked(MouseEvent e) {
//	setVisible(false);
//}
//public void mouseEntered(MouseEvent e) {card.next(pl);}
//
//});