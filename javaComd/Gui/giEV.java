import java.awt.*;
import javax.swing.*;
import java.awt.event*;
class checkBoxExample {
	checkBoxExample() {
		JFrame f = new JFrame("Check box doem");
		JLabel lbinfo = new JLabel();
		lbinfo.setSize(400, 400);
		JCheckBox cCpp = new JCheckBox("cpp");
		cCpp.setBounds(100, 100, 50, 50);
		JCheckBox cJava = new JCheckBox("java");
		cJava.setBounds(180, 100, 50, 50);
		f.add(lbinfo);
		f.add(cCpp);
		f.add(cJava);
		cCpp.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				lbinfo.setText("cpp checkbox : " + (e.getStateChange() == 1 ? "check" : "cpp is check "));}
		});
		cCpp.addItemListener (new ItemListener(){
			public void itemStateChanged(ItemEvent e) {
			lbinfo.setText("cpp checkbox : " +(e.getStateChange()==1 ? "check" :"cpp is check ") );}
		});
		f.setSize(400, 400);
		f.setLayout(null);
		f.setVisible(true);
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
	}
}
