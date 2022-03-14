import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Animation_image_cirle {
	public static void main(String[] args) {

		new animation();
	}
}

class animation extends JFrame {
	mypanel1 my;

	animation() {
		my = new mypanel1();
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		this.add(my);// add fram to
		this.pack();
		this.setLocationRelativeTo(null);
		this.setVisible(true);

	}
}

class mypanel1 extends JPanel {
	final int PANEL_WIDTH = 500;
	final int PANEL_HEIGHT=500;
	ImageIcon icon ;
	
	
	mypanel1(){
		
	}
	
}