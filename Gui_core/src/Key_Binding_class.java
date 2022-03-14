import java.awt.Color;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.KeyStroke;

public class Key_Binding_class {
	public static void main(String[] args) {
		/*
		 * key bingding -- more difficult then Bing a action to a keystroke don't
		 * require you to click a component to give it focus all swing component use key
		 * bingidng increased flexibily compared to keylistenre can assisgn key strokes
		 * to keylistenre can assign key strokes to individual swing component more
		 * diffifult to utilize and set up
		 */
		new game();
	}
}

class game {
	JFrame f = new JFrame();
	JLabel l = new JLabel();

	Action upAction;
	Action downAction;
	Action leftAction;
	Action rightAction;

	game() {
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
		f.setSize(420, 420);
		f.setLayout(null);

		l.setBackground(Color.red);
		l.setOpaque(true);
		l.setBounds(100, 100, 100, 100);

		// upaction
		upAction = new UpAction();
		downAction = new DownAction();
		leftAction = new LeftAction();
		rightAction = new RightAction();
			// up keyborad up-key // w - use small signle quate 'w'
		l.getInputMap().put(KeyStroke.getKeyStroke('w'), "upAction");
		l.getActionMap().put("upAction", upAction);

		l.getInputMap().put(KeyStroke.getKeyStroke('s'), "downAction");
		l.getActionMap().put("downAction", downAction);

		l.getInputMap().put(KeyStroke.getKeyStroke('a'), "leftAction");
		l.getActionMap().put("leftAction", leftAction);

		l.getInputMap().put(KeyStroke.getKeyStroke('d'), "rightAction");
		l.getActionMap().put("rightAction", rightAction);

		f.add(l);
		f.setVisible(true);
	}

	public class UpAction extends AbstractAction {
		@Override
		public void actionPerformed(ActionEvent e) {
			l.setLocation(l.getX(), l.getY() - 10);
		}

	}

	public class DownAction extends AbstractAction {
		@Override
		public void actionPerformed(ActionEvent e) {
			l.setLocation(l.getX(), l.getY() + 10);
		}

	}

	public class LeftAction extends AbstractAction {
		@Override
		public void actionPerformed(ActionEvent e) {
			l.setLocation(l.getX() - 10, l.getY());
		}

	}

	public class RightAction extends AbstractAction {
		@Override
		public void actionPerformed(ActionEvent e) {
			l.setLocation(l.getX() + 10, l.getY());
		}

	}

}
