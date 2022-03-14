import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class DialogBox {

	public static void main(String[] args) {

//		JOptionPane.showConfirmDialog(null, "This is some ", "title", JOptionPane.PLAIN_MESSAGE);
//		JOptionPane.showConfirmDialog(null, "Say hii", "title", JOptionPane.CLOSED_OPTION);
//		JOptionPane.showConfirmDialog(null, "Erroo", "title", JOptionPane.ERROR_MESSAGE);
//		JOptionPane.showConfirmDialog(null, "Information", "title", JOptionPane.INFORMATION_MESSAGE);
//		JOptionPane.showConfirmDialog(null, "No opiton ", "title", JOptionPane.NO_OPTION);
		
		// This is for input
//		String name = JOptionPane.showInputDialog("What is your name");
//		System.out.println(name);
		// show only ok and for error 
//		JOptionPane.showMessageDialog(null, "Chat Terminate", "Error", 0);// Error 
		
		
		// joption menual dialog
//		ImageIcon icon = new ImageIcon("man.png");
//		JOptionPane.showOptionDialog(null, "dialog", " Secret ", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE, icon, null, "sdfd");
//		
		String [] reponses = {"no, your awesome ","thank you "," blush"};
		ImageIcon icon = new ImageIcon ("worker.png");
		JOptionPane.showOptionDialog(null,
				"You are awesome!", 
				"Secrete", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, icon, reponses, 0);
		
		
	}
}
