package Alibrary;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class AddBook extends JFrame implements ActionListener {
	JLabel bookName, bookCount, bookPrice, title;
	JLabel img;
	Layout L;
	JButton submit, back;;
	JTextField inbookName, inbookPrice, inbookCount;

	public AddBook(Layout L) {
		this.L = L;
		setBounds(370, 10, 500, 500);
		setVisible(true);
		;
		Color c = new Color(13, 13, 13);
		setBackground(c);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setLayout(null);
		title = new JLabel("Add Book Section");
		title.setBounds(120, 0, 260, 60);
		title.setFont(new Font("Arial", Font.BOLD, 30));
		add(title);
		/* Book name */
		bookName = new JLabel("Book Name");
		bookName.setBounds(170, 65, 100, 30);
		add(bookName);
		/* Input for Book Name */
		inbookName = new JTextField("");
		inbookName.setBounds(170, 90, 200, 45);
		add(inbookName);
		inbookName.setFont(new Font("Calibri", Font.BOLD, 20));
		/* Book price */
		bookPrice = new JLabel("Book price");
		bookPrice.setBounds(170, 165, 100, 30);
		add(bookPrice);
		/* input filed for book price */
		inbookPrice = new JTextField();
		inbookPrice.setBounds(170, 190, 100, 37);
		add(inbookPrice);
		inbookPrice.setFont(new Font("Calibri", Font.BOLD, 26));
		/* image */
		/* Count book */
		bookCount = new JLabel("No of book");
		bookCount.setBounds(290, 165, 100, 30);
		add(bookCount);
		/* input filed for book count */
		inbookCount = new JTextField("");
		inbookCount.setBounds(290, 190, 100, 37);
		add(inbookCount);
		inbookCount.setFont(new Font("Calibri", Font.BOLD, 26));
		/* image */
		img = new JLabel(new ImageIcon("C:\\library\\addbook.png"));
		img.setBounds(-20, 80, 200, 200);
		add(img);
		/* submit button */
		submit = new JButton("submit");
		submit.setBounds(215, 265, 90, 40);
		add(submit);
		submit.addActionListener(this);
		submit.setBackground(Color.green);
		submit.setBorderPainted(false);
		/* back button */
		back = new JButton(new ImageIcon("C:\\library\\back.png"));
		back.setBounds(225, 350, 50, 50);
		add(back);
		back.addActionListener(this);
		addWindowListener(backHandle.instance);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == submit) {
			try {
				String str = String.valueOf(inbookName.getText());
				int count = Integer.parseInt(inbookCount.getText());
				int price = Integer.parseInt(inbookPrice.getText());
				boolean b = toOracleData.addNewBook(str, price, count);
				if (b) {
					JOptionPane.showMessageDialog(this, "New Book Added Successfully", "Added Book",
							JOptionPane.INFORMATION_MESSAGE);
				} else {
					JOptionPane.showMessageDialog(this, "Book is Already", "Already book there ",
							JOptionPane.WARNING_MESSAGE);
				}
			} catch (NumberFormatException nu) {
				JOptionPane.showMessageDialog(this,
						"please insert greater then 0 or input number should not be string");
			}
		}
		if (e.getSource() == back) {
			L.setVisible(true);
			this.dispose();
		}
	}
}
