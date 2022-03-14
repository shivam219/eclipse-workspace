package gui_core;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSlider;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Slider_Test extends JFrame {
	JSlider s ; JLabel l;
	public Slider_Test() {
		setBounds(100, 100, 400, 500);
		setDefaultCloseOperation(3);
		setVisible(true);
		setLayout(null);
		setLayout(new FlowLayout());
		s = new JSlider();//s.setBounds(50, 50, 100, 30);
		add(s);
		s.setMinimum(10);
		s.setMaximum(100);
		
		s.setPaintTrack(true);
		s.setPaintTicks(true);
		s.setPaintLabels(true);
		s.setOrientation(SwingConstants.VERTICAL);
		s.setMajorTickSpacing(25);
		s.setMinorTickSpacing(5);
		l = new JLabel();
		l.setText("The value of slider " +s.getValue());
		add(l);
		s.addChangeListener( new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				l.setText("The value of slider " +s.getValue());
			}
		});
	}

	public static void main(String[] args) {
		new Slider_Test();
	}
}
