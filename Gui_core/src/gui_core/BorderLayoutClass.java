package gui_core;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderLayoutClass extends JFrame {
	public BorderLayoutClass() {
		setBounds(100, 100, 500, 500);
		setDefaultCloseOperation(3);
		setVisible(true);
		setResizable(false);
//		setLayout(BorderLayout);
		BorderLayout bl = new BorderLayout();
		JButton b1 = new JButton("page-start");
		JButton b2 = new JButton("page-end ");
		JButton b3 = new JButton("line-start");
		JButton b4 = new JButton("center ");
		JButton b5 = new JButton("line end");
		setLayout(bl);
		add(b1, BorderLayout.PAGE_START);
		add(b2, BorderLayout.PAGE_END);
		add(b3, BorderLayout.LINE_START);
		add(b4, BorderLayout.CENTER);
		add(b5, BorderLayout.LINE_END);

	}

	public static void main(String[] args) {
		new BorderLayoutClass();
	}
}

class FlowLayoutClass extends JFrame {
	public FlowLayoutClass() {
		setBounds(100, 100, 500, 500);
		setDefaultCloseOperation(3);
		setVisible(true);
		setResizable(false);
		FlowLayout bl = new FlowLayout(FlowLayout.CENTER, 10, 20);
		setLayout(bl);

		JButton b1 = new JButton("page-start");
		add(b1, 2);
		JButton b2 = new JButton("page-end ");
		add(b2);
		JButton b3 = new JButton("line-start");
		add(b3);
		JButton b4 = new JButton("center ");
		add(b4);
		JButton b5 = new JButton("line end");
		add(b5);

	}

	public static void main(String[] args) {
		new FlowLayoutClass();
	}
}

class GridLayoutClass extends JFrame {
	public GridLayoutClass() {
		setBounds(100, 100, 500, 500);
		setDefaultCloseOperation(3);
		setVisible(true);
		setResizable(false);
//									row-2 colw-3 item Vgap & Hgap
		GridLayout g = new GridLayout(2, 3, 10, 20);
		setLayout(g);
		JButton b1 = new JButton("Button 1 ");
		add(b1);
		JButton b2 = new JButton("Button 2 ");
		add(b2);
		JButton b3 = new JButton("Button 3 ");
		add(b3);
		JButton b4 = new JButton("Button 4 ");
		add(b4);
		JButton b5 = new JButton("Button 5 ");
		add(b5);
	}

	public static void main(String[] args) {
		new GridLayoutClass();
	}
}

class CardLayoutClass extends JFrame {
	public CardLayoutClass() {
		setBounds(100, 100, 500, 500);
		setDefaultCloseOperation(3);
		setVisible(true);
		setResizable(false);
		//cannot apply to frame 
		Container c= this.getContentPane();
		CardLayout card = new CardLayout();
		this.setLayout(card);
		JButton b1 = new JButton("Button 2 ");add(b1,"1");
		JButton b2 = new JButton("Button 2 ");add(b2,"2");
		JButton b3 = new JButton("Button 3 ");add(b3,"3");
		JButton b4 = new JButton("Button 4 ");add(b4,"4");
		card.next(c);//this is valid use container 
		card.last(c);
		card.next(c);
		
		
	}
	public static void main(String[] args) {
		new CardLayoutClass();
	}
}
class BoxLayoutClass  extends JFrame  {
	public BoxLayoutClass() {
		setBounds(100, 100, 500, 500);
		setDefaultCloseOperation(3);
		setVisible(true);
		setResizable(false);
		Container c = this.getContentPane();
//		BoxLayout boxla = new BoxLayout(c, MAXIMIZED_BOTH)
		
	}
	public static void main(String[] args) {
		
	}
}
