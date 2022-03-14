package swing_pa;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;

public class Password {

	public static void main(String[] args) {

		JFrame f = new JFrame();
		JPasswordField pf = new JPasswordField();
		JLabel jl = new JLabel("Password");
		jl.setBounds(20, 100, 50, 30);
		pf.setBounds(100, 100, 100, 30);
		f.add(jl);
		f.add(pf);
		f.setSize(new Dimension(500, 600));
		f.setLayout(null);
		f.setVisible(true);

	}

}
