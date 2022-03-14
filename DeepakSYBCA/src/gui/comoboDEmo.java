package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class comoboDEmo implements ActionListener  {
	
	JFrame f;
	JComboBox cmbCity;
	JLabel lbl;
	JButton show;
	public comoboDEmo() {
		f = new JFrame("City list");
		cmbCity = new JComboBox<>();
		cmbCity.addItem("thane");
		cmbCity.addItem("kalyan");
		cmbCity.addItem("dombivali");
		cmbCity.addItem("diva");
		cmbCity.addItem("karjat");
		cmbCity.setBounds(100, 100, 200, 30);
		
		f.add(cmbCity);
		lbl = new JLabel("");
		lbl.setBounds(400,100,100,30);
		f.add(lbl);
		
		show  = new JButton("show");
		show.setBounds(100,400,200,30);
		f.add(show);	
		show.addActionListener(this);
		
		f.setLayout(null);
		f.setVisible(true);
//		f.setSize(600, 600);
		f.setBounds(500, 100, 500, 600);
		f.setDefaultCloseOperation(3);
	}
	public void actionPerformed(ActionEvent e) {
		String data = (cmbCity.getItemAt(cmbCity.getSelectedIndex())).toString();
		lbl.setText("Select city  "+ data);
	}
	
	public static void main(String[] args) {
		new comoboDEmo();
	}
}
