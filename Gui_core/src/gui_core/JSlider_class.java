package gui_core;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class JSlider_class {
	public static void main(String[] args) {
		new slider();
	}
}

class slider extends JFrame implements ChangeListener {
	JFrame f = new JFrame("Slider Gui");
	JPanel p = new JPanel();
	JLabel l = new JLabel();
	JSlider s = new JSlider(0, 100, 25);//
// gui component that lets user enter a value by 
//adjustable sliding knob on a track
	slider() {

		p.add(s);
		p.add(l);
		f.add(p);
		// maiking slid
		s.setSize(new Dimension(400, 200));
		s.setPaintTicks(true);
		s.setMinorTickSpacing(10);// set gap
		s.setPaintTrack(true);
		s.setMajorTickSpacing(25);// set name on gap
		//
		s.setPaintLabels(true);
		s.setFont(new Font("MV Boli", Font.BOLD, 20));
		//
//		s.setOrientation(SwingConstants.HORIZONTAL);
		s.setOrientation(SwingConstants.VERTICAL);//
		
		s.addChangeListener(this);
		
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
		f.setSize(420, 420);

		f.setVisible(true);

	}

	@Override
	public void stateChanged(ChangeEvent e) {
		l.setText("Celsus = " +s.getValue());
	}

}