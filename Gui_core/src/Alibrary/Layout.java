
package Alibrary;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.UIManager;

public class Layout extends JFrame implements MouseListener {
	Container c;
	Font f = new Font("Arial", Font.BOLD, 13);
	CardLayout cardGetBook = new CardLayout();
	JPanel getBook = new JPanel(cardGetBook);
	CardLayout cardReturn = new CardLayout();
	JPanel returnBook = new JPanel(cardReturn);
	CardLayout cardAddBook = new CardLayout();
	JPanel addBook = new JPanel(cardAddBook); //
	CardLayout cardChange = new CardLayout();
	JPanel changeBook = new JPanel(cardChange);
	JLabel info;
	ImageIcon infoimg;
	JLabel close;

	public Layout() {
		setBounds(370, 10, 520, 530);
		setVisible(true);
		setDefaultCloseOperation(3);
		setLayout(null);
		/* get book */
		c = this.getContentPane();
		getBook.setBorder(BorderFactory.createLineBorder(Color.blue, 3));
		getBook.setBounds(50, 50, 150, 150);
		add(getBook);
		JLabel getInfo = new JLabel("Get Book");
		getInfo.setBounds(90, 20, 70, 30);
		getInfo.setFont(f);
		add(getInfo);
		JLabel getBook1 = new JLabel(new ImageIcon("C:\\library\\get1.png"));
		getBook.add(getBook1);
		JLabel getBook2 = new JLabel(new ImageIcon("C:\\library\\get2.png"));
		getBook.add(getBook2);
		add(getBook);
		getBook.addMouseListener(this);
		/* return book */
		returnBook.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY, 3));
		returnBook.setBounds(300, 50, 150, 150);
		add(returnBook);
		JLabel returnInfo = new JLabel("Return Book");
		returnInfo.setBounds(310, 20, 90, 30);
		returnInfo.setFont(f);
		add(returnInfo);
		JLabel iret1 = new JLabel(new ImageIcon("C:\\library\\return1.png"));
		returnBook.add(iret1);
		JLabel iret2 = new JLabel(new ImageIcon("C:\\library\\return2.png"));
		returnBook.add(iret2);
		add(returnBook);
		returnBook.addMouseListener(this);
		/* add book */
		addBook.setBorder(BorderFactory.createLineBorder(Color.green, 3));
		addBook.setBounds(50, 250, 150, 150);
		add(addBook);
		JLabel addInfo = new JLabel("Add Book");
		addInfo.setBounds(90, 220, 80, 30);
		addInfo.setFont(f);
		add(addInfo);
		JLabel addBooklabel1 = new JLabel(new ImageIcon("C:\\library\\add1.png"));
		addBook.add(addBooklabel1);
		JLabel addBooklabel2 = new JLabel(new ImageIcon("C:\\library\\add2.png"));
		addBook.add(addBooklabel2);
		add(addBook);
		addBook.addMouseListener(this);
		/* make some changes */
		changeBook.setBorder(BorderFactory.createLineBorder(Color.red, 3));
		changeBook.setBounds(300, 250, 150, 150);
		add(changeBook);
		JLabel changeInfo = new JLabel("Make Some Changes");
		changeInfo.setBounds(310, 220, 140, 30);
		changeInfo.setFont(f);
		add(changeInfo);
		JLabel changeBooklabel1 = new JLabel(new ImageIcon("C:\\library\\change1.png"));
		changeBook.add(changeBooklabel1);
		JLabel changeBooklabel2 = new JLabel(new ImageIcon("C:\\library\\change2.png"));
		changeBook.add(changeBooklabel2);
		add(changeBook);
		changeBook.addMouseListener(this);
		/* info */
		infoimg = new ImageIcon("C:\\library\\thank.png");
		info = new JLabel(new ImageIcon("C:\\Users\\Shivam\\Desktop\\library\\infoicon.png"));
		info.setBounds(340, 410, 80, 80);
		this.add(info);
		info.addMouseListener(this);

		close = new JLabel(new ImageIcon("C:\\library\\close.png"));
		close.setBounds(60, 410, 80, 80);
		this.add(close);
		close.addMouseListener(this);
	}

	static Layout L;

	public static void main(String[] args) throws Exception {
		String str = "javax.swing.plaf.nimbus.NimbusLookAndFeel";
		UIManager.setLookAndFeel(str);
		L = new Layout();
	}

	public void mouseClicked(MouseEvent e) {
		if (e.getSource() == info) {// info button
			String str = "this is library system develop engineers for \nphysical library to use in real world \nIt capable handle request in rush time.\nAllow add, give, return, and manage\n all this done in via oracle database\n version-1.01.0 ";
			JOptionPane.showMessageDialog(this, str, "info", JOptionPane.PLAIN_MESSAGE, infoimg);
		}
		if (e.getSource() == close) {// close button
			toOracleData.close();
			System.exit(0);
		}
		if (e.getSource() == getBook) {// get book
			this.setVisible(false);
			new GetBook(L);
		}
		if (e.getSource() == returnBook) {// return book
			this.setVisible(false);
			new ReturnBook(L);
		}
		if (e.getSource() == addBook) {// add new book
			this.setVisible(false);
			new AddBook(L);
		}
		if (e.getSource() == changeBook) {// Make change book
			this.setVisible(false);
			new MakeSomeChange(L);
		}
	}

	public void mousePressed(MouseEvent e) {
	}

	public void mouseReleased(MouseEvent e) {
	}

	public void mouseEntered(MouseEvent e) {
		if (e.getSource() == getBook) {
			cardGetBook.next(getBook);
		}
		if (e.getSource() == changeBook) {
			cardChange.next(changeBook);
		}
		if (e.getSource() == returnBook) {
			cardReturn.next(returnBook);
		}
		if (e.getSource() == addBook) {
			cardAddBook.next(addBook);
		}
	}
	public void mouseExited(MouseEvent e) {
		if (e.getSource() == getBook) {
			cardGetBook.next(getBook);
		}
		if (e.getSource() == changeBook) {
			cardChange.next(changeBook);
		}
		if (e.getSource() == returnBook) {
			cardReturn.next(returnBook);
		}
		if (e.getSource() == addBook) {
			cardAddBook.next(addBook);
		}
	}
}
