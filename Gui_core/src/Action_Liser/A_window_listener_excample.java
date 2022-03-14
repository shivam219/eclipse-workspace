package Action_Liser;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JTextArea;

import Alibrary.backHandle;

public class A_window_listener_excample extends JFrame {
	public A_window_listener_excample() {
		setBounds(190,30,500,450);
		setVisible(true);
		setDefaultCloseOperation(3);
		setLayout(new FlowLayout());
		JTextArea txt = new JTextArea("cool !!!");
		this.addWindowListener(backHandle.instance);
	}
	public static void main(String[] args) {
		new A_window_listener_excample();
	}
}
