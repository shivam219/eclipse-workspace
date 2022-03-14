import java.awt.*;
import javax.swing.*;
import java.awt.event*:
class  bur() {
	checkBoxExample(){
		JFrame f = new JFrame("combo box doem");
		JLabel lbinfo = new JLabel();
		
		lbinfo.setSize(400,400);
		
		JCheckBox chk = new JCheckBox("cclick");
		chk.setBounds(100,100,75,50);
		String lang[] = {"java","paython" , "cpp"};
		f.add(chk);
		
		JComboBox cboLang = new JComboBox(lang);
		cboLang.setBounds(50,100,90,200);
		f.add(chk);
		
		
		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
	
		b.addActionListener(new ActionListener()
		{
			public void actionPermed(ActionEvent e ){
				
			}
		};
	}
		
		
}