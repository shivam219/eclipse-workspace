
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;

/*JLayeredPane = swing container that provides a third 
 * dimension for positing components 
 * ex depth,z -index
 * 
 */
public class JLayeredPane_class {
	public static void main(String[] args) {
		JLabel l1 = new JLabel();
		l1.setOpaque(true);// to performing color
		l1.setBackground(Color.red);
		l1.setBounds(50, 100, 200, 200); // X = H ,Y =  V

		JLabel l2 = new JLabel();
		l2.setOpaque(true);// to performing color
		l2.setBackground(Color.green);
		l2.setBounds(100, 100, 200, 200);

		JLabel l3 = new JLabel();
		l3.setOpaque(true);// to performing color
		l3.setBackground(Color.blue);
		l3.setBounds(150, 150, 200, 200);

		JLayeredPane lp = new JLayeredPane();
		lp.setBounds(0, 0, 500, 500);
//		lp.add(l1, JLayeredPane.DEFAULT_LAYER);
//		lp.add(l2, JLayeredPane.DEFAULT_LAYER);
//		lp.add(l3, JLayeredPane.DRAG_LAYER);
		
//		lp.add(l1, JLayeredPane.DEFAULT_LAYER); // add at last last ,
		lp.add(l1, Integer.valueOf(0)); // arranging by number is easy // add at last 
		lp.add(l2, Integer.valueOf(1)); // arranging by number is easy // add at last 
		lp.add(l3, Integer.valueOf(0)); // arranging by number is easy // add at last 
		
		
		JFrame f = new JFrame();
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
		f.setSize(new Dimension(500, 500));
		f.add(lp);
		f.setVisible(true);

	}
}
