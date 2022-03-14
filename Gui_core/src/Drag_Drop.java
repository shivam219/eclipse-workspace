import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

class Drag_Drop {
	static int a = 10;

	public static void main(String[] args) {
		new drag();

	}
}

class drag extends JFrame {
	dragPane gp = new dragPane();

	drag() {
		this.setTitle("Drage and Drop ");
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		this.setSize(500, 500);
		this.setVisible(true);
	}
}

class dragPane extends JPanel {
	ImageIcon image = new ImageIcon("smile_small.png");
	final int WIDTH = image.getIconWidth();
	final int HEIGHT = image.getIconHeight();
	Point imageCorner;
	Point prevPt;

	public dragPane() {
		imageCorner = new Point(0, 0);
		ClickListener ckl = new ClickListener();
		this.addMouseListener(ckl);

	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		image.paintIcon(this, g, (int) imageCorner.getX(), (int) imageCorner.getY());
	}

	private class ClickListener extends MouseAdapter {
		public void mousePressed(MouseEvent e) {
			prevPt = e.getPoint();
		}

	}

	private class DragListener extends MouseMotionAdapter {
		public void mouseDragged(MouseEvent e) {
			Point currentPt = e.getPoint();
			imageCorner.translate((int) (currentPt.getX() - prevPt.getY()), (int) (currentPt.getY() - prevPt.getY())

			);
			prevPt = currentPt;
			repaint();
		}
	}
}